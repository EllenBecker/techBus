/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.daoDestino;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Destino;
import static model.Itinerarios_.destino;
import model.Locais;



/**
 *
 * @author Jadso
 */
public class dialogDestino extends javax.swing.JDialog {
      
 //1-criar o dao
    private daoDestino dao = new daoDestino();
    
    //2-inicializa componentes
    private void clearComponents(){
        textCodigo.setText("");        
        comboLocalSaida.setSelectedIndex(0);
        comboLocalChegada.setSelectedIndex(0);        
        comboLocalSaida.requestFocus();
    }
    //3-monta um objeto com valores da tela
    private Destino createDestino(){
        return new Destino(
                textCodigo.getText().isEmpty()? 0 : Integer.parseInt(textCodigo.getText()),                 
                (Locais)comboLocalSaida.getSelectedItem(),
                (Locais)comboLocalChegada.getSelectedItem()
        );
    }
    //4-atualiza componentes de tela
    private void fillComponents(Destino destino){
        textCodigo.setText(destino.getId()+"");        
        comboLocalSaida.setSelectedItem(destino.getLocal_saida());
        comboLocalChegada.setSelectedItem(destino.getLocal_chegada());
    }
    //5-carregar combo marca
    private void loadcomboLocalSaida(){
        DefaultComboBoxModel cbm = 
        new DefaultComboBoxModel(new daoDestino().readDestinoSaida().toArray());
        comboLocalSaida.setModel(cbm);
    }
    private void comboLocalChegada(){
        DefaultComboBoxModel cbm = 
        new DefaultComboBoxModel(new daoDestino().readDestinoChegada().toArray());
        comboLocalChegada.setModel(cbm);
    }
    //6-atualizar List
    private void loadListChegada(Destino destino){
        DefaultListModel lm = new DefaultListModel();
        lm.addAll(dao.readDestinoChegada(destino));
        listDestino.setModel(lm);        
    }
    private void loadListSaida(Destino destino){
        DefaultListModel lm = new DefaultListModel();
        lm.addAll(dao.readDestinoSaida(destino));
        listDestino.setModel(lm);        
    }
    /**
     * Creates new form dialogOnibus
     */
    public dialogDestino(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonNovo = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        textCodigo = new javax.swing.JTextField();
        comboLocalSaida = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        buttonFiltrarSaida = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboLocalChegada = new javax.swing.JComboBox<>();
        buttonFiltrarChegada = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        listDestino = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Código");

        buttonNovo.setText("Novo");
        buttonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonRemover.setText("Remover");
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });

        comboLocalSaida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboLocalSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLocalSaidaActionPerformed(evt);
            }
        });

        jLabel4.setText("Local Saida");

        buttonFiltrarSaida.setText("Filtrar");
        buttonFiltrarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiltrarSaidaActionPerformed(evt);
            }
        });

        jLabel6.setText("Local Chegada");

        comboLocalChegada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboLocalChegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLocalChegadaActionPerformed(evt);
            }
        });

        buttonFiltrarChegada.setText("Filtrar");
        buttonFiltrarChegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiltrarChegadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboLocalSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonFiltrarSaida))
                            .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboLocalChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonFiltrarChegada)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(buttonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buttonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboLocalSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFiltrarSaida))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboLocalChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFiltrarChegada))
                .addContainerGap(259, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(187, 187, 187)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonNovo)
                        .addComponent(buttonSalvar)
                        .addComponent(buttonRemover))
                    .addContainerGap(188, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        listDestino.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listDestino.setToolTipText("Selecione o Registro para Editar ou Remover");
        listDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listDestinoMouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Filtro");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(listDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(listDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
        // TODO add your handling code here:
        this.clearComponents();
    }//GEN-LAST:event_buttonNovoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // TODO add your handling code here:
        //validação
                //comboLocalSaida.setSelectedItem(destino.getLocal_saida());

        if  (comboLocalSaida.setSelectedItem(destino.getLocal_saida())){
            JOptionPane.showMessageDialog(null, "Nome do local Obrigatório");
            comboLocalSaida.requestFocus();
            return;
        }
        try{
            Locais locais = this.createLocais();
            if (textCodigo.getText().isEmpty()){ //novo
                dao.create(locais);
                JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
            }else{ //update
                dao.update(locais);
                JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
            }
            //refresh
            this.clearComponents();
            this.loadList();
        }catch(Exception ex){

        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
        // TODO add your handling code here:
        if (listDestino.getSelectedIndex()== -1){
            JOptionPane.showMessageDialog(null, "Selecione Algo");
            return;
        }
        //
        if (JOptionPane.showConfirmDialog(null, "Confirma?")!=0){
            return;
        }
        try{
            Locais locais = (Locais)listDestino.getSelectedValue();
            dao.delete(locais);
            //refresh
            this.clearComponents();
            this.loadList();
        }catch(Exception ex){
            System.out.println("ERRO:"+ex.getMessage());
        }
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void listDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listDestinoMouseClicked
        // TODO add your handling code here:
        Locais locais = (Locais)listDestino.getSelectedValue();
        this.fillComponents(locais);
    }//GEN-LAST:event_listDestinoMouseClicked

    private void comboLocalSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLocalSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLocalSaidaActionPerformed

    private void buttonFiltrarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltrarSaidaActionPerformed
        // TODO add your handling code here:
        Locais locais = (Locais)comboLocalSaida.getSelectedItem();
        this.loadList(locais);
    }//GEN-LAST:event_buttonFiltrarSaidaActionPerformed

    private void comboLocalChegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLocalChegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLocalChegadaActionPerformed

    private void buttonFiltrarChegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltrarChegadaActionPerformed
        // TODO add your handling code here:
        Locais locais = (Locais)comboLocalChegada.getSelectedItem();
        this.loadList(locais);
    }//GEN-LAST:event_buttonFiltrarChegadaActionPerformed

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
            java.util.logging.Logger.getLogger(dialogDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogDestino dialog = new dialogDestino(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFiltrarChegada;
    private javax.swing.JButton buttonFiltrarSaida;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboLocalChegada;
    private javax.swing.JComboBox<String> comboLocalSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JList listDestino;
    private javax.swing.JTextField textCodigo;
    // End of variables declaration//GEN-END:variables
}
