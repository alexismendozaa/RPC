# Java RMI Example (RPC)

This project demonstrates a simple implementation of Remote Procedure Call (RPC) using Java RMI. It consists of a server that provides a method to greet a user and a client that invokes this method remotely.

## How to Use

1. Ensure you have Java Development Kit (JDK) installed and configured on your system. Verify with `java -version` and `javac -version`.

2. Compile the project:
   Open a terminal, navigate to the `src` directory, and run:
javac *.java

3. Start the server:
In the terminal, run:
java Server

You should see the message: `Servidor RMI está listo.`

4. Run the client:
Open another terminal, navigate to the same `src` directory, and execute:
java Client
The client will display a response received from the server, such as:
Respuesta del servidor: ¡Hola, Matías! Este es un ejemplo de RPC usando Java RMI.

5. To customize the message, modify the name passed in the `Client.java` file:
```java
String response = service.sayHello("YourName");

Requirements
JDK 8 or higher
No external libraries are required
