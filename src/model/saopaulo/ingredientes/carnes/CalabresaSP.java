/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.saopaulo.ingredientes.carnes;

import model.comum.ingredientes.carne.Calabresa;

/**
 *
 * @author gabriel
 */
public class CalabresaSP extends Calabresa {

    public CalabresaSP(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Calabresa SP";
    }

    @Override
    public Double getPrecoKilo() {
        return 17D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 1500D;
    }
    
}
