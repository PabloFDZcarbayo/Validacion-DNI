package org.example;

import java.net.ServerSocket;
import java.net.Socket;

public class DniServer {

    //Clase para la logica del servidor

    private int port;

    public DniServer(int port) {
        this.port = port;
    }

    public void start() {
        try (ServerSocket server = new ServerSocket(port)) {
            System.out.println("Servidor inicializando en el puerto " + port);

            // El servidor se mantiene a la espera de conexiones de clientes
            while (true) {
                // Se acepta una nueva conexion de cliente
                Socket socket = server.accept();
                // Se crea un hilo nuevo para manejar la conexion del cliente
                new Thread(new DniClientHandler(socket)).start();
            }
        }catch (Exception e) {
            // Si ocurre un error se imprime la traza del error
            e.printStackTrace();

        }
    }
}
