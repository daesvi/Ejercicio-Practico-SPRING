package com.example.EjercicioPractico;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ValidationController {
    ValidationService service = new ValidationService();

    @PostMapping("/validate")
    public String almacenarRuta(@RequestBody() String newRoute) {
        return service.validateData(newRoute);
    }
}
