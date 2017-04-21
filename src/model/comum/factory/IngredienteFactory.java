/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.comum.factory;

import model.comum.ingredientes.indispensavel.Massa;
import model.comum.ingredientes.indispensavel.Molho;
import model.comum.ingredientes.carne.Bacon;
import model.comum.ingredientes.carne.Calabresa;
import model.comum.ingredientes.carne.Frango;
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
 * @author gabriel
 */
public abstract class IngredienteFactory {

    public abstract Bacon getBacon(Double gramas);

    public abstract Calabresa getCalabresa(Double gramas);

    public abstract Frango getFrango(Double gramas);

    public abstract Brocolis getBrocolis(Double gramas);

    public abstract Ervilha getErvilha(Double gramas);

    public abstract Milho getMilho(Double gramas);

    public abstract Palmito getPalmito(Double gramas);

    public abstract Catupiry getCatupiry(Double gramas);

    public abstract Cheddar getCheddar(Double gramas);

    public abstract CreamCheese getCreamCheese(Double gramas);

    public abstract Mussarela getMussarela(Double gramas);

    public abstract Alface getAlface(Double gramas);

    public abstract Massa getMassa(Double gramas);

    public abstract Molho getMolho(Double gramas);
}
