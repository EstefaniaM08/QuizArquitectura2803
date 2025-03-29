package co.ucentral.bkedgame.servicios;

import co.ucentral.bkedgame.dto.PredioDTO;
import co.ucentral.bkedgame.persistencia.entidades.Predio;
import co.ucentral.bkedgame.persistencia.repositorios.PredioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PredioServicio {

    @Autowired
    private PredioRepositorio predioRepositorio;

    public List<Predio> listarTodos() {
        return predioRepositorio.findAll();
    }

    public Predio crear(PredioDTO predioDTO) {
        Predio predio = Predio.builder()
            .area(predioDTO.getArea())
            .direccion(predioDTO.getDireccion())
            .nombre(predioDTO.getNombre())
            .fecRegistro(predioDTO.getFecRegistro())
            .areaCatastral(predioDTO.getAreaCatastral())
            .build();
        return predioRepositorio.save(predio);
    }
}

