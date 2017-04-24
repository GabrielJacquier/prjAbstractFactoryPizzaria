/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bahia.ingredientes.carnes;

import model.minasgerais.ingredientes.carnes.*;
import model.comum.ingredientes.carne.Frango;

/**
 *
 * @author gabriel
 */
public class FrangoBA extends Frango {

    public FrangoBA(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Frango Desfiado Temperado";
    }

    @Override
    public Double getPrecoKilo() {
        return 20D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 10000D;
    }
    
}
