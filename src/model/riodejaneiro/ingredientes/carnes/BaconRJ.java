/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.riodejaneiro.ingredientes.carnes;

import model.comum.ingredientes.carne.Bacon;

/**
 *
 * @author gabriel
 */
public class BaconRJ extends Bacon {

    public BaconRJ(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Bacon Carioca";
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
