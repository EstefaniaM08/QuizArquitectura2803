package co.ucentral.bkedgame.controladores;

import co.ucentral.bkedgame.dto.PredioDTO;
import co.ucentral.bkedgame.persistencia.entidades.Predio;
import co.ucentral.bkedgame.servicios.PredioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/predios")
public class PredioControlador {

    @Autowired
    private PredioServicio predioServicio;

    @GetMapping("/listar")
    public List<Predio> listar() {
        return predioServicio.listarTodos();
    }

    @PostMapping("/crear")
    public Predio crear(@RequestBody PredioDTO predio) {
        return predioServicio.crear(predio);
    }
}
