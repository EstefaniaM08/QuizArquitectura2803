package co.ucentral.bkedgame.persistencia.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Builder
@Data
@Table(name ="predio")
@AllArgsConstructor
@NoArgsConstructor
public class Predio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name ="nombre")
    private String nombre;

    @Column(name ="direccion")
    private String direccion;

    @Column(name ="area")
    private Double area;

    @Column(name ="areaCatastral")
    private Double areaCatastral;

    @Column(name ="fecRegistro")
    private LocalDate fecRegistro;
}
