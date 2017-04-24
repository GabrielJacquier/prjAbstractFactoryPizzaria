/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bahia.ingredientes.indispensaveis;

import model.minasgerais.ingredientes.indispensaveis.*;
import model.comum.ingredientes.indispensavel.Molho;

/**
 *
 * @author gabriel
 */
public class MolhoPicanteBA extends Molho {

    public MolhoPicanteBA(Double quantidade) {
        super(quantidade);
    }

    @Override
    public String getNome() {
        return "Molho Picante Nordestino";
    }

    @Override
    public Double getPrecoKilo() {
        return 14D;
    }

    @Override
    public Double getKiloCaloriasPorKilo() {
        return 400D;
    }

}
