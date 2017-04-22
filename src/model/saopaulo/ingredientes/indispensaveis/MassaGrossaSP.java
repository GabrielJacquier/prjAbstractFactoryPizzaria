/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.saopaulo.ingredientes.indispensaveis;

import model.comum.ingredientes.indispensavel.Massa;

/**
 *
 * @author gabriel
 */
public class MassaGrossaSP extends Massa {

    public MassaGrossaSP(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Massa SP";
    }

    @Override
    public Double getPrecoKilo() {
        return 9D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 300D;
    }
    
}
