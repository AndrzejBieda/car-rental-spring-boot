package pl.bieda.carrental.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bieda.carrental.models.Place;
import pl.bieda.carrental.repository.PlaceRepository;

import java.util.Optional;

@Service
public class PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    public Iterable<Place> findAll() {
        return placeRepository.findAll();
    }

    public Optional<Place> findById(Long id) {
        return placeRepository.findById(id);
    }

//    public Place save(Place place) {
//        return placeRepository.save(place);
//    }
//
//    public void deleteById(Long id) {
//        placeRepository.deleteById(id);
//    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void fillDB() {
//        placeRepository.save(new Place("Rzeszów, ul. Kopisto 2A"));
//        placeRepository.save(new Place("Kraków, ul. Popiełuszki 46"));
//        placeRepository.save(new Place("Katowice, ul. Kwiatowa 16C"));
//    }
}
