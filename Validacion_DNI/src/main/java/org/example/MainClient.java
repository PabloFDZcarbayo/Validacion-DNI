package org.example;

public class MainClient {

    //Esta clase será el punto de entrada del cliente
    public static void main(String[] args) {
        DniClient client = new DniClient("localhost", 8080);
        client.start();
    }
}
