package Challenge.foro.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;


@Entity
public class Topico {


    //DEFINIENDO LOS ATRIBUTOS DEL TOPICO
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String mensaje;

    @NotNull
    private LocalDateTime fechaCreacion;

    @Enumerated(EnumType.STRING)
    private Estatus estatus;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    private Respuesta repuesta;



    //GENERACION DE LOS SETTER AND GETTER


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Respuesta getRepuesta() {
        return repuesta;
    }

    public void setRepuesta(Respuesta repuesta) {
        this.repuesta = repuesta;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
