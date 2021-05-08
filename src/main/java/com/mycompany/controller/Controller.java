/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.model.suma;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author SusanaHI
 */

@SpringBootApplication

@RestController
public class Controller {
    
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("suma", new suma());
        return "index";
    }
    
    @RequestMapping(value="/suma", method=RequestMethod.POST)
    public String suma(@ModelAttribute("suma") suma suma, Model model){
        suma.setR(suma.getN1()+suma.getN2());
        model.addAttribute("r", suma);
        return "index_1";
    }
    
}