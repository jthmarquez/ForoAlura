package com.ForoAlura.foroalura;

import com.ForoAlura.foroalura.controller.RespuestaController;
import com.ForoAlura.foroalura.model.Respuesta;
import com.ForoAlura.foroalura.service.RespuestaService;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(RespuestaController.class)
public class RespuestaControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RespuestaService respuestaService;

    @BeforeEach
    public void setUp() {
        // Configurar el comportamiento de los mocks (si es necesario)
    }

    @Test
    public void obtenerRespuestas_DebeRetornarListaDeRespuestas() throws Exception {
        // Configurar el comportamiento del mock
        Respuesta respuesta1 = new Respuesta();
        respuesta1.setId(1L);
        respuesta1.setContent("Respuesta 1");
        Respuesta respuesta2 = new Respuesta();
        respuesta2.setId(2L);
        respuesta2.setContent("Respuesta 2");
        List<Respuesta> respuestas = Arrays.asList(respuesta1, respuesta2);
        when(respuestaService.obtenerRespuestas()).thenReturn(respuestas);

        // Realizar la solicitud HTTP y verificar el resultado
        mockMvc.perform(MockMvcRequestBuilders.get("/respuestas")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].content").value("Respuesta 1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].id").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].content").value("Respuesta 2"));
    }
}
