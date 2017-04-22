/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.saopaulo.ingredientes.queijo;

import model.comum.ingredientes.queijo.Catupiry;

/**
 *
 * @author gabriel
 */
public class CatupiryCariocaSP extends Catupiry {

    public CatupiryCariocaSP(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Catupiry Original";
    }

    @Override
    public Double getPrecoKilo() {
        return 18D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 990D;
    }
    
}
