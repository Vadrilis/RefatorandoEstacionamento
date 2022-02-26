package br.edu.ifpb.padroes.estrategy;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Duration;

@Getter
@Setter
public class CalculoMensal implements CalculoTotal {
    public static BigDecimal VALOR_MENSALIDADE = new BigDecimal("300.00");

    @Override
    public BigDecimal Obtemtotal(Duration intervalo) {
        return VALOR_MENSALIDADE;
    }
}
