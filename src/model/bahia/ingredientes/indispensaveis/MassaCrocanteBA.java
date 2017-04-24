/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bahia.ingredientes.indispensaveis;

import model.minasgerais.ingredientes.indispensaveis.*;
import model.comum.ingredientes.indispensavel.Massa;

/**
 *
 * @author gabriel
 */
public class MassaCrocanteBA extends Massa {

    public MassaCrocanteBA(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Massa Crocante";
    }

    @Override
    public Double getPrecoKilo() {
        return 11D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 350D;
    }
    
}
