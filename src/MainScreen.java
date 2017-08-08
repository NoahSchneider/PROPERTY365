
public class MainScreen extends javax.swing.JFrame {

    public MainScreen() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearchForProperties = new javax.swing.JToggleButton();
        btnPostAProperty = new javax.swing.JToggleButton();
        btnMyProperties = new javax.swing.JToggleButton();
        lblProperty365 = new javax.swing.JLabel();
        lblChooseAnOption = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSearchForProperties.setText("Search For Properties");
        btnSearchForProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchForPropertiesActionPerformed(evt);
            }
        });

        btnPostAProperty.setText("Post A Property");
        btnPostAProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostAPropertyActionPerformed(evt);
            }
        });

        btnMyProperties.setText("My Properties");
        btnMyProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyPropertiesActionPerformed(evt);
            }
        });

        lblProperty365.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lblProperty365.setText("Property365");

        lblChooseAnOption.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblChooseAnOption.setText("Choose An Option");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jToggleButton1.setText("?");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProperty365)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblChooseAnOption)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBack)
                                    .addComponent(btnPostAProperty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMyProperties, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSearchForProperties, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProperty365)
                    .addComponent(jToggleButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblChooseAnOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchForProperties)
                .addGap(18, 18, 18)
                .addComponent(btnPostAProperty)
                .addGap(18, 18, 18)
                .addComponent(btnMyProperties)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchForPropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchForPropertiesActionPerformed
        
        Search menu = new Search();
        menu.setVisible(true);
        
    }//GEN-LAST:event_btnSearchForPropertiesActionPerformed

    private void btnPostAPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostAPropertyActionPerformed
        Post post = new Post();
        post.setVisible(true);
    }//GEN-LAST:event_btnPostAPropertyActionPerformed

    private void btnMyPropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyPropertiesActionPerformed
        MyProperties myProperties = new MyProperties();
        myProperties.setVisible(true);
    }//GEN-LAST:event_btnMyPropertiesActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       this.dispose();
       StartScreen.setV
    }//GEN-LAST:event_btnBackActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JToggleButton btnMyProperties;
    private javax.swing.JToggleButton btnPostAProperty;
    private javax.swing.JToggleButton btnSearchForProperties;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblChooseAnOption;
    private javax.swing.JLabel lblProperty365;
    // End of variables declaration//GEN-END:variables
}
