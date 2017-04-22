/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.montarPizza;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.comum.pizza.Pizza;

/**
 *
 * @author gabriel
 */
public class JModelTablePizza  extends AbstractTableModel {

    private List<Pizza> pizzas;
    private String[] columns;

    public JModelTablePizza(List<Pizza> pizzas) {
        this.pizzas = pizzas;
        columns = new String[] {"Nome", "Tamanho", "Borda Recheada", "Região", "Valor"};
    }

    @Override
    public int getRowCount() {
        return pizzas.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pizza pizza = pizzas.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return pizza.nome();
            case 1:
                return pizza.getTamanho().getLabel();
            case 2:
                return pizza.getRecheioDaBorda().isPresent() ? pizza.getRecheioDaBorda().get().getNome() : "-";
            case 3:
                return pizza.getRegiao().getLabel();            
            case 4:
                return pizza.valorTotal() != null ? String.format("R$ %.2f", pizza.valorTotal()) : "";
        }
        return null;
    }

    @Override
    public String getColumnName(int col) {
        return columns[col] ;
    }
    
    public void add(Pizza pizza) {
        pizzas.add(pizza);
    }
    
    public void removerItemsSelecionados(int selectedRows[]) {
        List<Pizza> pizzasParaRemover = new ArrayList<>();
        for (int i = 0; i < selectedRows.length; i++) {
            pizzasParaRemover.add(pizzas.get(selectedRows[i]));
        }
        pizzas.removeAll(pizzasParaRemover);
    }
    
    public Pizza getPizza(int index){
        return pizzas.get(index);
    }
    
    public void update() {
        this.fireTableDataChanged();
    }
}
