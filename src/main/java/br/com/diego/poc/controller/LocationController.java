package br.com.diego.poc.controller;

import br.com.diego.poc.entity.Location;
import br.com.diego.poc.events.Producer;
import br.com.diego.poc.service.LocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location-master")
class LocationController {

    private static final Logger logger = LoggerFactory.getLogger(LocationController.class);

    @Autowired
    private Producer service;

    @GetMapping("/kafka/{name}")
    public String hello(@PathVariable("name") String name) {
        service.sendMessage("hello, " + name);
        return "OK";
    }
    @Autowired
    private LocationService locationService;

    @PostMapping("/save")
    public Location saveLocation(@RequestBody Location location) {
        logger.info("Sending message with location: {}", location.toString());
        service.sendMessage("send message location"+ location.toString());
        return locationService.saveLocation(location);
    }
}
