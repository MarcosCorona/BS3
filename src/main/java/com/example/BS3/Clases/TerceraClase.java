package com.example.BS3.Clases;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;

@Configuration
public class TerceraClase {

    @Bean
    CommandLineRunner ejecutame2() {
        return p ->
        {
            System.out.println("Hola desde tercera clase");
            PrimeraClase pr = new PrimeraClase();
            pr.primeraEjecucion();
            SegundaClase sc = new SegundaClase();
            sc.ejecutarSegunda();
        };

    }
}
