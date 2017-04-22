/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.saopaulo.ingredientes.legumes;

import model.comum.ingredientes.legumes.Ervilha;

/**
 *
 * @author gabriel
 */
public class ErvilhaSP extends Ervilha {

    public ErvilhaSP(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Ervilha Sp";
    }

    @Override
    public Double getPrecoKilo() {
        return 11D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 300D;
    }
    
}
