/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.riodejaneiro.ingredientes.queijo;

import model.comum.ingredientes.queijo.Catupiry;

/**
 *
 * @author gabriel
 */
public class CatupiryCariocaRJ extends Catupiry {

    public CatupiryCariocaRJ(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Catupiry Carioca";
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
