package com.example.EjercicioPractico;

public class ReaderData {
    public static String readCSV(String route)  {
        return ValidationCSV.validators(route);
    }

    // Excel Validator
    public static  String readXSLX(String route) {
        return ValidationExcel.validarXLSX(route);
    }
}
