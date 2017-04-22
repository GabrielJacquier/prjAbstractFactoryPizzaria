/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.riodejaneiro.ingredientes.legumes;

import model.comum.ingredientes.legumes.Ervilha;

/**
 *
 * @author gabriel
 */
public class ErvilhaRJ extends Ervilha {

    public ErvilhaRJ(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Ervilha";
    }

    @Override
    public Double getPrecoKilo() {
        return 9D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 300D;
    }
    
}
