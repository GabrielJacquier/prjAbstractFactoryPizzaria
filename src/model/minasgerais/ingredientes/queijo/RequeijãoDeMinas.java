/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.minasgerais.ingredientes.queijo;

import model.comum.ingredientes.queijo.Catupiry;

/**
 *
 * @author gabriel
 */
public class RequeijãoDeMinas extends Catupiry {

    public RequeijãoDeMinas(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Requeijão de Minas";
    }

    @Override
    public Double getPrecoKilo() {
        return 23D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 890D;
    }
    
}
