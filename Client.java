import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Conectar al registro RMI en localhost y puerto 1099
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Buscar el servicio con el nombre registrado
            HelloService service = (HelloService) registry.lookup("HelloService");

            // Llamar al método remoto
            String response = service.sayHello("Alexis");
            System.out.println("Respuesta del servidor: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
