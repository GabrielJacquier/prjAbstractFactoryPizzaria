/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.comum.ingredientes;

/**
 *
 * @author gabriel
 */
public abstract class Ingrediente {

    private Double quantidade;
    private boolean removidaDaPizza;

    public Ingrediente(Double quantidade) {
        this.quantidade = quantidade;
    }

    public abstract String getNome();

    public abstract Double getPrecoKilo();

    public abstract Double getKiloCaloriasPorKilo();

    public Double getQuantidadeGramas() {
        return quantidade;
    }

    public void setQuantidadeGramas(Double quantidade) {
        this.quantidade = quantidade;
    }
    
    public Double getValorPorGramas() {
        return (this.getPrecoKilo() / 1000) * this.getQuantidadeGramas();
    }

    public String getInformacoes() {
        return String.format("Ingrediente: %s, Quantidade gramas: %.2f, Valor: %.2f, Calorias Kg: %.2f\n",
                this.getNome(), this.quantidade, this.getValorPorGramas(), this.getKiloCaloriasPorKilo());
    }

    public boolean isRemovidaDaPizza() {
        return removidaDaPizza;
    }

    public void setRemovidaDaPizza(boolean removidaDaPizza) {
        this.removidaDaPizza = removidaDaPizza;
    }
}
