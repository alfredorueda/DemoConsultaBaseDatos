package demo.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "project")
    Set<Employee> employees = new HashSet<>();

    @Column
            // Sirve para mapear el nombre del atributo java al nombre de la columna en la base de datos, si es el mismo no es necesario.
    String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
