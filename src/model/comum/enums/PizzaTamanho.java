/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.comum.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import view.montarPizza.enums.PizzaEnum;

/**
 *
 * @author gabriel
 */
public enum PizzaTamanho {
    BROTO(30D, "Broto"),
    MEDIA(50D, "Média"),
    GRANDE(80D, "Grande"),
    EXTRAGRANDE(100D, "Extra Grande");

    private Double porcentagem;
    private String label;

    PizzaTamanho(Double porcentagem, String label) {
        this.porcentagem = porcentagem;
        this.label = label;
    }

    public Double getPorcentagem() {
        return porcentagem;
    }
    
        public String getLabel() {
        return label;
    }
    
    public static List<PizzaTamanho> valuesList() {
        return Arrays.stream(PizzaTamanho.values()).collect(Collectors.toList());
    }

    public PizzaEnum getEnum(String label) {
        List<PizzaEnum> pizzas = Arrays.stream(PizzaEnum.values()).collect(Collectors.toList());
        return pizzas.stream().filter(pizza -> pizza.getLabel().equals(label)).findFirst().get();
    }
}
