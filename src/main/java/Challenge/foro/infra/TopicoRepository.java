package Challenge.foro.infra;


import Challenge.foro.domain.Topico;
import Challenge.foro.domain.TopicoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public interface TopicoRepository extends JpaRepository<Topico, Long> {
    @Service
    class TopicoService {

        @Autowired
        private TopicoRepository topicoRepository;

        public List<TopicoDTO> getAllTopicos() {
            return topicoRepository.findAll().stream()
                    .map(topico -> new TopicoDTO(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getAutor(), topico.getRespuestas(), topico.getFechaDeCreacion()))
                    .collect(Collectors.toList());
        }

        public TopicoDTO getTopicoById(Long id) {
            Topico topico = topicoRepository.findById(id).orElseThrow(() -> new RuntimeException("Topico not found"));
            return new TopicoDTO(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getAutor(), topico.getRespuestas(), topico.getFechaDeCreacion());
        }

        public TopicoDTO createTopico(TopicoDTO topicoDTO) {
            Topico topico = new Topico();
            topico.setTitulo(topicoDTO.getTitulo());
            topico.setMensaje(topicoDTO.getMensaje());
            topico.setAutor(topicoDTO.getAutor());
            topico.setRespuestas(topicoDTO.getRespuestas());
            topico.setFechaDeCreacion(topicoDTO.getFechaDeCreacion());
            topico = topicoRepository.save(topico);
            return new TopicoDTO(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getAutor(), topico.getRespuestas(), topico.getFechaDeCreacion());
        }

        public TopicoDTO updateTopico(Long id, TopicoDTO topicoDTO) {
            Topico topico = topicoRepository.findById(id).orElseThrow(() -> new RuntimeException("Topico not found"));
            topico.setTitulo(topicoDTO.getTitulo());
            topico.setMensaje(topicoDTO.getMensaje());
            topico.setAutor(topicoDTO.getAutor());
            topico.setRespuestas(topicoDTO.getRespuestas());
            topico.setFechaDeCreacion(topicoDTO.getFechaDeCreacion());
            topico = topicoRepository.save(topico);
            return new TopicoDTO(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getAutor(), topico.getRespuestas(), topico.getFechaDeCreacion());
        }

        public void deleteTopico(Long id) {
            topicoRepository.deleteById(id);
        }
    }
}
