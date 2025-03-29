package co.ucentral.bkedgame.persistencia.repositorios;

import co.ucentral.bkedgame.persistencia.entidades.Predio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PredioRepositorio extends JpaRepository<Predio, UUID> {
}
