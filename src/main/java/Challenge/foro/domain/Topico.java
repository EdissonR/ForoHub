package Challenge.foro.domain;

import jakarta.persistence.*;


@Entity
public class Topico {


    //DEFINIENDO LOS ATRIBUTOS DEL TOPICO
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String titulo;

    private String mensaje;

    private String fechaCreacion;

    @Enumerated(EnumType.STRING)
    private Estatus estatus;

    private String autor;

    private String curso;

    private String repuesta;



    //GENERACION DE LOS SETTER AND GETTER

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRepuesta() {
        return repuesta;
    }

    public void setRepuesta(String repuesta) {
        this.repuesta = repuesta;
    }
}
