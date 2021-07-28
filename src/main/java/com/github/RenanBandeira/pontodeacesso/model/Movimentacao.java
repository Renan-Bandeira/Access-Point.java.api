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

public class Movimentacao {
    private long id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private int permanencia;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private Calendario calendario;
}
