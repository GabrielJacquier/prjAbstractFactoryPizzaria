/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.comum.enums;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import model.comum.factory.IngredienteFactory;
import model.comum.ingredientes.Ingrediente;
import model.comum.pizza.DoisQueijos;
import model.comum.pizza.Pizza;
import model.comum.pizza.Portuguesa;

/**
 *
 * @author gabriel
 */
public enum PizzaEnum {
    Portuguesa(Portuguesa.class, "Portuguesa"),
    DoisQueijos(DoisQueijos.class, "Dois Queijos");

    private Class<? extends Pizza> classePizza;
    private String label;

    PizzaEnum(Class classePizza, String label) {
        this.classePizza = classePizza;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    
    public static List<PizzaEnum> valuesList() {
        return Arrays.stream(PizzaEnum.values()).collect(Collectors.toList());
    }

    public static PizzaEnum getEnum(String label) {
        List<PizzaEnum> pizzas = Arrays.stream(PizzaEnum.values()).collect(Collectors.toList());
        return pizzas.stream().filter(pizza -> pizza.getLabel().equals(label)).findFirst().get();
    }

    public Pizza getIntance(IngredienteFactory ingredienteFactory, PizzaTamanho tamanho, Ingrediente borda) {
        try {
            Class[] type = {IngredienteFactory.class, PizzaTamanho.class};
            Constructor cons = classePizza.getConstructor(type);
            Object[] objects = {ingredienteFactory, tamanho};
            Pizza pizza = (Pizza) cons.newInstance(objects);
            pizza.setRecheioDaBorda(borda);
            return pizza;
        } catch (Exception ex) {
            Logger.getLogger(PizzaEnum.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
