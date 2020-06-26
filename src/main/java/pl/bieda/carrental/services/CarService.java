package pl.bieda.carrental.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bieda.carrental.models.Car;
import pl.bieda.carrental.repository.CarRepository;

import java.util.Date;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;
//    @Autowired
//    ReservationRepository reservationRepository;

    public Iterable<Car> findAll(){
        return carRepository.findAll();
    }

    public Optional<Car> findById(Long id) {
        return carRepository.findById(id);
    }

//    public Car save(Car car) {
//        return carRepository.save(car);
//    }
//
//    public void deleteById(Long id) {
//        carRepository.deleteById(id);
//    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void fillDB() {
//        carRepository.save(new Car("Fiat", "500", "4 Miejsca", "1 Torba", "2 Drzwi", "Manualna skrzynia biedów", "Klimatyzacja", "Benzyna", 100, 400));
//        carRepository.save(new Car("Toyota", "Yaris", "5 Miejsc", "2 Torby", "4 Drzwi", "Manualna skrzynia biedów", "Klimatyzacja", "Benzyna", 120, 450));
//        carRepository.save(new Car("Volkswagen", "Golf", "5 Miejsc", "2 Torby", "4 Drzwi", "Manualna skrzynia biedów", "Klimatyzacja", "Benzyna", 130, 500));
//        carRepository.save(new Car("Seat", "Leon", "5 Miejsc", "2 Torby", "4 Drzwi", "Automatyczna skrzynia biedów", "Klimatyzacja", "Diesel", 140, 600));
//        carRepository.save(new Car("Mercedes-Benz", "A-Class", "5 Miejsc", "2 Torby", "4 Drzwi", "Automatyczna skrzynia biedów", "Klimatyzacja", "Benzyna", 150, 700));
//        carRepository.save(new Car("Opel", "Insignia", "5 Miejsc", "3 Torby", "4 Drzwi", "Manualna skrzynia biedów", "Klimatyzacja", "Benzyna", 160, 800));
//        carRepository.save(new Car("Volkswagen", "Passat", "5 Miejsc", "3 Torby", "4 Drzwi", "Automatyczna skrzynia biedów", "Klimatyzacja", "Diesel", 150, 800));
//        carRepository.save(new Car("Toyota", "Avensis", "5 Miejsc", "3 Torby", "4 Drzwi", "Manualna skrzynia biedów", "Klimatyzacja", "Diesel", 160, 800));
//        carRepository.save(new Car("Renault", "Traffic", "9 Miejsc", "4 Torby", "3 Drzwi", "Automatyczna skrzynia biedów", "Klimatyzacja", "Benzyna", 190, 900));
//    }
}
