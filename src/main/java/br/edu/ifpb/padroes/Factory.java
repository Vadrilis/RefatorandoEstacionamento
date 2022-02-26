package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.estrategy.CalculoDiaria;
import br.edu.ifpb.padroes.estrategy.CalculoHora;
import br.edu.ifpb.padroes.estrategy.CalculoMensal;
import br.edu.ifpb.padroes.estrategy.CalculoTotal;

import java.math.BigDecimal;
import java.time.Duration;

public class Factory {

    public CalculoTotal EscolheTipoDeCalculo(Duration intervalo){
        if (intervalo.toHours() < 12) {
            return new CalculoHora();
        } else if (intervalo.toHours() > 12 && intervalo.toDays() < 15) {
            return new CalculoDiaria();
        } else if (intervalo.toDays() > 15) {
            return new CalculoMensal();
        }
        return null;
    }

}
