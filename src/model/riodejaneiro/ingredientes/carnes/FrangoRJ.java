/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.riodejaneiro.ingredientes.carnes;

import model.comum.ingredientes.carne.Frango;

/**
 *
 * @author gabriel
 */
public class FrangoRJ extends Frango {

    public FrangoRJ(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Frango carioca";
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
