package com.ForoAlura.foroalura;

import com.ForoAlura.foroalura.model.Respuesta;
import com.ForoAlura.foroalura.repository.RespuestaRepository;
import com.ForoAlura.foroalura.service.RespuestaService;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RespuestaServiceTests {
    
    @Mock
    private RespuestaRepository respuestaRepository;

    @InjectMocks
    private RespuestaService respuestaService;

    @BeforeEach
    public void setUp() {
        // Configurar el comportamiento de los mocks (si es necesario)
    }

    @Test
    public void obtenerRespuestasPorTopicoId_DebeRetornarListaDeRespuestas() {
        Long topicoId = 1L;

        // Configurar el comportamiento del mock
        Respuesta respuesta1 = new Respuesta();
        respuesta1.setId(1L);
        Respuesta respuesta2 = new Respuesta();
        respuesta2.setId(2L);
        List<Respuesta> respuestas = Arrays.asList(respuesta1, respuesta2);
        when(respuestaRepository.findByTopicId(topicoId)).thenReturn(respuestas);

        // Llamar al método que se va a probar
        List<Respuesta> respuestasObtenidas = respuestaService.obtenerRespuestasPorTopicoId(topicoId);

        // Verificar el resultado esperado
        assertEquals(2, respuestasObtenidas.size());
        assertEquals(1L, respuestasObtenidas.get(0).getId());
        assertEquals(2L, respuestasObtenidas.get(1).getId());
    }
}
