package com.github.RenanBandeira.pontodeacesso.model;

import lombok.*;

import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder

public class BancoHora {
    private Long id;
    private String categoriaUsuario;
    private LocalDateTime dataTrabalhada;
    private int horasTrabalhadas;
    private int totalHorasTrabalhadas;
    @ManyToOne
    private Movimentacao movimentacao;
    @ManyToOne
    private Usuario usuario;
}
