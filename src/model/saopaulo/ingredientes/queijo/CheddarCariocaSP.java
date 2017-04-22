/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.saopaulo.ingredientes.queijo;

import model.comum.ingredientes.queijo.Cheddar;

/**
 *
 * @author gabriel
 */
public class CheddarCariocaSP extends Cheddar {

    public CheddarCariocaSP(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Cheddar Paulista";
    }

    @Override
    public Double getPrecoKilo() {
        return 20D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 990D;
    }
    
}
