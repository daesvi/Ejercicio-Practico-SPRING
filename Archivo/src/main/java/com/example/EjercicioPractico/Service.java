package com.example.EjercicioPractico;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.FileNotFoundException;

public class Service {
    public String identifyDocument(String ruta) throws FileNotFoundException {

        if (ruta.contains(".csv") || ruta.contains(".xlsx")) {

            Route newRoute = new Route(ruta);
            String testRoute = newRoute.getRuta();

            ResponseEntity<String> response = new RestTemplate().postForEntity("http://localhost:8090/validate", testRoute, String.class);

            return response.getBody();

        } else {
            return "Tipo de archivo no admitido";
        }

    }
}
