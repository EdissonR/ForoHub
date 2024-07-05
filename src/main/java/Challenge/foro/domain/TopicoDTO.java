package Challenge.foro.domain;

import java.time.LocalDateTime;
import java.util.List;


    public class TopicoDTO {
        private long id;
        private String titulo;
        private String mensaje;
        private Autor autor;
        private List<Respuesta> respuestas;
        private LocalDateTime fechaDeCreacion;

        // Constructor
        public TopicoDTO(long id, String titulo, String mensaje, Autor autor, List<Respuesta> respuestas, LocalDateTime fechaDeCreacion) {
            this.id = id;
            this.titulo = titulo;
            this.mensaje = mensaje;
            this.autor = autor;
            this.respuestas = respuestas;
            this.fechaDeCreacion = fechaDeCreacion;
        }

        // Getters y setters
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
    }

