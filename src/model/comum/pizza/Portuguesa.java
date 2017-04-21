/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.comum.pizza;

import java.util.ArrayList;
import java.util.List;
import model.comum.enums.PizzaTamanho;
import model.comum.factory.IngredienteFactory;
import model.comum.ingredientes.Ingrediente;
import model.comum.ingredientes.legumes.Ervilha;
import model.comum.ingredientes.legumes.Milho;
import model.comum.ingredientes.legumes.Palmito;
import model.comum.ingredientes.queijo.Catupiry;
import model.comum.ingredientes.queijo.Mussarela;

/**
 *
 * @author gabriel
 */
public class Portuguesa extends Pizza {

    private Catupiry catupiry;
    private Mussarela mussarela;
    private Palmito palmito;
    private Ervilha ervilha;
    private Milho milho;

    public Portuguesa(IngredienteFactory ingredienteFactory, PizzaTamanho tamanho) {
        super(ingredienteFactory, tamanho);
        catupiry = ingredienteFactory.getCatupiry(150D);
        mussarela = ingredienteFactory.getMussarela(100D);
        palmito = ingredienteFactory.getPalmito(100D);
        ervilha = ingredienteFactory.getErvilha(100D);
        milho = ingredienteFactory.getMilho(100D);
    }

    @Override
    public String nome() {
        return "Portuguesa";
    }

    @Override
    public List<Ingrediente> ingredientes() {
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(getMolho());
        ingredientes.add(getMassa());
        ingredientes.add(catupiry);
        ingredientes.add(catupiry);
        ingredientes.add(mussarela);
        ingredientes.add(palmito);
        ingredientes.add(ervilha);
        ingredientes.add(milho);
        return ingredientes;
    }

}
