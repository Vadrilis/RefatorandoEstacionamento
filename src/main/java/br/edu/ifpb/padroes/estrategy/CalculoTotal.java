package br.edu.ifpb.padroes.estrategy;

import java.math.BigDecimal;
import java.time.Duration;

public interface CalculoTotal {
    public BigDecimal Obtemtotal(Duration intervalo);
}
