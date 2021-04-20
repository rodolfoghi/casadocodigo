package br.com.casadocodigo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
    @GetMapping(value="/api/teste")
    public String teste() {
        return "Está configurado";
    }
}
