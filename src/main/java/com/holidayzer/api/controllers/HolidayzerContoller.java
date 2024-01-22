package com.holidayzer.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/holidays")
public class HolidayzerContoller {

    static Feriados[] feriados = {
        new Feriados("01-01-2024", "Confraternização Mundial"),
        new Feriados("12-02-2024", "Carnaval"),
        new Feriados("13-02-2024", "Carnaval"),
        new Feriados("29-03-2024", "Sexta-feira Santa"),
        new Feriados("21-04-2024", "Tiradentes"),
        new Feriados("01-05-2024", "Dia do Trabalho"),
        new Feriados("30-05-2024", "Corpus Christi"),
        new Feriados("07-09-2024", "Independência do Brasil"),
        new Feriados("12-10-2024", "Nossa Senhora Aparecida"),
        new Feriados("02-11-2024", "Finados"),
        new Feriados("15-11-2024", "Proclamação da República"),
        new Feriados("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"),
        new Feriados("25-12-2024", "Natal")
    }; 
   
    @GetMapping
    public List<String> holidays() {
         List<String> listFeriados = new ArrayList<>();
         for(int i = 0; i < feriados.length; i++){
            listFeriados.add(feriados[i].getDate() + " => " + feriados[i].getName());
         }
        return listFeriados;        
    }

    @GetMapping("/:{date}")
    public String getHolidaysDate(@PathVariable String date) {
        String result = "";
        for(int i = 0; i < feriados.length; i++){
            if(feriados[i].getDate().equals(date)){
                result = "Dia " + feriados[i].getDate() + " é " + feriados[i].getName() + "!";  
                break;              
            }
            if(feriados.length == i+1){
                result = "Dia " + date + " não é feriado";
            }
        }
        return result;           
    }
}
