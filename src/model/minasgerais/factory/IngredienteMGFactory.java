/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.minasgerais.factory;

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
import model.minasgerais.ingredientes.carnes.BaconMG;
import model.minasgerais.ingredientes.carnes.CalabresaMG;
import model.minasgerais.ingredientes.carnes.FrangoMG;
import model.minasgerais.ingredientes.indispensaveis.MassaFina;
import model.minasgerais.ingredientes.indispensaveis.MolhoTomate;
import model.minasgerais.ingredientes.legumes.BrocolisMG;
import model.minasgerais.ingredientes.legumes.ErvilhaMG;
import model.minasgerais.ingredientes.legumes.MilhoMG;
import model.minasgerais.ingredientes.legumes.PalmitoMG;
import model.minasgerais.ingredientes.queijo.CheddarDeMinas;
import model.minasgerais.ingredientes.queijo.CreamCheeseApimentado;
import model.minasgerais.ingredientes.queijo.MussarelaParma;
import model.minasgerais.ingredientes.queijo.RequeijãoDeMinas;
import model.minasgerais.ingredientes.saladas.AlfaceMG;

/**
 *
 * @author gabriel
 */
public class IngredienteMGFactory extends IngredienteFactory {

    @Override
    public Bacon getBacon(Double gramas) {
        return new BaconMG(gramas);
    }

    @Override
    public Calabresa getCalabresa(Double gramas) {
        return new CalabresaMG(gramas);
    }

    @Override
    public Frango getFrango(Double gramas) {
        return new FrangoMG(gramas);
    }

    @Override
    public Brocolis getBrocolis(Double gramas) {
        return new BrocolisMG(gramas);
    }

    @Override
    public Ervilha getErvilha(Double gramas) {
        return new ErvilhaMG(gramas);
    }

    @Override
    public Milho getMilho(Double gramas) {
        return new MilhoMG(gramas);
    }

    @Override
    public Palmito getPalmito(Double gramas) {
        return new PalmitoMG(gramas);
    }

    @Override
    public Catupiry getCatupiry(Double gramas) {
        return new RequeijãoDeMinas(gramas);
    }

    @Override
    public Cheddar getCheddar(Double gramas) {
        return new CheddarDeMinas(gramas);
    }

    @Override
    public CreamCheese getCreamCheese(Double gramas) {
        return new CreamCheeseApimentado(gramas);
    }

    @Override
    public Mussarela getMussarela(Double gramas) {
        return new MussarelaParma(gramas);
    }

    @Override
    public Alface getAlface(Double gramas) {
        return new AlfaceMG(gramas);
    }

    @Override
    public Massa getMassa(Double gramas) {
        return new MassaFina(gramas);
    }

    @Override
    public Molho getMolho(Double gramas) {
        return new MolhoTomate(gramas);
    }

}
