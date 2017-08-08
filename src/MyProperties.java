
import Classes.PropertiesArray;
import Classes.SellersArray;

public class MyProperties extends javax.swing.JFrame {
    SellersArray sellersArray = new SellersArray();
    PropertiesArray propArray = new PropertiesArray();

    public MyProperties() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMyProperties = new javax.swing.JLabel();
        lblChooseProperty = new javax.swing.JLabel();
        cmbChooseProperty = new javax.swing.JComboBox<>();
        lblChooseAnAction = new javax.swing.JLabel();
        cmbChooseAnAction = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnCompleteAction = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMyProperties.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblMyProperties.setText("My Properties");

        lblChooseProperty.setText("Choose Property");

        cmbChooseProperty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbChooseProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChoosePropertyActionPerformed(evt);
            }
        });

        lblChooseAnAction.setText("Choose an Action");

        cmbChooseAnAction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbChooseAnAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChooseAnActionActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnHelp.setText("?");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        btnCompleteAction.setText("Complete Actions");
        btnCompleteAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionActionPerformed(evt);
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
                        .addComponent(lblMyProperties)
                        .addGap(18, 18, 18)
                        .addComponent(btnHelp))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblChooseProperty)
                        .addGap(18, 18, 18)
                        .addComponent(cmbChooseProperty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCompleteAction))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblChooseAnAction)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbChooseAnAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMyProperties)
                    .addComponent(btnHelp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChooseProperty)
                    .addComponent(cmbChooseProperty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChooseAnAction)
                    .addComponent(cmbChooseAnAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnCompleteAction))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        
    }//GEN-LAST:event_btnHelpActionPerformed

    private void cmbChoosePropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChoosePropertyActionPerformed
        
    }//GEN-LAST:event_cmbChoosePropertyActionPerformed

    private void btnCompleteActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionActionPerformed
        
        
        if (cmbChooseAnAction.getSelectedItem().equals("Delete property")) {

        }
        else if (cmb)
    }//GEN-LAST:event_btnCompleteActionActionPerformed

    private void cmbChooseAnActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChooseAnActionActionPerformed
        
    }//GEN-LAST:event_cmbChooseAnActionActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyProperties().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompleteAction;
    private javax.swing.JButton btnHelp;
    private javax.swing.JComboBox<String> cmbChooseAnAction;
    private javax.swing.JComboBox<String> cmbChooseProperty;
    private javax.swing.JLabel lblChooseAnAction;
    private javax.swing.JLabel lblChooseProperty;
    private javax.swing.JLabel lblMyProperties;
    // End of variables declaration//GEN-END:variables
}
