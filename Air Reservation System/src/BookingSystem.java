
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class BookingSystem extends javax.swing.JFrame {
    
    String name,number,gender,passenger_number,agency,from,to,seat,payment;
    DefaultTableModel model;
          JFileChooser fch;
          File fle;
          File file = null;

    public BookingSystem() {
        initComponents();
        
        model = new DefaultTableModel();
        infoTable.setModel(model);
        model.addColumn("Name");
        model.addColumn("Phone Number");
        model.addColumn("Gender");
        model.addColumn("Passenger Number");
        model.addColumn("Seat");
        model.addColumn("Agency");
        model.addColumn("From");
        model.addColumn("To");
        model.addColumn("Payment");
    }
    
   
     class writeInto{  
    void writeAll() throws IOException {
        try ( BufferedWriter buf = new BufferedWriter(new FileWriter(file + getExtention(), true))) {
            buf.write(name + "," + number + "," + gender + "," + passenger_number + "," + seat + "," + agency + "," + from + "," + to + "," + payment);
            buf.newLine();
            JOptionPane.showMessageDialog(null, "Ticket Booked Successfully");
        } catch (Exception e) {
       }
    }
    }
        
        private String getExtention() {
        String ext = "";
        String extension = fch.getFileFilter().getDescription();
        if (extension.equals("*.txt")) {
            ext = ".txt";
            
        }
        return ext;
    }
        
     class userInfoInput{    
       
    public void userInput (){
       name = txtName.getText();
       number = txtNumber.getText();
       gender = cmbGender.getSelectedItem().toString();
       passenger_number = cmbPassengerNumber.getSelectedItem().toString();
       agency = cmbAgency.getSelectedItem().toString();
       from = cmbFrom.getSelectedItem().toString();
       to = cmbTo.getSelectedItem().toString();
       seat = cmbSeat.getSelectedItem().toString();
       payment = cmbPayment.getSelectedItem().toString();
    }
    }
     class dataClear{
    public void cleardata (){
        txtName.setText("");
        txtNumber.setText("");
        cmbGender.setSelectedIndex(0);
        cmbPassengerNumber.setSelectedIndex(0);
        cmbAgency.setSelectedIndex(0);
        cmbFrom.setSelectedIndex(0);
        cmbTo.setSelectedIndex(0);
        cmbSeat.setSelectedIndex(0);
        cmbPayment.setSelectedIndex(0);
        
        if (infoTable.getRowCount() > 0) {
            for (int i = infoTable.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
        txtName.requestFocus();
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        btdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbFrom = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbTo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cmbAgency = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cmbSeat = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cmbPayment = new javax.swing.JComboBox<>();
        btnBook = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        cmbPassengerNumber = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTable = new javax.swing.JTable();
        btnShow = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        btnConfirmTicket = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel16.setText("Enter Your Account Number:");

        jLabel17.setText("Password:");

        btdate.setText("Choose Date");
        btdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdateActionPerformed(evt);
            }
        });

        jLabel8.setText("DEPARTURE:");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Airline Reservation system");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1150, 790));
        setMinimumSize(new java.awt.Dimension(1150, 790));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(1450, 790));
        jPanel1.setMinimumSize(new java.awt.Dimension(1400, 790));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 793));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setText("Air-Ticket Reservation System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 610, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel3.setText("Enter Your Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txtName.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 261, 34));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setText("Enter Your Phone Number:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 261, 34));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel4.setText("Gender:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, 30));

        cmbGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbGender.setForeground(new java.awt.Color(0, 153, 51));
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   --Select One--", "Male ", "Female" }));
        jPanel1.add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 260, 38));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(879, 192, -1, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 476, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel9.setText("Enter Passenger Number:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, -1, 34));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 623, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel10.setText("Enter Destination:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, 34));

        cmbFrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbFrom.setForeground(new java.awt.Color(0, 153, 51));
        cmbFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "     --Select One--", "Dhaka", "sylhet", "Rajshahi", "Barisal", "Khulna", "Cox`s Bazar", "Saidpur", "Chittagong" }));
        jPanel1.add(cmbFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 180, 38));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Flying From:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Flying To:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        cmbTo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbTo.setForeground(new java.awt.Color(0, 153, 0));
        cmbTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "        --Select One--", "Dhaka", "sylhet", "Rajshahi", "Barisal", "Khulna", "Cox`s Bazar", "Saidpur", "Chittagong" }));
        jPanel1.add(cmbTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 200, 38));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel13.setText("Choose Agency:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 120, -1, 35));

        cmbAgency.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbAgency.setForeground(new java.awt.Color(0, 153, 51));
        cmbAgency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "       --Select One--", "Us Bangla", "Biman Bangladesh", "Novo Air" }));
        cmbAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAgencyActionPerformed(evt);
            }
        });
        jPanel1.add(cmbAgency, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 150, 200, 38));

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel14.setText("Choose seat:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 120, -1, 28));

        cmbSeat.setBackground(new java.awt.Color(204, 204, 255));
        cmbSeat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbSeat.setForeground(new java.awt.Color(0, 153, 51));
        cmbSeat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "      --Select One--", "Business Class - 4000/-", "Economic Class - 2800/-" }));
        jPanel1.add(cmbSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 150, 160, 38));

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel15.setText("Payment:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        cmbPayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbPayment.setForeground(new java.awt.Color(0, 153, 51));
        cmbPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                   --Select One--", "Bikas", "Nagad", "Rocket", "DBBL", "NCB", "Islami Bank" }));
        cmbPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaymentActionPerformed(evt);
            }
        });
        jPanel1.add(cmbPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 261, 34));

        btnBook.setBackground(new java.awt.Color(204, 204, 204));
        btnBook.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        btnBook.setForeground(new java.awt.Color(255, 153, 0));
        btnBook.setText("Book Ticket");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 680, 270, 39));

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 51));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 770, 147, 41));

        cmbPassengerNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbPassengerNumber.setForeground(new java.awt.Color(0, 153, 51));
        cmbPassengerNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "           --Select One--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        jPanel1.add(cmbPassengerNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 240, 38));

        infoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(infoTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 1020, 370));

        btnShow.setBackground(new java.awt.Color(255, 255, 255));
        btnShow.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        btnShow.setForeground(new java.awt.Color(0, 204, 102));
        btnShow.setText("Show Ticket List");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        jPanel1.add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 670, -1, 47));

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 204, 204));
        btnClear.setText("Clear Field");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 670, 170, 47));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel18.setText("Reserved Ticket List");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 330, 46));

        btnConfirmTicket.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirmTicket.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        btnConfirmTicket.setForeground(new java.awt.Color(0, 102, 255));
        btnConfirmTicket.setText("Confirm Ticket");
        btnConfirmTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmTicketActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 670, 200, 47));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel19.setText("Account Number:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, 26));

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 261, 35));

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel20.setText("OTP Here:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 88, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 261, 34));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 1040, 20));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 20, 509));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 820));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void btdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdateActionPerformed
        
    }//GEN-LAST:event_btdateActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        
        userInfoInput uii = new userInfoInput(); 
        uii.userInput();
        if(name.isEmpty() || number.isEmpty() || cmbGender.getSelectedIndex() == 0 || cmbPassengerNumber.getSelectedIndex() == 0 || cmbSeat.getSelectedIndex() == 0 || cmbAgency.getSelectedIndex() == 0 || cmbFrom.getSelectedIndex() == 0 || cmbTo.getSelectedIndex() == 0 || cmbPayment.getSelectedIndex() == 0){
           
           JOptionPane.showMessageDialog(null, "Incomplete Field \n Please Fillup all the Field","caution",JOptionPane.ERROR_MESSAGE);
       } else{
       
           fch = new JFileChooser(fle);
                FileNameExtensionFilter filter;
                filter = new FileNameExtensionFilter("*.txt", new String[]{"txt"});
                fch.addChoosableFileFilter(filter);
                int option = fch.showSaveDialog(this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    fle = fch.getCurrentDirectory();
                    model.addRow(new Object[]{name, number, gender, passenger_number, seat, agency, from, to, payment});
                    file = fch.getSelectedFile();
                    try {
                        writeInto wi = new writeInto();
                        wi.writeAll();
                    } catch (IOException ex) {
                    }
                    
                }
           
           
             }
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Login l = new Login ();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        InputStream is = null;
        fch = new JFileChooser(fle);
        int option = fch.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            file = fch.getSelectedFile();
            fle = fch.getCurrentDirectory();
            try {
                File f = file;
                is = new FileInputStream(f);
                Scanner scan = new Scanner(is);
                String[] arr;
                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    if (line.indexOf(",") > 1) {
                        arr = line.split(",");
                    } else {
                        arr = line.split("\n");
                    }
                    Object[] data = new Object[arr.length];
                    for (int i = 0; i < data.length; i++) {
                        data[i] = arr[i];
                        
                    }
                    model.addRow(data);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (is != null) {
                        is.close();
                    }
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        dataClear dc = new dataClear();
        dc.cleardata();
    }//GEN-LAST:event_btnClearActionPerformed

    private void cmbPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPaymentActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void btnConfirmTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmTicketActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(null, "Ticket Confirmation Successful");
    }//GEN-LAST:event_btnConfirmTicketActionPerformed

    private void cmbAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAgencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAgencyActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdate;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConfirmTicket;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox<String> cmbAgency;
    private javax.swing.JComboBox<String> cmbFrom;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbPassengerNumber;
    private javax.swing.JComboBox<String> cmbPayment;
    private javax.swing.JComboBox<String> cmbSeat;
    private javax.swing.JComboBox<String> cmbTo;
    private javax.swing.JTable infoTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables

    private int getSelectedIndex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
