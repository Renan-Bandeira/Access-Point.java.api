package com.github.RenanBandeira.pontodeacesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class CategoriaUsuario {
    @Id
    private long id;
    private String descricao;

}
