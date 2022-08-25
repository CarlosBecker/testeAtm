package atm.atm.conta.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContaDTO {

    private String agencia;
    private String conta;
    private String tipo;
    private BigDecimal saldo;

    @Override
    public String toString() {
        return "ContaDTO{" +
                "agencia='" + agencia + '\'' +
                ", conta='" + conta + '\'' +
                ", tipo='" + tipo + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
