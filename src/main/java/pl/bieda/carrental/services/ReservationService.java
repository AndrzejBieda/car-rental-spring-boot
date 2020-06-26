package pl.bieda.carrental.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.bieda.carrental.models.*;
import pl.bieda.carrental.repository.CarRepository;
import pl.bieda.carrental.repository.PlaceRepository;
import pl.bieda.carrental.repository.ReservationRepository;
import pl.bieda.carrental.repository.UserRepository;

import java.text.SimpleDateFormat;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository reservationRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    PlaceRepository placeRepository;
    @Autowired
    CarRepository carRepository;

    public Iterable<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    public Optional<Reservation> findById(Long id) {
        return reservationRepository.findById(id);
    }

    public Iterable<Reservation> findByUsername(String username) throws Exception {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new Exception("User Not Found with username: " + username));
        return reservationRepository.findByKlient(user);
    }

//    public Reservation save(Reservation reservation) {
//        return reservationRepository.save(reservation);
//    }

    public void deleteById(Long id) {
        reservationRepository.deleteById(id);
    }

    public Reservation add(Reservation2 reservation2) throws Exception {
        User user = userRepository.findByUsername(reservation2.getKlient())
                .orElseThrow(() -> new Exception("User Not Found with username: " + reservation2.getKlient()));
        Place miejsceOdbioru = placeRepository.findByAdres(reservation2.getMiejsceOdbioru())
                .orElseThrow(() -> new Exception("Place Not Found with address: " + reservation2.getMiejsceOdbioru()));
        Place miejsceZwrotu = placeRepository.findByAdres(reservation2.getMiejsceZwrotu())
                .orElseThrow(() -> new Exception("Place Not Found with address: " + reservation2.getMiejsceZwrotu()));
        Car car = carRepository.findById(reservation2.getSamochod())
                .orElseThrow(() -> new Exception("Car Not Found with id: " + reservation2.getSamochod()));

        Reservation reservation = new Reservation();
        reservation.setKlient(user);
        reservation.setMiejsceOdbioru(miejsceOdbioru);
        reservation.setMiejsceZwrotu(miejsceZwrotu);
        reservation.setSamochod(car);
        reservation.setDataOdbioru(new SimpleDateFormat("yyyy-dd-MM").parse(reservation2.getDataOdbioru()));
        reservation.setDataZwrotu(new SimpleDateFormat("yyyy-dd-MM").parse(reservation2.getDataZwrotu()));

        return reservationRepository.save(reservation);
    }


}
