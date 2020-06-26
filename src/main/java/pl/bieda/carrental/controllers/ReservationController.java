package pl.bieda.carrental.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pl.bieda.carrental.models.Reservation;
import pl.bieda.carrental.models.Reservation2;
import pl.bieda.carrental.services.ReservationService;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/reservation")
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @GetMapping("/all")
    @PreAuthorize("hasRole('ADMIN')")
    public Iterable<Reservation> getAll() {
        return reservationService.findAll();
    }

    @GetMapping
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public Iterable<Reservation> getById(@RequestParam String username) throws Exception {
        return reservationService.findByUsername(username);
    }

    @PostMapping
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String addReservation(@Valid @RequestBody Reservation2 reservation2) throws Exception {
        reservationService.add(reservation2);
        return "Succes";
    }

    @DeleteMapping
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteReservation(@RequestParam Long id) {
        reservationService.deleteById(id);
    }
}
