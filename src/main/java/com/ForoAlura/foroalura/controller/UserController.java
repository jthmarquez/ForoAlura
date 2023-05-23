package com.ForoAlura.foroalura.controller;

import com.ForoAlura.foroalura.model.User;
import com.ForoAlura.foroalura.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> obtenerUsuarios() {
        return userService.obtenerUsuarios();
    }

    @GetMapping("/{id}")
    public User obtenerUsuarioPorId(@PathVariable Long id) {
        return userService.obtenerUsuarioPorId(id);
    }

    @PostMapping
    public User crearUsuario(@RequestBody User user) {
        return userService.crearUsuario(user);
    }

    @PutMapping("/{id}")
    public User actualizarUsuario(@PathVariable Long id, @RequestBody User user) {
        return userService.actualizarUsuario(id, user);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        userService.eliminarUsuario(id);
    }
}

