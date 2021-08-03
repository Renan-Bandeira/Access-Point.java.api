package com.github.RenanBandeira.pontodeacesso.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder

public class BancoHora {


    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHoraId implements Serializable {
        private long idMovimentacao;
        private long idUsuario;
        private long idBancoHora;
}
    @EmbeddedId
    private BancoHoraId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal horasTrabalhadas;
    private BigDecimal saldoHoras;

}
