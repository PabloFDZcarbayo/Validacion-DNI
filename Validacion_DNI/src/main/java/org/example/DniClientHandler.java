package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class DniClientHandler implements Runnable {

    //Clase que gestiona cada cliente
    private Socket socket;

    public DniClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        // Abrimos un flujo de lectura para leer del socket
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // Abrimos un flujo de escritura para mandar respuestas al socket
            PrintStream out = new PrintStream(socket.getOutputStream(),true);

            // Leemos el DNI del socket
            String dni = in.readLine();

            // Mostramos el DNI recibido por consola
            System.out.println("DNI recibido: " + dni);

            // Comprobamos si el DNI es válido
            boolean isValid = DniValidator.validateDni(dni);

            // Mandamos al socket si el DNI es válido o no
            if (isValid) {
                out.println("El DNI es válido");
            } else {
                out.println("El DNI no es válido");
            }

        } catch (IOException e) {
            // Si ocurre un error, mostramos la traza del error
            e.printStackTrace();
        } finally {
            try {
                // Cerramos el socket
                socket.close();
            } catch (IOException e) {
                // Si ocurre un error al cerrar el socket, mostramos la traza del error
                e.printStackTrace();
            }
        }
    }
}

