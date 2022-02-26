package br.edu.ifpb.padroes.estrategy;

import java.math.BigDecimal;
import java.time.Duration;

public class CalculoDiaria implements CalculoTotal {
    public static BigDecimal VALOR_DIARIA = new BigDecimal("26.00");

    @Override
    public BigDecimal Obtemtotal(Duration intervalo) {
        return VALOR_DIARIA.multiply(new BigDecimal(intervalo.toDays()));
    }

}
