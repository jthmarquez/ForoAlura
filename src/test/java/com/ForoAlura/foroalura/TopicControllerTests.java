package com.ForoAlura.foroalura;

import com.ForoAlura.foroalura.controller.TopicController;
import com.ForoAlura.foroalura.model.Topic;
import com.ForoAlura.foroalura.service.TopicService;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TopicController.class)
public class TopicControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TopicService topicService;

    @Test
    public void testObtenerTopico() throws Exception {
        Long topicoId = 1L;
        Topic topic = new Topic();
        topic.setId(topicoId);
        topic.setTitle("Título del tópico");
        topic.setContent("Contenido del tópico");

        when(topicService.obtenerTopicoPorId(topicoId)).thenReturn(topic);

        mockMvc.perform(get("/topicos/{id}", topicoId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(topicoId.intValue())))
                .andExpect(jsonPath("$.title", is("Título del tópico")))
                .andExpect(jsonPath("$.content", is("Contenido del tópico")));
    }
}
