package com.example.EjercicioPractico;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/")
public class Controller {
    Service service = new Service();
    RestTemplate template = new RestTemplate();

    @PostMapping("/archivo")
    public String enviarRutaURL(@RequestBody Map<String, String> request) throws IOException {
        String archivo = request.get("ruta");
        return this.service.identifyDocument(archivo);
    }
}
