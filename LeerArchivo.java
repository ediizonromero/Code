package comenzando;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeerArchivo {

    String fichero;
    BufferedReader br;

    public LeerArchivo(String fichero) {
        this.fichero = fichero;

        try {
            this.br = new BufferedReader(new FileReader(fichero));
        } catch (Exception ex) {
            System.out.println("Excepcion leyendo fichero " + fichero + " : " + ex);
        }

    }

    public void leerLineas(int lineas) {

        try {
            String linea;
            for (int i = 0; i < lineas; i++) {
                linea = br.readLine();
                System.out.println(linea);
            }

        } catch (Exception ex) {
            System.out.println("Excepcion leyendo fichero " + fichero + " : " + ex);
        }

    }

    public void leerLineasEntre(int in, int fin) {

        try {
            String linea;
            for (int i = 1; i <= fin; i++) {
                linea = br.readLine();
                if (i >= in) {
                    System.out.println(linea);
                }
            }

        } catch (Exception ex) {
            System.out.println("Excepcion leyendo fichero " + fichero + " : " + ex);
        }

    }

    public void leer() {
        try {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (Exception ex) {
            System.out.println(ex + "Excepcion leyendo fichero " + fichero + " : " + ex);
        }

    }
    
    public String[] leerEntreLineas(int in, int fin) {
        
        int tam = fin - in;
        String[] linea = new String[tam+1];

        try {
            
            for (int i = 1; i <= fin; i++) {
                linea[ i-1 ] = br.readLine();
            }

        } catch (Exception ex) {
            System.out.println("Excepcion leyendo fichero " + fichero + " : " + ex);
        }
        
        return linea;

    }

}//Fin de la clase LeerArchivo
