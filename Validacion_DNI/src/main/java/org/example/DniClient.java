package org.example;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class DniClient {
    //Clase parea la logica del cliente
    private String server;
    private int port;

    public DniClient(String server, int port) {
        this.server = server;
        this.port = port;
    }

    public void start() {
        // Crear un nuevo socket para conectarse al servidor especificado por la dirección 'server' y el puerto 'port'
        try (Socket cliente = new Socket(server, port)) {
            // Crear un BufferedReader para leer datos del socket de entrada
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            // Crear un PrintWriter para enviar datos al socket de salida, auto-flush habilitado
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);

            // Crear un escáner para leer la entrada del usuario desde la consola
            Scanner sc = new Scanner(System.in);
            // Imprimir un mensaje indicando que la conexión al servidor se ha establecido
            System.out.println("Conectado al servidor " + server + " en el puerto " + port);
            System.out.println("----------------------");
            // Solicitar al usuario que introduzca su DNI
            System.out.println("Introduce tu DNI: ");
            // Leer el DNI ingresado por el usuario
            String dni = sc.nextLine();
            // Enviar el DNI al servidor a través del socket
            out.println(dni);

            // Leer la respuesta del servidor
            String respuesta = in.readLine();
            // Imprimir la respuesta del servidor en la consola
            System.out.println(respuesta);

        } catch (IOException e) {
            // Manejar cualquier excepción de E/S lanzando una RuntimeException
            throw new RuntimeException(e);
        }
    }
}
