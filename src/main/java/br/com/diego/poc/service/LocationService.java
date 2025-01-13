package br.com.diego.poc.service;


import br.com.diego.poc.entity.Location;
import br.com.diego.poc.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

}