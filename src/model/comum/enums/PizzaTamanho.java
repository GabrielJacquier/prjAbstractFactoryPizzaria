/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.comum.enums;

/**
 *
 * @author gabriel
 */
public enum PizzaTamanho {
    BROTO(30D),
    MEDIA(50D),
    GRANDE(80D),
    EXTRAGRANDE(100D);

    private Double porcentagem;

    PizzaTamanho(Double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Double getPorcentagem() {
        return porcentagem;
    }
}
