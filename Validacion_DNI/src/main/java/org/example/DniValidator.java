package org.example;


public class DniValidator {

    //Esta clase es la encarga de validar los DNI

    public static char calcularLetraDNI(String subCadenaNumeros) {
        int miDNI = Integer.parseInt(subCadenaNumeros);
        int resto = 0;
        String asignarLetra = "TRWAGMYFPDXBNJZSQVHLCKE";
        resto = miDNI % 23;
        char miLetra = asignarLetra.charAt(resto);
        return miLetra;
    }




    public static Boolean validateDni(String dni) {

        if (dni.length() != 9 || dni == null) {
            return false;
        } else {
            String subCadenaNumeros = dni.substring(0, 8);
            char letra = dni.charAt(8);

            char letraCalculada = calcularLetraDNI(subCadenaNumeros);

            if (letra == letraCalculada) {
                return true;
            } else {
                return false;
            }
        }

    }


}




