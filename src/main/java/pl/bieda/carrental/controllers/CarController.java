package pl.bieda.carrental.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pl.bieda.carrental.models.Car;
import pl.bieda.carrental.services.CarService;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/all")
    public Iterable<Car> getAll(){
        return carService.findAll();
    }

    @GetMapping
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public Optional<Car> getById(@RequestParam Long id){
        return carService.findById(id);
    }

}
