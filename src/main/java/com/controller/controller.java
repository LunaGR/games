package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    Private Calculator calculator;

    @RestController
    @RequestMapping("/calculadora")
    public class CalculadoraController {

        @GetMapping("/sumar")
        public double sumar(double a, double b) {
            return calculator;
        }

        @GetMapping("/restar")
        public double restar(@RequestParam double num1, @RequestParam double num2) {
            return num1 - num2;
        }

        @GetMapping("/multiplicar")
        public double multiplicar(@RequestParam double num1, @RequestParam double num2) {
            return num1 * num2;
        }

        @GetMapping("/dividir")
        public double dividir(@RequestParam double num1, @RequestParam double num2) {
            if (num2 == 0) {
                throw new IllegalArgumentException("No se puede dividir por cero");
            }
            return num1 / num2;
        }
    }
}
