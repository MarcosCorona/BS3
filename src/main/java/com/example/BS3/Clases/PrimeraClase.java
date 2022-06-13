package com.example.BS3.Clases;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Configuration
public class PrimeraClase {

    @PostConstruct
    public void primeraEjecucion(){
        System.out.println("Hola desde clase inicial");
    }
}
