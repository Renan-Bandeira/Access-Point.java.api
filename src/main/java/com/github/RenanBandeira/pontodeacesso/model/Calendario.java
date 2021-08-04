package com.github.RenanBandeira.pontodeacesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {
    @Id
    private Long id;
    private String descricao;
    private LocalDateTime dataEspecial;
    @ManyToOne
    private TipoData tipoData;
}
