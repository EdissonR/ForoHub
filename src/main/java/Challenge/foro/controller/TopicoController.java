package Challenge.foro.controller;



import Challenge.foro.domain.TopicoDTO;
import Challenge.foro.infra.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/forohub")

public class TopicoController {

    @Autowired
    private TopicoRepository.TopicoService topicoService;

    @GetMapping
    public List<TopicoDTO> getAllTopicos() {
        return topicoService.getAllTopicos();
    }

    @GetMapping("/{id}")
    public TopicoDTO getTopicoById(@PathVariable Long id) {
        return topicoService.getTopicoById(id);
    }

    @PostMapping
    public TopicoDTO createTopico(@RequestBody TopicoDTO topicoDTO) {
        return topicoService.createTopico(topicoDTO);
    }

    @PutMapping("/{id}")
    public TopicoDTO updateTopico(@PathVariable Long id, @RequestBody TopicoDTO topicoDTO) {
        return topicoService.updateTopico(id, topicoDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteTopico(@PathVariable Long id) {
        topicoService.deleteTopico(id);
    }
}
