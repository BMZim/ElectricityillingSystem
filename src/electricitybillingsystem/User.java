/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electricitybillingsystem;

import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author Zim
 */
public class User extends javax.swing.JFrame {

    
int positionX = 0, positionY=0;


    
    public User() {
        
        //this.cmeter = smeter;
        initComponents();
        
        
        
        
            
    }
    
    public User(String smeter) {
        
        initComponents();
        
        
       meter.setText(smeter);
       
       String ameter = meter.getText();
       
   

        try{

            Conn c = new Conn();
            String query = "select * from customer where meter_no = '"+ameter+"'";
            ResultSet rs = c.s.executeQuery(query);

            while (rs.next()){

                cname.setText(rs.getString("name"));
                

            }

        }catch (Exception e){
            e.printStackTrace();
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
        jLabel1 = new javax.swing.JLabel();
        viewinfo = new javax.swing.JButton();
        updateinfo = new javax.swing.JButton();
        paybill = new javax.swing.JButton();
        report = new javax.swing.JButton();
        billdetails = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        calculator = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        meter = new javax.swing.JLabel();
        req = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Hopstarter-Soft-Scraps-User-Executive-Green.64.png"))); // NOI18N
        jLabel1.setText("User Panel");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 250, 70));

        viewinfo.setBackground(new java.awt.Color(204, 255, 255));
        viewinfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Oxygen-Icons.org-Oxygen-Actions-view-list-details.24.png"))); // NOI18N
        viewinfo.setText("View Information");
        viewinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        viewinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewinfoActionPerformed(evt);
            }
        });
        jPanel1.add(viewinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 160, 30));

        updateinfo.setBackground(new java.awt.Color(204, 255, 255));
        updateinfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Hopstarter-Soft-Scraps-Text-Edit.24.png"))); // NOI18N
        updateinfo.setText("Update information");
        updateinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 2));
        updateinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateinfoActionPerformed(evt);
            }
        });
        jPanel1.add(updateinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 170, 30));

        paybill.setBackground(new java.awt.Color(204, 255, 255));
        paybill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paybill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Simpleicons-Team-Simple-Amazon-pay.24.png"))); // NOI18N
        paybill.setText("Pay Bill");
        paybill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        paybill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybillActionPerformed(evt);
            }
        });
        jPanel1.add(paybill, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 90, 30));

        report.setBackground(new java.awt.Color(204, 255, 255));
        report.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Antialiasfactory-Enterprise-Resource-Planning-Balance.24.png"))); // NOI18N
        report.setText("Report");
        report.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        jPanel1.add(report, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 110, 30));

        billdetails.setBackground(new java.awt.Color(204, 255, 255));
        billdetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        billdetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Oxygen-Icons.org-Oxygen-Actions-view-calendar-month.24.png"))); // NOI18N
        billdetails.setText("Bill Details");
        billdetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        billdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billdetailsActionPerformed(evt);
            }
        });
        jPanel1.add(billdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 130, 30));

        exit.setBackground(new java.awt.Color(255, 204, 204));
        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Oxygen-Icons.org-Oxygen-Actions-edit-delete.24.png"))); // NOI18N
        exit.setText("Exit");
        exit.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 255, 0)));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 80, 30));

        calculator.setBackground(new java.awt.Color(204, 255, 255));
        calculator.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Guillendesign-Variations-1-Calculator.24.png"))); // NOI18N
        calculator.setText("Calculator");
        calculator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        calculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorActionPerformed(evt);
            }
        });
        jPanel1.add(calculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 140, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Everaldo-Crystal-Clear-App-login-manager.32.png"))); // NOI18N
        jLabel8.setText("Customer Name:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 190, 30));

        cname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cname.setForeground(new java.awt.Color(255, 255, 51));
        jPanel1.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 170, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Elegantthemes-Softies-Meter.24.png"))); // NOI18N
        jLabel2.setText("Meter No: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 130, 40));

        meter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        meter.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(meter, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 170, 30));

        req.setBackground(new java.awt.Color(0, 255, 0));
        req.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        req.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Elegantthemes-Softies-Meter.24.png"))); // NOI18N
        req.setText("Request For Meter");
        req.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        req.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqActionPerformed(evt);
            }
        });
        jPanel1.add(req, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 220, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("-");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Alecive-Flatwoken-Apps-Notifications.32.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 40, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/info2.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateinfoActionPerformed
        
        String smeter = meter.getText();
        
        new updateinfo(smeter).setVisible(true);
    }//GEN-LAST:event_updateinfoActionPerformed

    private void viewinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewinfoActionPerformed
        String smeter = meter.getText();
        new viewinfo(smeter).setVisible(true);
    }//GEN-LAST:event_viewinfoActionPerformed

    private void billdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billdetailsActionPerformed
        String smeter = meter.getText();
        new BillDetailsUser(smeter).setVisible(true);
    }//GEN-LAST:event_billdetailsActionPerformed

    private void reqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqActionPerformed
        String smeter = meter.getText();
        
        try{
            Conn c = new Conn();
            
            String query = "select * from meter_request where meter_no = '"+smeter+"'";
            ResultSet rs = c.s.executeQuery(query);
            
            if(rs.next()){
               
                String query1 = "select status from meter_request where meter_no = '"+smeter+"' and status = 'Pending'";
                 ResultSet ra = c.s.executeQuery(query1);
                 
                 if(ra.next()){
                     JOptionPane.showMessageDialog(null, "You have already Request for a meter\nYour meter is now at pending State\nPlease Wait Your Meter will be sent as soon as possible!!!!");
                 }else{
                     JOptionPane.showMessageDialog(null, "We have already sent a Meter to You!!\nIf Your Meter is Disabled or Not Working then Please Report Us!!\nWe will try to fix it as soon as possible!!");
      
                 }
              }
            else{
            
                  new MeterRequest(smeter).setVisible(true);
                  
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_reqActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void calculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorActionPerformed
       try{
           Runtime.getRuntime().exec("calc.exe");
       }catch (Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_calculatorActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    int response = JOptionPane.showConfirmDialog(this, "Do You want to Exit the Application?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION){
          System.exit(0);  
        }else{
            
        }
    }//GEN-LAST:event_exitActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
       String smeter = meter.getText();
        new Report(smeter).setVisible(true);
    }//GEN-LAST:event_reportActionPerformed

    private void paybillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybillActionPerformed
        String smeter = meter.getText();
        String sname = cname.getText();
        new PayBill(smeter, sname).setVisible(true);
    }//GEN-LAST:event_paybillActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        String smeter = meter.getText();
        
        
                new MeterStatus(smeter).setVisible(true);
                
         
        
        
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User("").setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billdetails;
    private javax.swing.JButton calculator;
    private javax.swing.JLabel cname;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel meter;
    private javax.swing.JButton paybill;
    private javax.swing.JButton report;
    private javax.swing.JButton req;
    private javax.swing.JButton updateinfo;
    private javax.swing.JButton viewinfo;
    // End of variables declaration//GEN-END:variables
}
