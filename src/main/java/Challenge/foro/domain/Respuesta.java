package Challenge.foro.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Respuesta {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @NotBlank
        private String mensaje;

        @ManyToOne
        @JoinColumn(name = "topico_id")
        @NotNull
        private Topico topico;

        @NotNull
        private LocalDateTime fechaDeCreacion;

        @ManyToOne
        @JoinColumn(name = "autor_id")
        @NotNull
        private Usuario autor;

    //GETTER AND SETTER


        public Usuario getAutor() {
            return autor;
        }

        public void setAutor(Usuario autor) {
            this.autor = autor;
        }

        public LocalDateTime getFechaDeCreacion() {
            return fechaDeCreacion;
        }

        public void setFechaDeCreacion(LocalDateTime fechaDeCreacion) {
            this.fechaDeCreacion = fechaDeCreacion;
        }

        public Topico getTopico() {
            return topico;
        }

        public void setTopico(Topico topico) {
            this.topico = topico;
        }

        public String getMensaje() {
            return mensaje;
        }

        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }
}

