/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electricitybillingsystem;


import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Zim
 */
public class viewinfo extends javax.swing.JFrame {

    
int positionX = 0, positionY=0;


    public viewinfo() {
        initComponents();
    }
    public viewinfo(String smeter) {
        initComponents();
        
        meterno.setText(smeter);
        String ameter = meterno.getText();
        
        try{
            Conn c = new Conn();
            
            
            String query = "select customer.name, customer.phone, customer.email, customer.nid, customer.date_of_birth, customer.address, customer.city, meter_info.meter_location, meter_info.meter_type, meter_info.phase_code, meter_info.bill_type FROM customer JOIN meter_info  ON customer.meter_no = meter_info.meter_no WHERE customer.meter_no = '"+ameter+"'";
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next()){
                name.setText(rs.getString("name"));
                ml.setText(rs.getString("meter_location"));
                address.setText(rs.getString("address"));
                phone.setText(rs.getString("phone"));
                email.setText(rs.getString("email"));
                nid.setText(rs.getString("nid"));
                city.setText(rs.getString("city"));
                pc.setText(rs.getString("phase_code"));
                mt.setText(rs.getString("meter_type"));
                bt.setText(rs.getString("bill_type"));
                dob.setText(rs.getString("date_of_birth"));
            }
                 
            
            
            
        }catch(Exception e){
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        meterno = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        mt = new javax.swing.JLabel();
        ml = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        bt = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nid = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Everaldo-Crystal-Clear-App-login-manager.32.png"))); // NOI18N
        jLabel1.setText(" See Your Information ");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Meter No : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 116, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 204, 70, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("City :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 40, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Phone :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Email :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 50, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Date Of Birth:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 116, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Meter Type :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Meter Location :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 204, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Phase Code :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Bill Type :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 70, 30));

        meterno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        meterno.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(meterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 227, 27));

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 200, 25));

        address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 227, 27));

        city.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 227, 26));

        phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 227, 26));

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 260, 27));

        dob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 116, 214, 27));

        mt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(mt, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 161, 214, 25));

        ml.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ml, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 204, 212, 27));

        pc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 249, 212, 26));

        bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 293, 212, 26));

        back.setBackground(new java.awt.Color(204, 255, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Graphicloads-100-Flat-2-Arrow-back.24.png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 100, 40));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText(" X");
        jLabel24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 30, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("NID:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 40, 30));

        nid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 337, 218, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        
    }//GEN-LAST:event_backActionPerformed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
       int response = JOptionPane.showConfirmDialog(this, "Do You want to Exit the Application?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION){
          System.exit(0);  
        }else{
            
        }
    }//GEN-LAST:event_jLabel24MouseClicked

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
            java.util.logging.Logger.getLogger(viewinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton back;
    private javax.swing.JLabel bt;
    private javax.swing.JLabel city;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel meterno;
    private javax.swing.JLabel ml;
    private javax.swing.JLabel mt;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nid;
    private javax.swing.JLabel pc;
    private javax.swing.JLabel phone;
    // End of variables declaration//GEN-END:variables
}