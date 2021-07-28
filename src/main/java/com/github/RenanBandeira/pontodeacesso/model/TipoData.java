package com.github.RenanBandeira.pontodeacesso.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder

public class TipoData {
    private Long id;
    private String descricao;
}
