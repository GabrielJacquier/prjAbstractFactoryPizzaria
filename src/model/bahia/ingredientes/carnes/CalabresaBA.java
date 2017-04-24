/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bahia.ingredientes.carnes;

import model.minasgerais.ingredientes.carnes.*;
import model.comum.ingredientes.carne.Calabresa;

/**
 *
 * @author gabriel
 */
public class CalabresaBA extends Calabresa {

    public CalabresaBA(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Calabresa Picante";
    }

    @Override
    public Double getPrecoKilo() {
        return 26D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 1800D;
    }
    
}
