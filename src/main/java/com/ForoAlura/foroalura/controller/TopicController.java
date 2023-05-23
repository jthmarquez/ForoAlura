package com.ForoAlura.foroalura.controller;

import com.ForoAlura.foroalura.model.Respuesta;
import com.ForoAlura.foroalura.model.Topic;
import com.ForoAlura.foroalura.model.User;
import com.ForoAlura.foroalura.service.TopicService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicController {

    @GetMapping("/{id}")
    public ResponseEntity<Topic> obtenerTopico(@PathVariable Long id) {
        // Lógica para obtener el tópico con el ID proporcionado
        Topic topic = TopicService.obtenerTopicPorId(id);

        if (topic != null) {
            return ResponseEntity.ok(topic);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Topic> crearTopic(@RequestBody Topic topic) {
        // Lógica para crear un nuevo tópico con los datos proporcionados
        Topic nuevoTopic = TopicService.crearTopic(topic);

        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoTopic);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTopic(@PathVariable Long id) {
        // Lógica para eliminar el tópico con el ID proporcionado
        TopicService.eliminarTopic(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/usuario")
    public ResponseEntity<User> obtenerUsuario(@PathVariable Long id) {
        // Lógica para obtener el usuario asociado al tópico con el ID proporcionado
        User user = userService.obtenerUsuarioPorTopicId(id);

        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}/respuestas")
    public ResponseEntity<List<Respuesta>> obtenerRespuestas(@PathVariable Long id) {
        // Lógica para obtener las respuestas asociadas al tópico con el ID proporcionado
        List<Respuesta> respuestas = respuestaService.obtenerRespuestasPorTopicId(id);

        if (!respuestas.isEmpty()) {
            return ResponseEntity.ok(respuestas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    private static class userService {

        private static User obtenerUsuarioPorTopicId(Long id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public userService() {
        }
    }
}
