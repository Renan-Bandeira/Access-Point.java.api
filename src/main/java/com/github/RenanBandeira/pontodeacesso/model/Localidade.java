package com.github.RenanBandeira.pontodeacesso.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder

public class Localidade {
    private long id;
    private NivelAcesso nivelAcesso;
    private String descricao;

}
