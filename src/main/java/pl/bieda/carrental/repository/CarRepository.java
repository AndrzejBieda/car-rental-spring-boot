package pl.bieda.carrental.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bieda.carrental.models.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
