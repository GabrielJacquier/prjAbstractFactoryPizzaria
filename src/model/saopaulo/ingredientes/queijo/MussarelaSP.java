/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.saopaulo.ingredientes.queijo;

import model.comum.ingredientes.queijo.Mussarela;

/**
 *
 * @author gabriel
 */
public class MussarelaSP extends Mussarela {

    public MussarelaSP(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Mussarela SP";
    }

    @Override
    public Double getPrecoKilo() {
        return 15D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 700D;
    }

}
