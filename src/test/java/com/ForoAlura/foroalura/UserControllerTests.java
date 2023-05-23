package com.ForoAlura.foroalura;

import com.ForoAlura.foroalura.controller.UserController;
import com.ForoAlura.foroalura.model.User;
import com.ForoAlura.foroalura.service.UserService;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import static org.springframework.security.web.header.writers.ReferrerPolicyHeaderWriter.ReferrerPolicy.get;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
public class UserControllerTests {
    
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void obtenerUsuarios_DebeRetornarListaDeUsuarios() throws Exception {
        // Configurar el comportamiento del mock
        User user1 = new User();
        user1.setId(1L);
        user1.setUsername("usuario1");
        User user2 = new User();
        user2.setId(2L);
        user2.setUsername("usuario2");
        List<User> usuarios = Arrays.asList(user1, user2);
        when(userService.obtenerUsuarios()).thenReturn(usuarios);

        // Realizar la solicitud HTTP y verificar el resultado
        mockMvc.perform(get("/usuarios")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", is(2)))
                .andExpect(jsonPath("$[0].id", is(1)))
                .andExpect(jsonPath("$[0].username", is("usuario1")))
                .andExpect(jsonPath("$[1].id", is(2)))
                .andExpect(jsonPath("$[1].username", is("usuario2")));
    }

}
