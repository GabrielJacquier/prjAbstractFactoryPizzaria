/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.riodejaneiro.ingredientes.indispensaveis;

import model.comum.ingredientes.indispensavel.Massa;

/**
 *
 * @author gabriel
 */
public class MassaGrossaRJ extends Massa {

    public MassaGrossaRJ(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Massa Grossa";
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
