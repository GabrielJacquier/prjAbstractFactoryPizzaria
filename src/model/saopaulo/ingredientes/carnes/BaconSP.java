/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.saopaulo.ingredientes.carnes;

import model.comum.ingredientes.carne.Bacon;

/**
 *
 * @author gabriel
 */
public class BaconSP extends Bacon {

    public BaconSP(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Bacon Paulista";
    }

    @Override
    public Double getPrecoKilo() {
        return 18D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 1500D;
    }
    
}
