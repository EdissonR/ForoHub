package Challenge.foro.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
@Table(name = "perfiles")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String nombre;

    @ManyToMany(mappedBy = "perfiles")
    private List<Autor> autors;

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Autor> getUsuarios() {
        return autors;
    }

    public void setUsuarios(List<Autor> autors) {
        this.autors = autors;
    }
}
