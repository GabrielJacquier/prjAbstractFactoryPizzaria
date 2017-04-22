/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.selecionarIngredientes;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.comum.ingredientes.Ingrediente;

/**
 *
 * @author Ale
 */
public class JModelTableIngredientes extends AbstractTableModel {
    
     private List<Ingrediente> ingredientes;
    private String[] columns;
    
     public JModelTableIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
        columns = new String[] {"Nome", "Preço", "Qtd. gramas", "Ingrediente incluso"};
    }
    
    @Override
    public int getRowCount() {
        return ingredientes.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ingrediente ingrediente = ingredientes.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return ingrediente.getNome();
            case 1:
                return String.format("R$ %.2f", ingrediente.getValorPorGramas());
            case 2:
                return String.format("0,%.0f Kg", ingrediente.getQuantidadeGramas());
            case 3: 
                return ingrediente.isRemovidaDaPizza() ? "Não" : "Sim";
        }
        return null;
    }

    @Override
    public String getColumnName(int col) {
        return columns[col] ;
    }
    
    public Ingrediente getIngredienteAt(int row){
        return ingredientes.get(row);
    }
    
    public void update() {
        this.fireTableDataChanged();
    }
}
