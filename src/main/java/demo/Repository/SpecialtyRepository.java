package demo.Repository;


import demo.Model.Specialty;
import org.springframework.data.repository.PagingAndSortingRepository;

//Es la interface que representa el Repository que nos permitirá intercetuar con las entidades para que sean mantenidas en la base de datos
public interface SpecialtyRepository extends PagingAndSortingRepository<Specialty,Long>{
}
