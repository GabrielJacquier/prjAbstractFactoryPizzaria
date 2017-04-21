/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.minasgerais.ingredientes.carnes;

import model.comum.ingredientes.carne.Frango;

/**
 *
 * @author gabriel
 */
public class FrangoMG extends Frango {

    public FrangoMG(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Frangão de Minas gerais";
    }

    @Override
    public Double getPrecoKilo() {
        return 18D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 9000D;
    }
    
}
