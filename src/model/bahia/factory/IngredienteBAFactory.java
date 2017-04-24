/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bahia.factory;

import model.bahia.ingredientes.carnes.BaconBA;
import model.bahia.ingredientes.carnes.CalabresaBA;
import model.bahia.ingredientes.carnes.FrangoBA;
import model.bahia.ingredientes.indispensaveis.MassaCrocanteBA;
import model.bahia.ingredientes.indispensaveis.MolhoPicanteBA;
import model.bahia.ingredientes.legumes.BrocolisBA;
import model.bahia.ingredientes.legumes.ErvilhaBA;
import model.bahia.ingredientes.legumes.MilhoBA;
import model.bahia.ingredientes.legumes.PalmitoBA;
import model.bahia.ingredientes.queijo.CheddarBA;
import model.bahia.ingredientes.queijo.CreamCheesePicanteBA;
import model.bahia.ingredientes.queijo.MussarelaBA;
import model.bahia.ingredientes.queijo.RequeijaoCremoso;
import model.bahia.ingredientes.saladas.AlfaceBA;
import model.comum.enums.RegiaoEnum;
import model.comum.factory.IngredienteFactory;
import model.comum.ingredientes.carne.Bacon;
import model.comum.ingredientes.carne.Calabresa;
import model.comum.ingredientes.carne.Frango;
import model.comum.ingredientes.indispensavel.Massa;
import model.comum.ingredientes.indispensavel.Molho;
import model.comum.ingredientes.legumes.Brocolis;
import model.comum.ingredientes.legumes.Ervilha;
import model.comum.ingredientes.legumes.Milho;
import model.comum.ingredientes.legumes.Palmito;
import model.comum.ingredientes.queijo.Catupiry;
import model.comum.ingredientes.queijo.Cheddar;
import model.comum.ingredientes.queijo.CreamCheese;
import model.comum.ingredientes.queijo.Mussarela;
import model.comum.ingredientes.salada.Alface;

/**
 *
 * @author Ale
 */
public class IngredienteBAFactory extends IngredienteFactory  {

    @Override
    public Bacon getBacon(Double gramas) {
        return new BaconBA(gramas);
    }

    @Override
    public Calabresa getCalabresa(Double gramas) {
        return new CalabresaBA(gramas);
    }

    @Override
    public Frango getFrango(Double gramas) {
        return new FrangoBA(gramas);
    }

    @Override
    public Brocolis getBrocolis(Double gramas) {
        return new BrocolisBA(gramas);
    }

    @Override
    public Ervilha getErvilha(Double gramas) {
        return new ErvilhaBA(gramas);
    }

    @Override
    public Milho getMilho(Double gramas) {
        return new MilhoBA(gramas);
    }

    @Override
    public Palmito getPalmito(Double gramas) {
        return new PalmitoBA(gramas);
    }

    @Override
    public Catupiry getCatupiry(Double gramas) {
        return new RequeijaoCremoso(gramas);
    }

    @Override
    public Cheddar getCheddar(Double gramas) {
        return new CheddarBA(gramas);
    }

    @Override
    public CreamCheese getCreamCheese(Double gramas) {
        return new CreamCheesePicanteBA(gramas);
    }

    @Override
    public Mussarela getMussarela(Double gramas) {
        return new MussarelaBA(gramas);
    }

    @Override
    public Alface getAlface(Double gramas) {
        return new AlfaceBA(gramas);
    }

    @Override
    public Massa getMassa(Double gramas) {
        return new MassaCrocanteBA(gramas);
    }

    @Override
    public Molho getMolho(Double gramas) {
        return new MolhoPicanteBA(gramas);
    }

    @Override
    public RegiaoEnum getRegiao() {
        return RegiaoEnum.BAHIA;
    }

}  
