/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bahia.ingredientes.queijo;

import model.minasgerais.ingredientes.queijo.*;
import model.comum.ingredientes.queijo.CreamCheese;

/**
 *
 * @author gabriel
 */
public class CreamCheesePicanteBA extends CreamCheese {

    public CreamCheesePicanteBA(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Cream Cheese Picante Vermelho";
    }

    @Override
    public Double getPrecoKilo() {
        return 27D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 970D;
    }
    
}
