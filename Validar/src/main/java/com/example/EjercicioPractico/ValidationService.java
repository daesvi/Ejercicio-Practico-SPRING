package com.example.EjercicioPractico;

public class ValidationService {
    public String validateData(String ruta) {

        String archivo = "";

        if (ruta.contains(".csv")) {
            archivo = ReaderData.readCSV(ruta);
        } else if (ruta.contains(".xlsx")) {
            archivo = ReaderData.readXSLX(ruta);
        }
        return archivo;
    }
}
