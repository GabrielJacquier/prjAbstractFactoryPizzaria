/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.saopaulo.ingredientes.legumes;

import model.comum.ingredientes.legumes.Milho;

/**
 *
 * @author gabriel
 */
public class MilhoSP extends Milho {

    public MilhoSP(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Milho SP";
    }

    @Override
    public Double getPrecoKilo() {
        return 22D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 100D;
    }
    
}
