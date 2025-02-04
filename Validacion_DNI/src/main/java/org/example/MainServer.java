package org.example;

public class MainServer {
    //Esta clase será el punto de entrada del servidor
    public static void main(String[] args) {
        DniServer server = new DniServer(8080);
        server.start();
    }
}
