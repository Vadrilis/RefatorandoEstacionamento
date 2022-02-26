package br.edu.ifpb.padroes;
import br.edu.ifpb.padroes.estrategy.CalculoTotal;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;



@Getter
@Setter
public class Estacionamento {

    private LocalDateTime entrada;
    private LocalDateTime saida;
    private Veiculo veiculo;

    private CalculoTotal calculopadrao;
    private Factory factory;

    public BigDecimal obterTotalAPagar() {

        assert(entrada != null && saida != null && veiculo != null);

        calculopadrao = factory.EscolheTipoDeCalculo(Duration.between(entrada, saida));
        return calculopadrao.Obtemtotal(Duration.between(entrada, saida));
    }

}
