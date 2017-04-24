/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bahia.ingredientes.queijo;

import model.minasgerais.ingredientes.queijo.*;
import model.comum.ingredientes.queijo.Mussarela;

/**
 *
 * @author gabriel
 */
public class MussarelaBA extends Mussarela {

    public MussarelaBA(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Mussarelaa Bahia";
    }

    @Override
    public Double getPrecoKilo() {
        return 33D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 700D;
    }

}
