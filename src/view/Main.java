/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import model.comum.enums.PizzaTamanho;
import model.comum.ingredientes.Ingrediente;
import model.comum.pizza.Pizza;
import model.comum.pizza.Portuguesa;
import model.minasgerais.factory.IngredienteMGFactory;

/**
 *
 * @author gabriel
 */
public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Portuguesa(new IngredienteMGFactory(), PizzaTamanho.GRANDE);
        List<Ingrediente> ingredientes = pizza.ingredientes();
        System.out.println("Pizza: " + pizza.nome());
        ingredientes.forEach(ingrediente -> {
            System.out.println(ingrediente.getInformacoes());
        });
    }
}
