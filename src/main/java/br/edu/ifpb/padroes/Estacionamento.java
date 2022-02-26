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

//    public static BigDecimal VALOR_HORA = new BigDecimal("2.00");
//    public static BigDecimal VALOR_DIARIA = new BigDecimal("26.00");
//    public static BigDecimal VALOR_MENSALIDADE = new BigDecimal("300.00");


    public BigDecimal obterTotalAPagar() {
        assert(entrada != null && saida != null && veiculo != null);
        //long intervalo = Duration.between(entrada, saida).toHours();
        //long periodoDias = Duration.between(entrada, saida).toDays();
        //1  dia  --> 24 horas
        //7  dias --> 168 horas
        //15 dias --> 360 horas
        //30 dias --> 720 horas
        return calculopadrao.Obtemtotal(Duration.between(entrada, saida));


//        BigDecimal valor = new BigDecimal(0);
//        if (periodoHoras < 12) {
//            valor = VALOR_HORA.multiply(new BigDecimal(periodoHoras));
//        } else if (periodoHoras > 12 && periodoDias < 15) {
//            valor = VALOR_DIARIA.multiply(new BigDecimal(periodoDias));
//        } else if (periodoDias > 15) {
//            valor = VALOR_MENSALIDADE;
//        }
//
//        return valor;
    }

}
