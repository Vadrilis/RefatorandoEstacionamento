package br.edu.ifpb.padroes.estrategy;

import java.math.BigDecimal;
import java.time.Duration;

public class CalculoDiaria implements CalculoTotal {
    //private BigDecimal VALOR_DIARIA;
    public static BigDecimal VALOR_DIARIA = new BigDecimal("26.00");


    //public void CalculoDiaria(BigDecimal valor){
    //    this.VALOR_DIARIA = valor;
    //}

    public BigDecimal Obtemtotal(Duration intervalo) {
        return VALOR_DIARIA.multiply(new BigDecimal(intervalo.toDays()));
    }

}
