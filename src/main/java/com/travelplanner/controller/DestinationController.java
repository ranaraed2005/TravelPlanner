package com.travelplanner.controller;

import com.travelplanner.model.Destination;
import com.travelplanner.repository.DestinationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/destinations")
public class DestinationController {

    private final DestinationRepository destinationRepository;

    public DestinationController(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    @GetMapping
    public List<Destination> getAllDestinations() {
        return destinationRepository.findAll();
    }

    @PostMapping
    public Destination createDestination(@RequestBody Destination destination) {
        return destinationRepository.save(destination);
    }
    @GetMapping("/country/{country}")
    public List<Destination> getDestinationsByCountry(@PathVariable String country) {
        return destinationRepository.findByCountryContainingIgnoreCase(country);
    }
    @GetMapping("/name/{name}")
    public List<Destination> getDestinationsByName(@PathVariable String name) {
        return destinationRepository.findByNameContainingIgnoreCase(name);
    }
    @DeleteMapping("/{id}")
    public void deleteDestination(@PathVariable Long id) {
        destinationRepository.deleteById(id);
    }
    @GetMapping("/{id}")
    public Destination getDestinationById(@PathVariable Long id) {
        return destinationRepository.findById(id)
                .orElseThrow();
    }
    @PutMapping("/{id}")
    public Destination updateDestination(
            @PathVariable Long id,
            @RequestBody Destination updatedDestination) {

        Destination destination = destinationRepository.findById(id)
                .orElseThrow();

        destination.setName(updatedDestination.getName());
        destination.setCountry(updatedDestination.getCountry());
        destination.setDescription(updatedDestination.getDescription());

        return destinationRepository.save(destination);
    }
}