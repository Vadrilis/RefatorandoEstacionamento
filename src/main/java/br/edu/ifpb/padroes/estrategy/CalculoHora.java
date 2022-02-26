package br.edu.ifpb.padroes.estrategy;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Duration;

@Getter
@Setter
public class CalculoHora implements CalculoTotal {

    public static BigDecimal VALOR_HORA = new BigDecimal("2.00");

    @Override
    public BigDecimal Obtemtotal(Duration intervalo) {
        return VALOR_HORA.multiply(new BigDecimal(intervalo.toHours()));
    }
}
