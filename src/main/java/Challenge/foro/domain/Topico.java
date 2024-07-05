package Challenge.foro.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Entity
@Table(name = "topico")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;

    @NotBlank
    @Getter
    @Setter
    private String titulo;

    @NotBlank
    @Getter
    @Setter
    private String mensaje;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    @NotNull
    @Getter
    @Setter
    private Autor autor;

    @OneToMany(mappedBy = "topico")
    @Getter
    @Setter
    private List<Respuesta> respuestas;

    @NotNull
    @Getter
    @Setter
    private LocalDateTime fechaDeCreacion;

    public Topico() {

    }

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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public LocalDateTime getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDateTime fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Topico(long id, String titulo, String mensaje, Autor autor, List<Respuesta> respuestas, LocalDateTime fechaDeCreacion) {
        this.id = id;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.autor = autor;
        this.respuestas = respuestas;
        this.fechaDeCreacion = fechaDeCreacion;
    }
}






