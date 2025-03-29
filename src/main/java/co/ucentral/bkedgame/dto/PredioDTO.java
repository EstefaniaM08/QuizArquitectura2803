package co.ucentral.bkedgame.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PredioDTO {
    private String nombre;
    private String direccion;
    private Double area;
    private Double areaCatastral;
    private LocalDate fecRegistro;
}
