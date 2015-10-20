package demo.Service;

import demo.Model.Employee;
import demo.Model.Project;
import demo.Repository.EmployeeRepository;
import demo.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;

    public void testEmployee() {

        Employee employee = new Employee();
        employee.setName("Luis");
        employee.setSalary(17_000.00);
        employeeRepository.save(employee);



        Project project = new Project();
        project.setDescription("prueba");
        projectRepository.save(project);

        Employee employee2 = new Employee();
        employee2.setName("Pedro");
        employee2.setSalary(27_000.00);
        //employee2.setProject(project);
        employeeRepository.save(employee2);

        Employee employee3 = new Employee();
        employee3.setName("Juan");
        employee3.setSalary(20_000.00);
        employee3.setProject(project);
        employeeRepository.save(employee3);





        System.out.println(employeeRepository.findBySalaryGreaterThan(18_000.00));
        System.out.println(employeeRepository.findByNameContaining("Juan"));
        System.out.println(employeeRepository.findByOrderByNameDesc());
        System.out.println(employeeRepository.findBySalaryBetween(15_000.00, 26_000.00));

        List<Employee> employees = employeeRepository.findByOrderByNameDesc();
        //currentEmployee es la variable que va apuntando a cada empleado de la lista
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee.getName());
        }

        Employee employee1 = employeeRepository.findFirstByOrderBySalaryDesc();

        List<Employee> employees1 = employeeRepository.findFirst2ByOrderBySalaryDesc();

        String string = "prueba";
        List<Employee> employees_project = employeeRepository.findByProjectDescriptionContains(string);

        System.out.println(employee1);
        System.out.println(employees1);
        System.out.println(employees_project);

        System.out.println(employeeRepository.findEmployeeOrderBySalaryFromProject("prueba"));
    }

}
