package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CalculadoraService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/calculator")

public class CalculadoraController {
    @Autowired
    private CalculadoraService calculadoraService;
    
    @GetMapping ("/check")
   /* 
    public double checkNumber(@RequestParam double num1, double num2, double total){
        return calculadoraService.checkNumber(total);*/ 

        public double checkNumber(@RequestParam double num1){
     /*    @RequestParam(name = "operacion") char operacion,
        @RequestParam(name = "num2") double num2,
        @RequestParam(name = "total") double total){
      //  @RequestParam(value = "total", required= false) double total )*/
            return calculadoraService.checkNumber(num1); 
        }
    }
    

