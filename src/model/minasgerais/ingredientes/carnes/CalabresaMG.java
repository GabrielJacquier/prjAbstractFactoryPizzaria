/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.minasgerais.ingredientes.carnes;

import model.comum.ingredientes.carne.Calabresa;

/**
 *
 * @author gabriel
 */
public class CalabresaMG extends Calabresa {

    public CalabresaMG(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Calabresa de Minas";
    }

    @Override
    public Double getPrecoKilo() {
        return 20D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 1500D;
    }
    
}
