/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.minasgerais.ingredientes.queijo;

import model.comum.ingredientes.queijo.Cheddar;

/**
 *
 * @author gabriel
 */
public class CheddarDeMinas extends Cheddar {

    public CheddarDeMinas(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Cheddar e Minas";
    }

    @Override
    public Double getPrecoKilo() {
        return 21D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 990D;
    }
    
}
