package atm.atm.conta;

import atm.atm.conta.converter.ContaConverter;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/conta")
public class ContaRest {

    private ContaConverter contaConverter;

    @GetMapping()
    public String buffer() throws Exception {
        return contaConverter.montaLayoutDoBuffer();
    }
}
