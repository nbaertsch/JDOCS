/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDOCS;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author noah
 */
public class ComplexUI extends javax.swing.JFrame {

    //Custom variable declerations
    private ComplexController ctrl;
    
    /**
     * Creates new form MainFrame
     * @param controller
     */
    public ComplexUI(ComplexController controller) {
        this.ctrl = controller;
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

        jLabel1 = new javax.swing.JLabel();
        urlField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        maxNodeDepthField = new javax.swing.JTextField();
        totalLinksField = new javax.swing.JTextField();
        totalNodesField = new javax.swing.JTextField();
        scanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("URL:");

        urlField.setText("Enter Target URL Here");
        urlField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Total Nodes: ");

        jLabel3.setText("Max Node Depth: ");

        jLabel4.setText("Links: ");

        maxNodeDepthField.setEditable(false);

        totalLinksField.setEditable(false);
        totalLinksField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalLinksFieldActionPerformed(evt);
            }
        });

        totalNodesField.setEditable(false);
        totalNodesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalNodesFieldActionPerformed(evt);
            }
        });

        scanButton.setText("Scan DOM");
        scanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanButtonActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(urlField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalNodesField, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(totalLinksField)
                            .addComponent(maxNodeDepthField))
                        .addGap(18, 18, 18)
                        .addComponent(scanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(urlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(totalNodesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(maxNodeDepthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scanButton))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalLinksField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void urlFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlFieldActionPerformed

    private void totalNodesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalNodesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalNodesFieldActionPerformed

    private void totalLinksFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalLinksFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalLinksFieldActionPerformed

    private void scanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanButtonActionPerformed
        // if the url field is not null, tell the controller to build a new scanner
        // object from the text in the url field.  this field can be null, as well
        // as a malformed url.
        if(!(this.urlField.getText()==null)){
            try {
                this.ctrl.createScanner(this.urlField.getText());
            } catch (Exception ex) {
                System.out.println(ex.getLocalizedMessage());
                this.urlField.setText("Bad URL, try again");
                return;
            }
        }else{
            this.urlField.setText("Bad URL, try again");
            return;
        }
        
        // TESTING
        this.ctrl.loquaciousTraversal();
        
        // get total node count
        this.totalNodesField.setText("" + ctrl.getTotalNodes());
        
        // get the max node depth
        this.maxNodeDepthField.setText("" + ctrl.getMaxNodeDepth());
        
        
        // get total link nodes
        this.totalLinksField.setText("" + ctrl.getTotalLinkNodes());
        
    }//GEN-LAST:event_scanButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField maxNodeDepthField;
    private javax.swing.JButton scanButton;
    private javax.swing.JTextField totalLinksField;
    private javax.swing.JTextField totalNodesField;
    private javax.swing.JTextField urlField;
    // End of variables declaration//GEN-END:variables
}
