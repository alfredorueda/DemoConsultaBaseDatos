package demo.Repository;

import demo.Model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long>{

    public List<Employee> findBySalaryGreaterThan(Double salary);
    public List<Employee> findByNameContaining (String name);
    public List<Employee> findByOrderByNameDesc ();
    public List<Employee> findBySalaryBetween (Double minSalary, Double maxSalary);

    Employee findFirstByOrderBySalaryDesc();

    List<Employee> findFirst2ByOrderBySalaryDesc();
}
