package demo.Model;

import javax.persistence.*;

@Entity

public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //Define que es primary key y su incremento automático
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    //Genera representación textual del objeto
    public String toString() {
        return "Specialty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
