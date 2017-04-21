/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.comum.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import model.comum.factory.IngredienteFactory;
import model.comum.ingredientes.Ingrediente;
import model.comum.ingredientes.carne.Bacon;
import model.comum.ingredientes.queijo.Catupiry;
import model.comum.ingredientes.queijo.Cheddar;
import model.comum.ingredientes.queijo.CreamCheese;

/**
 *
 * @author gabriel
 */
public enum IngredienteBordaEnum {
    BACON(Bacon.class, "Bacon"),
    CHEDDAR(Cheddar.class, "Cheddar"),
    CREAM_CHEESE(CreamCheese.class, "Cream Cheese"),
    CATUPIRY(Catupiry.class, "Catupiry");

    private Class<? extends Ingrediente> classePizza;
    private String label;

    IngredienteBordaEnum(Class classePizza, String label) {
        this.classePizza = classePizza;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    
    public static List<IngredienteBordaEnum> valuesList() {
        return Arrays.stream(IngredienteBordaEnum.values()).collect(Collectors.toList());
    }

    public static IngredienteBordaEnum getEnum(String label) {
        List<IngredienteBordaEnum> ingredientes = Arrays.stream(IngredienteBordaEnum.values()).collect(Collectors.toList());
        return ingredientes.stream().filter(pizza -> pizza.getLabel().equals(label)).findFirst().get();
    }

    public Ingrediente getIntance(IngredienteFactory ingredienteFactory, PizzaTamanho tamanho) {
        switch(this){
            case BACON:
                return ingredienteFactory.getBacon(tamanho.getPorcentagem());
            case CHEDDAR:
                return ingredienteFactory.getCheddar(tamanho.getPorcentagem());
            case CREAM_CHEESE:
                return ingredienteFactory.getCreamCheese(tamanho.getPorcentagem());
            case CATUPIRY:
                return ingredienteFactory.getCatupiry(tamanho.getPorcentagem());
        }
        return null;
    }

}
