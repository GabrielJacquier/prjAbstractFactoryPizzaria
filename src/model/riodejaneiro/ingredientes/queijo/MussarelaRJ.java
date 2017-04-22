/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.riodejaneiro.ingredientes.queijo;

import model.comum.ingredientes.queijo.Mussarela;

/**
 *
 * @author gabriel
 */
public class MussarelaRJ extends Mussarela {

    public MussarelaRJ(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Mussarelaa RJ";
    }

    @Override
    public Double getPrecoKilo() {
        return 13D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 700D;
    }

}
