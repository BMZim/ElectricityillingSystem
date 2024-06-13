/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electricitybillingsystem;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Zim
 */
public class UpdateTax extends javax.swing.JFrame {

    int positionX = 0, positionY=0;
    public UpdateTax() {
        initComponents();
        
        try{
            Conn c = new Conn();
            
            String query = "select * from tax";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                cpu.setText(rs.getString("cost_per_unit"));
                mr.setText(rs.getString("meter_rent"));
                sc.setText(rs.getString("service_charge"));
                st.setText(rs.getString("service_tax"));
                vt.setText(rs.getString("vat"));
                
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
        cpu = new javax.swing.JLabel();
        mr = new javax.swing.JLabel();
        sc = new javax.swing.JLabel();
        st = new javax.swing.JLabel();
        vt = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ccpu = new javax.swing.JTextField();
        cmr = new javax.swing.JTextField();
        csc = new javax.swing.JTextField();
        cst = new javax.swing.JTextField();
        cvt = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Update Tax");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cost Per Unit:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 114, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Service Charge:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 224, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Service Tax:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 277, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Meter Rent:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 168, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("VAT:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 342, -1, -1));

        cpu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(cpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 110, 111, 25));

        mr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(mr, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 163, 111, 27));

        sc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(sc, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 219, 111, 27));

        st.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(st, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 273, 111, 24));

        vt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(vt, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 336, 111, 29));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("To:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 110, -1, 25));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("To:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 164, -1, 25));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("To:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 220, -1, 25));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("To:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 273, -1, 25));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("To:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 338, -1, 25));

        ccpu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(ccpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 110, 141, 25));

        cmr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(cmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 163, 141, 27));

        csc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(csc, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 219, 141, 27));

        cst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(cst, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 273, 141, 25));

        cvt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cvt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cvtKeyPressed(evt);
            }
        });
        jPanel1.add(cvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 336, 141, 29));

        update.setBackground(new java.awt.Color(204, 255, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pictogrammers-Material-Cursor-default-click.24.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        back.setBackground(new java.awt.Color(255, 204, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Graphicloads-100-Flat-2-Arrow-back.24.png"))); // NOI18N
        back.setText("Cancel");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Blue Gradient Zoom Virtual Background.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String scpu = ccpu.getText();
        
        String smr = cmr.getText();
        
        String ssc = csc.getText();
        
        String scst = cst.getText();
        
        String svt = cvt.getText();
        
        if(scpu.equals("") || smr.equals("") || ssc.equals("") || 
                        scst.equals("") || svt.equals("") ){
                JOptionPane.showMessageDialog(null, "All Field are Required!!");
            }else if (isChar(scpu)){
                JOptionPane.showMessageDialog(null, "Please enter Cost Per Unit In Float or Integer Format!!");
            }else if (isChar(smr)){
                JOptionPane.showMessageDialog(null, "Please enter Meter Rent In Float or Integer Format!!");
            }else if (isChar(ssc)){
                JOptionPane.showMessageDialog(null, "Please enter Service Charge In Float or Integer Format!!");
            }else if (isChar(scst)){
                JOptionPane.showMessageDialog(null, "Please enter Service Tax In Float or Integer Format!!");
            }else if (isChar(svt)){
                JOptionPane.showMessageDialog(null, "Please enter Vat In Float or Integer Format!!");
            }else{
        try{
            float costPerUnit =  Float.parseFloat(scpu);
            float meterRent =  Float.parseFloat(smr);
            float ServiceCharge =  Float.parseFloat(ssc);
            float ServiceTax =  Float.parseFloat(scst);
            float vat =  Float.parseFloat(svt);
            
            Conn c = new Conn();
            
            
                
            String query = "update tax set cost_per_unit = '"+costPerUnit+"', meter_rent = '"+meterRent+"', service_charge = '"+ServiceCharge+"', service_tax= '"+ServiceTax+"', vat= '"+vat+"' ";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Tax Update Successful!!");
            
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       setVisible(false);
       
    }//GEN-LAST:event_backActionPerformed

    private void cvtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String scpu = ccpu.getText();
        
        String smr = cmr.getText();
        
        String ssc = csc.getText();
        
        String scst = cst.getText();
        
        String svt = cvt.getText();
        
        if(scpu.equals("") || smr.equals("") || ssc.equals("") || 
                        scst.equals("") || svt.equals("") ){
                JOptionPane.showMessageDialog(null, "All Field are Required!!");
            }else if (isChar(scpu)){
                JOptionPane.showMessageDialog(null, "Please enter Cost Per Unit In Float or Integer Format!!");
            }else if (isChar(smr)){
                JOptionPane.showMessageDialog(null, "Please enter Meter Rent In Float or Integer Format!!");
            }else if (isChar(ssc)){
                JOptionPane.showMessageDialog(null, "Please enter Service Charge In Float or Integer Format!!");
            }else if (isChar(scst)){
                JOptionPane.showMessageDialog(null, "Please enter Service Tax In Float or Integer Format!!");
            }else if (isChar(svt)){
                JOptionPane.showMessageDialog(null, "Please enter Vat In Float or Integer Format!!");
            }else{
        try{
            float costPerUnit =  Float.parseFloat(scpu);
            float meterRent =  Float.parseFloat(smr);
            float ServiceCharge =  Float.parseFloat(ssc);
            float ServiceTax =  Float.parseFloat(scst);
            float vat =  Float.parseFloat(svt);
            
            Conn c = new Conn();
            
            
                
            String query = "update tax set cost_per_unit = '"+costPerUnit+"', meter_rent = '"+meterRent+"', service_charge = '"+ServiceCharge+"', service_tax= '"+ServiceTax+"', vat= '"+vat+"' ";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Tax Update Successful!!");
            
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        }
    }//GEN-LAST:event_cvtKeyPressed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        


positionX = evt.getX();
        positionY = evt.getY();


    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_formMouseDragged

    
    
     public static boolean isChar(String cha) {
        
       for (int i = 0; i < cha.length(); i++) {
        if (!Character.isLetter(cha.charAt(i))) {
            return false;
        }
    }
    return true;
    }
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
            java.util.logging.Logger.getLogger(UpdateTax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateTax().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField ccpu;
    private javax.swing.JTextField cmr;
    private javax.swing.JLabel cpu;
    private javax.swing.JTextField csc;
    private javax.swing.JTextField cst;
    private javax.swing.JTextField cvt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mr;
    private javax.swing.JLabel sc;
    private javax.swing.JLabel st;
    private javax.swing.JButton update;
    private javax.swing.JLabel vt;
    // End of variables declaration//GEN-END:variables
}