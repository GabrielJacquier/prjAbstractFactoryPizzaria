/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.riodejaneiro.ingredientes.indispensaveis;

import model.comum.ingredientes.indispensavel.Molho;

/**
 *
 * @author gabriel
 */
public class MolhoTomateRJ extends Molho {

    public MolhoTomateRJ(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Molho de Tomate";
    }

    @Override
    public Double getPrecoKilo() {
        return 12D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 500D;
    }

}
