/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.saopaulo.ingredientes.queijo;

import model.comum.ingredientes.queijo.CreamCheese;

/**
 *
 * @author gabriel
 */
public class CreamCheeseSuaveSP extends CreamCheese {

    public CreamCheeseSuaveSP(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Cream Cheese SP";
    }

    @Override
    public Double getPrecoKilo() {
        return 17.50D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 970D;
    }
    
}
