/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.minasgerais.ingredientes.queijo;

import model.comum.ingredientes.queijo.CreamCheese;

/**
 *
 * @author gabriel
 */
public class CreamCheeseApimentado extends CreamCheese {

    public CreamCheeseApimentado(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Cream Cheese Apimentado";
    }

    @Override
    public Double getPrecoKilo() {
        return 25.80D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 970D;
    }
    
}
