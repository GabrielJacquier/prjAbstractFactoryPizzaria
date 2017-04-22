/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.saopaulo.ingredientes.saladas;

import model.comum.ingredientes.salada.Alface;

/**
 *
 * @author gabriel
 */
public class AlfaceSP extends Alface {

    public AlfaceSP(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Alface Liso SP";
    }

    @Override
    public Double getPrecoKilo() {
        return 15D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 120D;
    }
    
}
