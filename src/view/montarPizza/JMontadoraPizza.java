/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.montarPizza;

import java.util.ArrayList;
import java.util.List;
import model.comum.enums.IngredienteBordaEnum;
import model.comum.enums.PizzaTamanho;
import model.comum.factory.IngredienteFactory;
import model.comum.pizza.Pizza;
import model.minasgerais.factory.IngredienteMGFactory;
import model.comum.enums.PizzaEnum;
import model.comum.enums.RegiaoEnum;
import model.comum.ingredientes.Ingrediente;
import view.selecionarIngredientes.JSelecionaIngredientes;

/**
 *
 * @author gabriel
 */
public class JMontadoraPizza extends javax.swing.JFrame {

    /**
     * Creates new form JMontadoraPizza
     */
    
    private List<Pizza> pizzas;
    private IngredienteFactory ingredienteFactory;
    private JModelTablePizza modelTablePizza;

    public JMontadoraPizza() {
        initComponents();
        loadTablePizza();
        loadCmbRegiao();
        loadCmbPizza();
        loadCmbTamanho();
        loadCmbBorda();
        ingredienteFactory = new IngredienteMGFactory();
    }

    private void loadTablePizza() {
        this.pizzas = new ArrayList<>();
        modelTablePizza = new JModelTablePizza(pizzas);
        tblPizza.setModel(modelTablePizza);
        
        tblPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateVisibleButtons();
            }
        });
    }

    private void loadCmbRegiao() {
        RegiaoEnum.valuesList().forEach(regiao -> {
            cmbRegiao.addItem(regiao.getLabel());
        });
    }

    private void loadCmbPizza() {
        PizzaEnum.valuesList().forEach(pizza -> {
            cmbPizza.addItem(pizza.getLabel());
        });
    }

    private void loadCmbTamanho() {
        PizzaTamanho.valuesList().forEach(tamanho -> {
            cmbTamanho.addItem(tamanho.getLabel());
        });
    }

    private void loadCmbBorda() {
        cmbBorda.addItem("");
        IngredienteBordaEnum.valuesList().forEach(ingrediente -> {
            cmbBorda.addItem(ingrediente.getLabel());
        });
    }

    private void updateVisibleButtons() {
        btnRemover.setEnabled(tblPizza.getSelectedRows().length > 0);
        btnIngredientes.setEnabled(tblPizza.getSelectedRows().length == 1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPizza = new javax.swing.JTable();
        cmbRegiao = new javax.swing.JComboBox<>();
        cmbPizza = new javax.swing.JComboBox<>();
        qtdPizza = new javax.swing.JSpinner();
        cmbTamanho = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbBorda = new javax.swing.JComboBox<>();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnIngredientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPizza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblPizza);

        qtdPizza.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel1.setText("Região");

        jLabel2.setText("Pizza");

        jLabel3.setText("Qtd.");

        jLabel4.setText("Borda");

        jLabel5.setText("Tamanho");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.setEnabled(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnIngredientes.setText("Ver Ingredientes");
        btnIngredientes.setEnabled(false);
        btnIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngredientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbPizza, 0, 120, Short.MAX_VALUE)
                            .addComponent(cmbRegiao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(qtdPizza)
                                    .addComponent(cmbBorda, 0, 120, Short.MAX_VALUE)
                                    .addComponent(cmbTamanho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnIngredientes)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnAdicionar)
                    .addComponent(btnRemover)
                    .addComponent(btnIngredientes))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        for (int i = 0; i < (int) qtdPizza.getValue() ; i++) {
            adicionaPizza();
        }
        qtdPizza.setValue(1);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int[] rows = tblPizza.getSelectedRows();
        modelTablePizza.removerItemsSelecionados(rows);
        modelTablePizza.update();
        updateVisibleButtons();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngredientesActionPerformed
        int[] rows = tblPizza.getSelectedRows();
        new JSelecionaIngredientes(modelTablePizza.getPizza(rows[0]).ingredientes()).setVisible(true);
    }//GEN-LAST:event_btnIngredientesActionPerformed

    private void adicionaPizza() {
        PizzaTamanho tamanho = PizzaTamanho.getEnum(cmbTamanho.getSelectedItem().toString());
        Ingrediente borda = null;
        if(!cmbBorda.getSelectedItem().toString().isEmpty()) {
            borda = IngredienteBordaEnum.getEnum(cmbBorda.getSelectedItem().toString())
                    .getIntance(ingredienteFactory, tamanho);
        }

        Pizza pizza = PizzaEnum.getEnum(cmbPizza.getSelectedItem().toString())
                .getIntance(this.ingredienteFactory, tamanho, borda);
        modelTablePizza.add(pizza);
        modelTablePizza.update();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JMontadoraPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMontadoraPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMontadoraPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMontadoraPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMontadoraPizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnIngredientes;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cmbBorda;
    private javax.swing.JComboBox<String> cmbPizza;
    private javax.swing.JComboBox<String> cmbRegiao;
    private javax.swing.JComboBox<String> cmbTamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner qtdPizza;
    private javax.swing.JTable tblPizza;
    // End of variables declaration//GEN-END:variables
}
