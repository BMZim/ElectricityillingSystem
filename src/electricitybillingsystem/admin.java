/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electricitybillingsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Zim
 */
 
public class admin extends javax.swing.JFrame {

    
int positionX = 0, positionY=0;


  
    String admin = "221000000";
        String pass = "admin";
       
        public admin(){
    
        initComponents();
        
         
    
        }
    public admin(String sjobid, String spassword ) {

        
        initComponents();

        if(admin.equals(sjobid) && pass.equals(spassword)){
            newjobid.setVisible(true);
            
        }else{
          newjobid.setVisible(false);
        }
        
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
        jPanel2 = new javax.swing.JPanel();
        depositdetails = new javax.swing.JButton();
        newcustomer = new javax.swing.JButton();
        customer_details = new javax.swing.JButton();
        updatecinfo = new javax.swing.JButton();
        bill_details = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        calculatebill = new javax.swing.JButton();
        viewinfo = new javax.swing.JButton();
        meterreq = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        reportcheck = new javax.swing.JButton();
        tax = new javax.swing.JButton();
        newjobid = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        depositdetails.setBackground(new java.awt.Color(204, 255, 204));
        depositdetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        depositdetails.setForeground(new java.awt.Color(255, 0, 0));
        depositdetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Hopstarter-Soft-Scraps-Text-Edit.24.png"))); // NOI18N
        depositdetails.setText("Deposit Details");
        depositdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositdetailsActionPerformed(evt);
            }
        });
        jPanel2.add(depositdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 208, 190, 35));

        newcustomer.setBackground(new java.awt.Color(204, 255, 204));
        newcustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newcustomer.setForeground(new java.awt.Color(255, 0, 0));
        newcustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Everaldo-Crystal-Clear-App-login-manager.32.png"))); // NOI18N
        newcustomer.setText("Delete Customer");
        newcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newcustomerActionPerformed(evt);
            }
        });
        jPanel2.add(newcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 208, 200, 35));

        customer_details.setBackground(new java.awt.Color(204, 255, 204));
        customer_details.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customer_details.setForeground(new java.awt.Color(255, 0, 0));
        customer_details.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Oxygen-Icons.org-Oxygen-Actions-view-list-details.24.png"))); // NOI18N
        customer_details.setText("Customer Details");
        customer_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_detailsActionPerformed(evt);
            }
        });
        jPanel2.add(customer_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 200, 40));

        updatecinfo.setBackground(new java.awt.Color(204, 255, 204));
        updatecinfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatecinfo.setForeground(new java.awt.Color(255, 0, 0));
        updatecinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Hopstarter-Soft-Scraps-Text-Edit.24.png"))); // NOI18N
        updatecinfo.setText("Update  Customer Information");
        updatecinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatecinfoActionPerformed(evt);
            }
        });
        jPanel2.add(updatecinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 400, 40));

        bill_details.setBackground(new java.awt.Color(204, 255, 204));
        bill_details.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bill_details.setForeground(new java.awt.Color(255, 0, 0));
        bill_details.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Oxygen-Icons.org-Oxygen-Actions-view-calendar-month.24.png"))); // NOI18N
        bill_details.setText("Bill Details");
        bill_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_detailsActionPerformed(evt);
            }
        });
        jPanel2.add(bill_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 190, 40));

        exit.setBackground(new java.awt.Color(204, 255, 204));
        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(204, 0, 0));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Oxygen-Icons.org-Oxygen-Actions-edit-delete.24.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 484, 129, 38));

        jLabel1.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Hopstarter-Soft-Scraps-User-Executive-Green.64.png"))); // NOI18N
        jLabel1.setText("Admin Panel");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 240, -1));

        calculatebill.setBackground(new java.awt.Color(204, 255, 204));
        calculatebill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calculatebill.setForeground(new java.awt.Color(255, 0, 0));
        calculatebill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Guillendesign-Variations-1-Calculator.24.png"))); // NOI18N
        calculatebill.setText("Calculate Bill");
        calculatebill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatebillActionPerformed(evt);
            }
        });
        jPanel2.add(calculatebill, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 190, 40));

        viewinfo.setBackground(new java.awt.Color(204, 255, 204));
        viewinfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewinfo.setForeground(new java.awt.Color(255, 0, 0));
        viewinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Antialiasfactory-Enterprise-Resource-Planning-Balance.24.png"))); // NOI18N
        viewinfo.setText("View Information");
        viewinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewinfoActionPerformed(evt);
            }
        });
        jPanel2.add(viewinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 200, 40));

        meterreq.setBackground(new java.awt.Color(255, 204, 204));
        meterreq.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        meterreq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Elegantthemes-Softies-Meter.24.png"))); // NOI18N
        meterreq.setText("Meter Request");
        meterreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meterreqActionPerformed(evt);
            }
        });
        jPanel2.add(meterreq, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("-");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, 30));

        reportcheck.setBackground(new java.awt.Color(255, 255, 204));
        reportcheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Mkho-Christmas-Bell.48.png"))); // NOI18N
        reportcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportcheckActionPerformed(evt);
            }
        });
        jPanel2.add(reportcheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, -1, -1));

        tax.setBackground(new java.awt.Color(204, 255, 204));
        tax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tax.setForeground(new java.awt.Color(255, 0, 0));
        tax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Hopstarter-Soft-Scraps-Text-Edit.24.png"))); // NOI18N
        tax.setText("Update Tax");
        tax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxActionPerformed(evt);
            }
        });
        jPanel2.add(tax, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 428, 269, 38));

        newjobid.setBackground(new java.awt.Color(204, 255, 204));
        newjobid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newjobid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icons-Land-Vista-People-Office-Customer-Male-Light.32.png"))); // NOI18N
        newjobid.setText("Add Job ID");
        newjobid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newjobidActionPerformed(evt);
            }
        });
        jPanel2.add(newjobid, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 150, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Matarbari-Power-Plant-Set-to-Begin-Operations-in-January-2024.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 830, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calculatebillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatebillActionPerformed
        
        new calculate().setVisible(true);
    }//GEN-LAST:event_calculatebillActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do You want to Exit the Application?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION){
          System.exit(0);  
        }else{
            
        }
    }//GEN-LAST:event_exitActionPerformed

    private void customer_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_detailsActionPerformed
        
        new CustomerDetails().setVisible(true);
    }//GEN-LAST:event_customer_detailsActionPerformed

    private void newcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newcustomerActionPerformed
        
        new DeleteCustomer().setVisible(true);
    }//GEN-LAST:event_newcustomerActionPerformed

    private void depositdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositdetailsActionPerformed
        
        new deposit_details().setVisible(true);
    }//GEN-LAST:event_depositdetailsActionPerformed

    private void updatecinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatecinfoActionPerformed
        
        new UpdatecustomerInfo().setVisible(true);
    }//GEN-LAST:event_updatecinfoActionPerformed

    private void bill_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_detailsActionPerformed
        
        new BillDetailsAdmin().setVisible(true);
    }//GEN-LAST:event_bill_detailsActionPerformed

    private void viewinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewinfoActionPerformed
        
        new ViewCustomerInfo().setVisible(true);
    }//GEN-LAST:event_viewinfoActionPerformed

    private void meterreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meterreqActionPerformed
       
        new MeterReqCheck().setVisible(true);
    }//GEN-LAST:event_meterreqActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void reportcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportcheckActionPerformed
        new ReportCheck().setVisible(true);
    }//GEN-LAST:event_reportcheckActionPerformed

    private void taxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxActionPerformed
        
        new UpdateTax().setVisible(true);
    }//GEN-LAST:event_taxActionPerformed

    private void newjobidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newjobidActionPerformed
        new NewJobID().setVisible(true);
    }//GEN-LAST:event_newjobidActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        positionX = evt.getX();
        positionY = evt.getY();


    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_formMouseDragged

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bill_details;
    private javax.swing.JButton calculatebill;
    private javax.swing.JButton customer_details;
    private javax.swing.JButton depositdetails;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton meterreq;
    private javax.swing.JButton newcustomer;
    private javax.swing.JButton newjobid;
    private javax.swing.JButton reportcheck;
    private javax.swing.JButton tax;
    private javax.swing.JButton updatecinfo;
    private javax.swing.JButton viewinfo;
    // End of variables declaration//GEN-END:variables
}