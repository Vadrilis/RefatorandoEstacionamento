package br.edu.ifpb.padroes.estrategy;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Duration;

@Getter
@Setter
public class CalculoDiaria implements CalculoTotal {
    public static BigDecimal VALOR_DIARIA = new BigDecimal("26.00");

    @Override
    public BigDecimal Obtemtotal(Duration intervalo) {
        return VALOR_DIARIA.multiply(new BigDecimal(intervalo.toDays()));
    }

}
