package br.fa7.exercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jackson on 4/18/16.
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        System.setProperty("server.port", "8082");
        SpringApplication.run(Main.class, args);
    }
}
