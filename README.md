# Patrón de diseño Mediator

El patrón de diseño mediator propone implementar una clase que fungiría como su nombre lo dice, como un mediador
al momento de comunicar varios objetos, esto nos ayuda a reducir el acoplamiento, cumple con el principio Single Responsability,
Open/Close, además de que nos facilita el poder reutilizar los objetos.

### Ejemplo

Un ejemplo común es:

- Hay varios usuarios que quieren comunicarse entre si, si cada uno de ellos se comunicara directamente con el otro estos van a
tener una dependencia, esto haría muy complejo mantener el programa y modificarlo porque al tener dependencias de "todos contra todos"
al querer mover una tendrías que mover otra y otra y otra y se haría una cadena de descontrol, la solución que se propondría en este caso seria implementar
el patrón de diseño mediator y generar una clase `ChatRoom` que fungiría como mediador, esta se encargaría de recibir todos los mensajes
de los participantes y redireccionarlos a los participantes destinatarios.

- Otro ejemplo lo podemos ver el en mismo humano, en nuestro caso, el cerebro fungiría como mediador de los distintos sentidos, se encargaría
de comunicar por ejemplo lo que ven los ojos, lo que escuchamos o lo que olemos.

- Un ultimo ejemplo se puede dar en el caso de un aeropuerto, hay varios aviones, sin embargo estos no se deben comunicaran entre si
directamente, lo hacen a través de una torre de control que funge como mediador y este es el ejemplo que se construyo en el código.

### Diagrama de estructura

![Diagrama de estructura](https://refactoring.guru/images/patterns/diagrams/mediator/structure.png)
