package com.ForoAlura.foroalura;

import com.ForoAlura.foroalura.model.Topic;
import com.ForoAlura.foroalura.repository.TopicRepository;
import com.ForoAlura.foroalura.service.TopicService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TopicServiceTests {
    
    @Mock
    private TopicRepository topicRepository;

    @InjectMocks
    private TopicService topicService;

    @Test
    public void testCrearTopico() {
        Topic topic = new Topic();
        topic.setTitle("Título del tópico");
        topic.setContent("Contenido del tópico");

        when(topicRepository.save(topic)).thenReturn(topic);

        Topic nuevoTopico = topicService.crearTopico(topic);

        assertNotNull(nuevoTopico);
        assertEquals("Título del tópico", nuevoTopico.getTitle());
        assertEquals("Contenido del tópico", nuevoTopico.getContent());

        verify(topicRepository, times(1)).save(topic);
    }
}
