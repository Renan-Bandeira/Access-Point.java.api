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

public class Ocorrencia {
    private long id;
    private String nome;
    private String descricao;
}
