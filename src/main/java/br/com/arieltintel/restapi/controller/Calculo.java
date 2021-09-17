package br.com.arieltintel.restapi.controller;


import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.math.BigDecimal;

@RestController
@RequestMapping("calculo")
public class Calculo {

    @GetMapping("/divisao/{primeiroNumero}/{segundoNumero}")
    public BigDecimal calculoDivisao (@PathVariable("primeiroNumero") BigDecimal primeiroNumero, @PathVariable("segundoNumero") BigDecimal segundoNumero) {
        return primeiroNumero.divide(segundoNumero);
    }

    @GetMapping("/soma/{primeiroNumero}/{segundoNumero}")
    public BigDecimal calculoSoma (@PathVariable("primeiroNumero") BigDecimal primeiroNumero, @PathVariable("segundoNumero") BigDecimal segundoNumero) {
        return primeiroNumero.add(segundoNumero);
    }

    @GetMapping("/subtracao/{primeiroNumero}/{segundoNumero}")
    public BigDecimal calculoSubtracao (@PathVariable("primeiroNumero") BigDecimal primeiroNumero, @PathVariable("segundoNumero") BigDecimal segundoNumero) {
        return primeiroNumero.subtract(segundoNumero);
    }

    @GetMapping("/multiplicacao/{primeiroNumero}/{segundoNumero}")
    public BigDecimal calculoMultiplicacao (@PathVariable("primeiroNumero") BigDecimal primeiroNumero, @PathVariable("segundoNumero") BigDecimal segundoNumero) {
        return primeiroNumero.multiply(segundoNumero);
    }
}
