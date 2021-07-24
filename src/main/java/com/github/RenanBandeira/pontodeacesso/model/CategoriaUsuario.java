package com.github.RenanBandeira.pontodeacesso.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder

public class CategoriaUsuario {
    private long id;
    private String descricao;

}
