import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

// Implementación del servicio
public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {

    protected HelloServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "¡Hola, " + name + "! Este es un ejemplo de RPC usando Java RMI.";
    }
}
