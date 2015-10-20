package demo.Repository;

import demo.Model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long>{

    public List<Employee> findBySalaryGreaterThan(Double salary);
    public List<Employee> findByNameContaining (String name);
    public List<Employee> findByOrderByNameDesc ();
    public List<Employee> findBySalaryBetween (Double minSalary, Double maxSalary);

    Employee findFirstByOrderBySalaryDesc();

    List<Employee> findFirst2ByOrderBySalaryDesc();

    List<Employee> findByProjectDescriptionContains(String prueba);

    @Query("SELECT e FROM Employee e where e.project.description = :projectName order by e.salary desc ")
    List<Employee> findEmployeeOrderBySalaryFromProject(@Param("projectName") String projectName);
}
