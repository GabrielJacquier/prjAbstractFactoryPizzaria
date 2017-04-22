/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.riodejaneiro.factory;

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
import model.minasgerais.ingredientes.indispensaveis.MassaFina;
import model.minasgerais.ingredientes.indispensaveis.MolhoTomate;
import model.comum.enums.RegiaoEnum;
import model.riodejaneiro.ingredientes.carnes.BaconRJ;
import model.riodejaneiro.ingredientes.carnes.CalabresaRJ;
import model.riodejaneiro.ingredientes.carnes.FrangoRJ;
import model.riodejaneiro.ingredientes.indispensaveis.MassaGrossaRJ;
import model.riodejaneiro.ingredientes.indispensaveis.MolhoTomateRJ;
import model.riodejaneiro.ingredientes.legumes.BrocolisRJ;
import model.riodejaneiro.ingredientes.legumes.ErvilhaRJ;
import model.riodejaneiro.ingredientes.legumes.MilhoRJ;
import model.riodejaneiro.ingredientes.legumes.PalmitoRJ;
import model.riodejaneiro.ingredientes.queijo.CatupiryCariocaRJ;
import model.riodejaneiro.ingredientes.queijo.CheddarCariocaRJ;
import model.riodejaneiro.ingredientes.queijo.CreamCheeseSuaveRJ;
import model.riodejaneiro.ingredientes.queijo.MussarelaRJ;
import model.riodejaneiro.ingredientes.saladas.AlfaceRJ;

/**
 *
 * @author gabriel
 */
public class IngredienteRJFactory extends IngredienteFactory {

    @Override
    public Bacon getBacon(Double gramas) {
        return new BaconRJ(gramas);
    }

    @Override
    public Calabresa getCalabresa(Double gramas) {
        return new CalabresaRJ(gramas);
    }

    @Override
    public Frango getFrango(Double gramas) {
        return new FrangoRJ(gramas);
    }

    @Override
    public Brocolis getBrocolis(Double gramas) {
        return new BrocolisRJ(gramas);
    }

    @Override
    public Ervilha getErvilha(Double gramas) {
        return new ErvilhaRJ(gramas);
    }

    @Override
    public Milho getMilho(Double gramas) {
        return new MilhoRJ(gramas);
    }

    @Override
    public Palmito getPalmito(Double gramas) {
        return new PalmitoRJ(gramas);
    }

    @Override
    public Catupiry getCatupiry(Double gramas) {
        return new CatupiryCariocaRJ(gramas);
    }

    @Override
    public Cheddar getCheddar(Double gramas) {
        return new CheddarCariocaRJ(gramas);
    }

    @Override
    public CreamCheese getCreamCheese(Double gramas) {
        return new CreamCheeseSuaveRJ(gramas);
    }

    @Override
    public Mussarela getMussarela(Double gramas) {
        return new MussarelaRJ(gramas);
    }

    @Override
    public Alface getAlface(Double gramas) {
        return new AlfaceRJ(gramas);
    }

    @Override
    public Massa getMassa(Double gramas) {
        return new MassaGrossaRJ(gramas);
    }

    @Override
    public Molho getMolho(Double gramas) {
        return new MolhoTomateRJ(gramas);
    }

    @Override
    public RegiaoEnum getRegiao() {
        return RegiaoEnum.RIO_DE_JANEIRO;
    }

}
