package com.github.RenanBandeira.pontodeacesso.model;

import lombok.*;

import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder

public class Localidade {
    private long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;

}
