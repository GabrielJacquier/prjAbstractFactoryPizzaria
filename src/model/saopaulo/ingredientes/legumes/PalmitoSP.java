/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.saopaulo.ingredientes.legumes;

import model.comum.ingredientes.legumes.Palmito;

/**
 *
 * @author gabriel
 */
public class PalmitoSP extends Palmito {

    public PalmitoSP(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Palmito paulista";
    }

    @Override
    public Double getPrecoKilo() {
        return 22D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 300D;
    }
    
}
