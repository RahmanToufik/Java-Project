
import java.io.FileWriter;
import javax.swing.JOptionPane;
public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        regiName = new javax.swing.JTextField();
        regiNum = new javax.swing.JTextField();
        regiPass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        regiSub = new javax.swing.JButton();
        regiLogin = new javax.swing.JButton();
        backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 500));

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Register To Air Reservation BD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Userame:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Mobile Number:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Password:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, -1, -1));
        jPanel1.add(regiName, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 220, -1));
        jPanel1.add(regiNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 220, -1));
        jPanel1.add(regiPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 200, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Registration Here");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 210, 40));

        regiSub.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        regiSub.setForeground(new java.awt.Color(0, 204, 204));
        regiSub.setText("Submit");
        regiSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regiSubActionPerformed(evt);
            }
        });
        jPanel1.add(regiSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 110, 40));

        regiLogin.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        regiLogin.setForeground(new java.awt.Color(0, 204, 204));
        regiLogin.setText("Login Now");
        regiLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regiLoginActionPerformed(evt);
            }
        });
        jPanel1.add(regiLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 150, 40));

        backgroud.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\imgonline-com-ua-resize-41GV82V4zVtqzo.png")); // NOI18N
        jPanel1.add(backgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regiLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regiLoginActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_regiLoginActionPerformed

    private void regiSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regiSubActionPerformed

        String name = regiName.getText();
        String mobile = regiNum.getText();
        String password = regiPass.getText();
        try {
            FileWriter Writer = new FileWriter("fardin.txt",true);
            Writer.write(""+name+" "+mobile+" "+password);
            Writer.write(System.getProperty("line.separator"));
            Writer.close();
            JOptionPane.showMessageDialog(null, "Registation Successful");
            setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_regiSubActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton regiLogin;
    private javax.swing.JTextField regiName;
    private javax.swing.JTextField regiNum;
    private javax.swing.JPasswordField regiPass;
    private javax.swing.JButton regiSub;
    // End of variables declaration//GEN-END:variables
