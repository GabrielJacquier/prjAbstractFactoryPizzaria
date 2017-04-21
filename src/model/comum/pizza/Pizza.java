/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.comum.pizza;

import java.util.List;
import model.comum.enums.PizzaTamanho;
import java.util.Optional;
import model.comum.factory.IngredienteFactory;
import model.comum.ingredientes.indispensavel.Massa;
import model.comum.ingredientes.indispensavel.Molho;
import model.comum.ingredientes.Ingrediente;
import view.montarPizza.enums.RegiaoEnum;

/**
 *
 * @author gabriel
 */
public abstract class Pizza {

    private IngredienteFactory ingredienteFactory;
    private Massa massa;
    private Molho molho;
    private PizzaTamanho tamanho;
    private Optional<Ingrediente> recheioDaBorda;
    private RegiaoEnum regiao;

    public Pizza(IngredienteFactory ingredienteFactory, PizzaTamanho tamanho) {
        this.ingredienteFactory = ingredienteFactory;
        this.regiao = ingredienteFactory.getRegiao();
        this.massa = ingredienteFactory.getMassa(1.2 * tamanho.getPorcentagem());
        this.molho = ingredienteFactory.getMolho(tamanho.getPorcentagem());
        this.tamanho = tamanho;
        this.recheioDaBorda = Optional.empty();
    }

    public Double valorTotal() {
        return ingredientes().stream().mapToDouble(Ingrediente::getValorPorGramas).sum();
    }

    public abstract String nome();

    public abstract List<Ingrediente> ingredientes();

    public Massa getMassa() {
        return massa;
    }

    public Molho getMolho() {
        return molho;
    }

    public PizzaTamanho getTamanho() {
        return tamanho;
    }

    public Optional<Ingrediente> getRecheioDaBorda() {
        return recheioDaBorda;
    }

    public void setRecheioDaBorda(Ingrediente recheioDaBorda) {
        this.recheioDaBorda = Optional.of(recheioDaBorda);
    }

    public RegiaoEnum getRegiao() {
        return regiao;
    }

    public void setRegiao(RegiaoEnum regiao) {
        this.regiao = regiao;
    }
}
