/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.saopaulo.ingredientes.carnes;

import model.comum.ingredientes.carne.Frango;

/**
 *
 * @author gabriel
 */
public class FrangoSP extends Frango {

    public FrangoSP(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Frango Paulistano";
    }

    @Override
    public Double getPrecoKilo() {
        return 15D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 9000D;
    }
    
}
