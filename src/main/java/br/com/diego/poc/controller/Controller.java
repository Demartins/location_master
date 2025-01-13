package br.com.diego.poc.controller;

import br.com.diego.poc.LocationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location-master")
class Controller {
    @Autowired
    private LocationProducer service;

    @GetMapping("/kafka/{name}")
    public String hello(@PathVariable("name") String name) {
        service.sendMessage("hello, " + name);
        return "OK";
    }
}
