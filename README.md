# ForoAlura
creacion de API para challenge de One Oracle Next Eduaction y Alura Latam

# Foro Alura API

¡Bienvenido al desafío del Challenge Back End del Foro Alura!

El Foro Alura es un lugar donde los alumnos de la plataforma Alura pueden plantear preguntas sobre cursos específicos. Es un espacio mágico lleno de aprendizaje y colaboración entre alumnos, profesores y moderadores.

En este desafío, nos enfocaremos en comprender cómo funciona el Foro Alura en su parte trasera. Nos preguntamos dónde se almacenan las informaciones, cómo se relacionan los datos, cómo se asocian los tópicos con las respuestas y cómo se relacionan los usuarios con las respuestas de un tópico.

Nuestro objetivo es replicar este proceso a nivel de back end, utilizando Spring para crear una API REST.

La API se centrará específicamente en los tópicos y permitirá a los usuarios:

- Crear un nuevo tópico.
- Mostrar todos los tópicos creados.
- Mostrar un tópico específico.
- Actualizar un tópico.
- Eliminar un tópico.

Estas funcionalidades son comúnmente conocidas como CRUD (CREATE, READ, UPDATE, DELETE) y son similares a lo que desarrollamos en el proyecto Hotel Alura. Sin embargo, en este desafío utilizaremos un framework que facilitará nuestro trabajo y adoptaremos un nuevo modelo de arquitectura de software conocido como REST.

Al final de esta etapa de desarrollo, habremos construido una API REST con las siguientes características:

- Rutas implementadas siguiendo las mejores prácticas del modelo REST.
- Validaciones realizadas según las reglas de negocio.
- Implementación de una base de datos para la persistencia de la información.

## Requisitos del proyecto

- Java 17
- Spring Boot 3.1.0
- Base de datos H2 para desarrollo (en memoria)
- Base de datos MySQL para producción

## Configuración

En el archivo `application.properties`, se encuentra la configuración para la base de datos. Por defecto, se utiliza la base de datos H2 en modo de memoria. Si deseas utilizar una base de datos persistente, puedes comentar las configuraciones de H2 y descomentar las configuraciones para MySQL.

## Instalación y configuración

1. Clona el repositorio a tu máquina local.
2. Abre el proyecto en tu IDE favorito.
3. Configura las dependencias y el entorno de desarrollo según las instrucciones del proyecto.
4. Ejecuta la aplicación.

## Uso

Una vez que la aplicación esté en ejecución, puedes utilizar una herramienta de prueba de API, como Postman o Insomnia, para interactuar con la API y probar las diferentes funcionalidades.

A continuación, se muestra una breve descripción de las rutas disponibles:

- `GET /topicos`: Obtiene todos los tópicos creados.
- `GET /topicos/{id}`: Obtiene un tópico específico por su ID.
- `POST /topicos`: Crea un nuevo tópico.
- `PUT /topicos/{id}`: Actualiza un tópico existente por su ID.
- `DELETE /topicos/{id}`: Elimina un tópico por su ID.

Recuerda que la API seguirá las convenciones y buenas prácticas del modelo REST.

## Contribución

Si deseas contribuir al proyecto, puedes seguir los siguientes pas

os:

1. Haz un fork del repositorio.
2. Crea una rama para tu nueva funcionalidad o corrección de errores.
3. Realiza los cambios necesarios y realiza commits con mensajes descriptivos.
4. Envía una solicitud de extracción al repositorio principal.

## Licencia

Este proyecto se distribuye bajo la Licencia MIT. Para más información, consulta el archivo [LICENSE](./LICENSE).

## Contacto

Si tienes alguna pregunta, sugerencia o comentario, no dudes en ponerte en contacto con nosotros a través de los siguientes medios:

- Correo electrónico: jthmarquez@gmail.com
- Linkedin: https://www.linkedin.com/in/jonathan-marquez-289127a1/

¡Espero que disfrutes utilizando la API del Foro Alura y que te diviertas desarrollando nuevas funcionalidades!

¡Gracias por contribuir!
