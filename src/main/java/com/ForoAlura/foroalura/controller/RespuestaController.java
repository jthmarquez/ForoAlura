package com.ForoAlura.foroalura.controller;

import com.ForoAlura.foroalura.model.Respuesta;
import com.ForoAlura.foroalura.service.RespuestaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {

    private final RespuestaService respuestaService;

    @Autowired
    public RespuestaController(RespuestaService respuestaService) {
        this.respuestaService = respuestaService;
    }

    @GetMapping
    public List<Respuesta> obtenerRespuestas() {
        return respuestaService.obtenerRespuestas();
    }

    @GetMapping("/{id}")
    public Respuesta obtenerRespuestaPorId(@PathVariable Long id) {
        return respuestaService.obtenerRespuestaPorId(id);
    }

    @PostMapping
    public Respuesta crearRespuesta(@RequestBody Respuesta respuesta) {
        return respuestaService.crearRespuesta(respuesta);
    }

    @PutMapping("/{id}")
    public Respuesta actualizarRespuesta(@PathVariable Long id, @RequestBody Respuesta respuesta) {
        return respuestaService.actualizarRespuesta(id, respuesta);
    }

    @DeleteMapping("/{id}")
    public void eliminarRespuesta(@PathVariable Long id) {
        respuestaService.eliminarRespuesta(id);
    }
}



