/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.minasgerais.ingredientes.saladas;

import model.comum.ingredientes.salada.Alface;

/**
 *
 * @author gabriel
 */
public class AlfaceMG extends Alface {

    public AlfaceMG(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Alface crespo";
    }

    @Override
    public Double getPrecoKilo() {
        return 16D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 120D;
    }
    
}
