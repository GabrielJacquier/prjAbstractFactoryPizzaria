/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.riodejaneiro.ingredientes.saladas;

import model.comum.ingredientes.salada.Alface;

/**
 *
 * @author gabriel
 */
public class AlfaceRJ extends Alface {

    public AlfaceRJ(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Alface Liso";
    }

    @Override
    public Double getPrecoKilo() {
        return 16D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 120D;
    }
    
}
