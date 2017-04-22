/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.riodejaneiro.ingredientes.queijo;

import model.comum.ingredientes.queijo.CreamCheese;

/**
 *
 * @author gabriel
 */
public class CreamCheeseSuaveRJ extends CreamCheese {

    public CreamCheeseSuaveRJ(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Cream Cheese Suave";
    }

    @Override
    public Double getPrecoKilo() {
        return 21.40D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 970D;
    }
    
}
