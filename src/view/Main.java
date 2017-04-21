/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.comum.enums.IngredienteBordaEnum;
import model.comum.enums.PizzaTamanho;
import model.comum.pizza.Pizza;
import model.minasgerais.factory.IngredienteMGFactory;
import model.minasgerais.ingredientes.queijo.CheddarDeMinas;
import model.comum.enums.PizzaEnum;
import model.comum.ingredientes.Ingrediente;

/**
 *
 * @author gabriel
 */
public class Main {

    public static void main(String[] args) throws Exception {
//        Pizza pizza = new Portuguesa(new IngredienteMGFactory(), PizzaTamanho.GRANDE);
//        Pizza pizza2 = new DoisQueijos(new IngredienteMGFactory(), PizzaTamanho.GRANDE);
//        
//        System.out.println("Pizza: " + pizza.nome());
//        pizza.ingredientes().forEach(ingrediente -> {
//            System.out.print(ingrediente.getInformacoes());
//        });
//        
//        System.out.println("\nPizza 2: " + pizza2.nome());
//        pizza2.ingredientes().forEach(ingrediente -> {
//            System.out.print("Ingrediente removido: " + ingrediente.isRemovidaDaPizza() + " ");
//            System.out.print(ingrediente.getInformacoes());
//        });

//        Pizza pizza = PizzaEnum.Portuguesa.getIntance(new IngredienteMGFactory(), 
//                        PizzaTamanho.GRANDE, 
//                        new CheddarDeMinas(20D));

        Ingrediente ingrediente = IngredienteBordaEnum.BACON.getIntance(new IngredienteMGFactory(), PizzaTamanho.GRANDE);
        System.out.println(ingrediente.getNome());
    }
}
