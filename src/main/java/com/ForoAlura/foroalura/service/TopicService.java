package com.ForoAlura.foroalura.service;

import com.ForoAlura.foroalura.model.Topic;
import com.ForoAlura.foroalura.repository.TopicRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    private final TopicRepository topicRepository;

    @Autowired
    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public List<Topic> obtenerTodosLosTopics() {
        // Lógica para obtener todos los tópicos utilizando el repositorio
        return topicRepository.findAll();
    }

    public Topic obtenerTopicPorId(Long id) {
        // Lógica para obtener un tópico por su ID utilizando el repositorio
        return topicRepository.findById(id).orElse(null);
    }

    public Topic crearTopic(Topic topic) {
        // Lógica para crear un nuevo tópico utilizando el repositorio
        return topicRepository.save(topic);
    }

    public void eliminarTopic(Long id) {
        // Lógica para eliminar un tópico por su ID utilizando el repositorio
        topicRepository.deleteById(id);
    }

    public List<Topic> buscarTopicsPorTitulo(String titulo) {
        // Lógica para buscar tópicos por título utilizando el repositorio
        return topicRepository.findByTitleContaining(titulo);
    }

    // Agrega más métodos según tus necesidades de negocio

    // Resto del código

    public Topic crearTopico(Topic topic) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


