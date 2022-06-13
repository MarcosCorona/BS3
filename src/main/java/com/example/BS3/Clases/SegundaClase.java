package com.example.BS3.Clases;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;

@Configuration
public class SegundaClase {
    @Bean
    public void ejecutarSegunda() {
            System.out.println("Hola desde clase secundaria");
    }
}