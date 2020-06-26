package pl.bieda.carrental.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pl.bieda.carrental.models.Place;
import pl.bieda.carrental.services.PlaceService;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/place")
public class PlaceController {

    @Autowired
    PlaceService placeService;

    @GetMapping("/all")
    public Iterable<Place> getAll(){
        return placeService.findAll();
    }

    @GetMapping
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public Optional<Place> getById(@RequestParam Long id){
        return placeService.findById(id);
    }

}
