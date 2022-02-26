package br.edu.ifpb.padroes.estrategy;

import java.math.BigDecimal;
import java.time.Duration;

public class CalculoMensal implements CalculoTotal {
    //private BigDecimal VALOR_MENSALIDADE;
    public static BigDecimal VALOR_MENSALIDADE = new BigDecimal("300.00");



    //public void CalculoMensal(BigDecimal valor){
    //    this.VALOR_MENSALIDADE = valor;
    //}

    public BigDecimal Obtemtotal(Duration intervalo) {
        return VALOR_MENSALIDADE.multiply(new BigDecimal(intervalo.toDays()));
    }
}
