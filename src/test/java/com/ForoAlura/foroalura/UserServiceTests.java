package com.ForoAlura.foroalura;

import com.ForoAlura.foroalura.model.User;
import com.ForoAlura.foroalura.repository.UserRepository;
import com.ForoAlura.foroalura.service.UserService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

public class UserServiceTests {
    
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        userService = new UserService(userRepository);
    }

    @Test
    public void testObtenerUsuarioPorTopicoId() {
        // Crear datos de prueba
        Long topicoId = 1L;
        User user = new User();
        // Configurar el comportamiento del UserRepository mock
        when(userRepository.findByTopicoId(topicoId)).thenReturn(user);

        // Llamar al método que se está probando
        User resultado = userService.obtenerUsuarioPorTopicoId(topicoId);

        // Verificar el resultado
        assertEquals(user, resultado);
    }

}
