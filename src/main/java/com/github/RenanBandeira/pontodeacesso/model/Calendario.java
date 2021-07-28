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

public class Calendario {
    private Long id;
    private String descricao;
    private LocalDateTime dataEspecial;
    @ManyToOne
    private TipoData tipoData;
}
