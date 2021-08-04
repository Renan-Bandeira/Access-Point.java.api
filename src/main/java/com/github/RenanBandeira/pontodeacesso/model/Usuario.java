package com.github.RenanBandeira.pontodeacesso.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    private Long id;
    private String nome;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    @ManyToOne
    private NivelAcesso nivelacesso;
    @ManyToOne
    private JornadaTrabalho jonardaTranalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;

}
