/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.montarPizza;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import model.comum.enums.IngredienteBordaEnum;
import model.comum.enums.PizzaTamanho;
import model.comum.factory.IngredienteFactory;
import model.comum.pizza.Pizza;
import model.minasgerais.factory.IngredienteMGFactory;
import model.comum.enums.PizzaEnum;
import model.comum.enums.RegiaoEnum;
import model.comum.ingredientes.Ingrediente;
import view.selecionarIngredientes.JSelecionaIngredientes;
import view.usuario.SClient;

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

    public JMontadoraPizza(List<Pizza> pizzas) {
        this.pizzas = pizzas;
        initComponents();
        loadTablePizza(this.pizzas);
        loadCmbRegiao();
        loadCmbPizza();
        loadCmbTamanho();
        loadCmbBorda();
        ingredienteFactory = new IngredienteMGFactory();
        updateVisibleButtons();
    }

    private void loadTablePizza(List<Pizza> pizzas) {
        modelTablePizza = new JModelTablePizza(pizzas);
        tblPizza.setModel(modelTablePizza);
        
        tblPizza.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                updateVisibleButtons();
            }
        });
    }

    private void loadCmbRegiao() {
        RegiaoEnum.valuesList().forEach(regiao -> {
            cmbRegiao.addItem(regiao.getLabel());
        });
        
        cmbRegiao.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                ingredienteFactory = RegiaoEnum.getEnum(cmbRegiao.getSelectedItem().toString()).getinstance();
            }
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
        btnProximo.setEnabled(tblPizza.getRowCount() > 0);
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
        btnProximo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

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

        btnProximo.setText("Próximo");
        btnProximo.setEnabled(false);
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Pedido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(qtdPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbRegiao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(41, 41, 41)
                                                .addComponent(cmbBorda, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(308, 308, 308)
                                .addComponent(btnIngredientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cmbBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(btnIngredientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProximo)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
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
        new JSelecionaIngredientes(modelTablePizza.getPizza(rows[0])).setVisible(true);
    }//GEN-LAST:event_btnIngredientesActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        new SClient(this.pizzas).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProximoActionPerformed

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
        updateVisibleButtons();
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
                new JMontadoraPizza(new ArrayList<>())
                .setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnIngredientes;
    private javax.swing.JButton btnProximo;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner qtdPizza;
    private javax.swing.JTable tblPizza;
    // End of variables declaration//GEN-END:variables
}
