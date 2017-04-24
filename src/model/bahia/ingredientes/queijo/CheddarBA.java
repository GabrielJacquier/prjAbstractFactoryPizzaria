/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bahia.ingredientes.queijo;

import model.minasgerais.ingredientes.queijo.*;
import model.comum.ingredientes.queijo.Cheddar;

/**
 *
 * @author gabriel
 */
public class CheddarBA extends Cheddar {

    public CheddarBA(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Cheddar Cremoso";
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
