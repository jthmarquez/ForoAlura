package com.ForoAlura.foroalura.service;

import com.ForoAlura.foroalura.model.Respuesta;
import com.ForoAlura.foroalura.repository.RespuestaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaService {
    private final RespuestaRepository respuestaRepository;

    @Autowired
    public RespuestaService(RespuestaRepository respuestaRepository) {
        this.respuestaRepository = respuestaRepository;
    }

    public Optional<Respuesta> obtenerRespuestasPorTopicoId(Long topicoId) {
        // Lógica para obtener las respuestas por el ID del tópico utilizando el repositorio
        return respuestaRepository.findById(topicoId);
    }

    public void eliminarRespuesta(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Respuesta actualizarRespuesta(Long id, Respuesta respuesta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Respuesta crearRespuesta(Respuesta respuesta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Respuesta obtenerRespuestaPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Respuesta> obtenerRespuestas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

