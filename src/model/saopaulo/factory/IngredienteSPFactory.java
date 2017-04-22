/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.saopaulo.factory;

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
import model.comum.enums.RegiaoEnum;
import model.riodejaneiro.ingredientes.indispensaveis.MassaGrossaRJ;
import model.riodejaneiro.ingredientes.indispensaveis.MolhoTomateRJ;
import model.riodejaneiro.ingredientes.queijo.CatupiryCariocaRJ;
import model.riodejaneiro.ingredientes.queijo.CheddarCariocaRJ;
import model.riodejaneiro.ingredientes.queijo.CreamCheeseSuaveRJ;
import model.riodejaneiro.ingredientes.queijo.MussarelaRJ;
import model.riodejaneiro.ingredientes.saladas.AlfaceRJ;
import model.saopaulo.ingredientes.carnes.BaconSP;
import model.saopaulo.ingredientes.carnes.CalabresaSP;
import model.saopaulo.ingredientes.carnes.FrangoSP;
import model.saopaulo.ingredientes.indispensaveis.MassaGrossaSP;
import model.saopaulo.ingredientes.indispensaveis.MolhoTomateSP;
import model.saopaulo.ingredientes.legumes.BrocolisSP;
import model.saopaulo.ingredientes.legumes.ErvilhaSP;
import model.saopaulo.ingredientes.legumes.MilhoSP;
import model.saopaulo.ingredientes.legumes.PalmitoSP;
import model.saopaulo.ingredientes.queijo.CatupiryCariocaSP;
import model.saopaulo.ingredientes.queijo.CheddarCariocaSP;
import model.saopaulo.ingredientes.queijo.CreamCheeseSuaveSP;
import model.saopaulo.ingredientes.queijo.MussarelaSP;
import model.saopaulo.ingredientes.saladas.AlfaceSP;

/**
 *
 * @author gabriel
 */
public class IngredienteSPFactory extends IngredienteFactory {

    @Override
    public Bacon getBacon(Double gramas) {
        return new BaconSP(gramas);
    }

    @Override
    public Calabresa getCalabresa(Double gramas) {
        return new CalabresaSP(gramas);
    }

    @Override
    public Frango getFrango(Double gramas) {
        return new FrangoSP(gramas);
    }

    @Override
    public Brocolis getBrocolis(Double gramas) {
        return new BrocolisSP(gramas);
    }

    @Override
    public Ervilha getErvilha(Double gramas) {
        return new ErvilhaSP(gramas);
    }

    @Override
    public Milho getMilho(Double gramas) {
        return new MilhoSP(gramas);
    }

    @Override
    public Palmito getPalmito(Double gramas) {
        return new PalmitoSP(gramas);
    }

    @Override
    public Catupiry getCatupiry(Double gramas) {
        return new CatupiryCariocaSP(gramas);
    }

    @Override
    public Cheddar getCheddar(Double gramas) {
        return new CheddarCariocaSP(gramas);
    }

    @Override
    public CreamCheese getCreamCheese(Double gramas) {
        return new CreamCheeseSuaveSP(gramas);
    }

    @Override
    public Mussarela getMussarela(Double gramas) {
        return new MussarelaSP(gramas);
    }

    @Override
    public Alface getAlface(Double gramas) {
        return new AlfaceSP(gramas);
    }

    @Override
    public Massa getMassa(Double gramas) {
        return new MassaGrossaSP(gramas);
    }

    @Override
    public Molho getMolho(Double gramas) {
        return new MolhoTomateSP(gramas);
    }

    @Override
    public RegiaoEnum getRegiao() {
        return RegiaoEnum.SAO_PAULO;
    }

}
