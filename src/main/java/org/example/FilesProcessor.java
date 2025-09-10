package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SPLProcessor {

    // Ruta donde busca los archivos
    private static final String DOCUMENT_FOLDER = "C:\\Users\\geogimenez\\Documents";

   public List<File> getFilesSPL() {
       // Crea lista vacía de archivos
        List<File> listaSPL = new ArrayList<>();
        File carpeta = new File(DOCUMENT_FOLDER);

        if (!carpeta.exists() || !carpeta.isDirectory()) {
            System.out.println("La carpeta no existe o no es válida: " + DOCUMENT_FOLDER);
            return listaSPL;
        }

        File[] archivos = carpeta.listFiles((dir, name) -> name.toLowerCase().endsWith(".prn"));

        // Agregar archivos a la lista
        if (archivos != null) {
            for (File archivo : archivos) {
                listaSPL.add(archivo);
            }
        }

        return listaSPL;
    }


    public static void main(String[] args) {

    }
}