package br.edu.ifpb.padroes.estrategy;

import java.math.BigDecimal;
import java.time.Duration;

public class CalculoMensal implements CalculoTotal {
    public static BigDecimal VALOR_MENSALIDADE = new BigDecimal("300.00");

    @Override
    public BigDecimal Obtemtotal(Duration intervalo) {
        return VALOR_MENSALIDADE;
    }
}
