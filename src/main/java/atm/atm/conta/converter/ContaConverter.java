package atm.atm.conta.converter;

import atm.atm.conta.dto.ContaDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Objects;

import static atm.atm.utils.ContaUtils.getSomenteNumeros;

@Slf4j
@Component
public class ContaConverter {

    private static final String CC = "CONTA CORRENTE";
    private static final String CP = "CONTA POUPANCA";

    public String montaLayoutDoBuffer() throws Exception {
        try {
            ContaDTO dto = new ContaDTO();
            dto.setConta("001-1");
            dto.setAgencia("001");
            dto.setTipo("CP");
            dto.setSaldo(BigDecimal.valueOf(10.36));

            StringBuilder lpf = new StringBuilder();
            StringBuilder tamanho = new StringBuilder();
            tamanho.append(dto.getConta()).append(dto.getSaldo()).append(dto.getAgencia()).append(dto.getTipo());

            lpf.append("0" + tamanho.length());

            lpf.append("#");

            lpf.append(dto.getAgencia());

            lpf.append("@");

            lpf.append(getSomenteNumeros(dto.getConta()));

            lpf.append("@");

            lpf.append(Objects.equals(dto.getTipo(), "CC")  ? CC : CP);

            lpf.append("@");

            lpf.append(dto.getSaldo());

            lpf.append("@");

            return lpf.toString();
        } catch (Exception e) {
            log.error("Erro ao montar buffer.", e);
            throw new Exception("Erro ao montar buffer.");
        }
    }

}
