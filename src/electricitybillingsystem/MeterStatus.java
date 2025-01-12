/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electricitybillingsystem;



import com.toedter.calendar.JDateChooser;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;


/**
 *
 * @author Zim
 */

public class MeterStatus extends javax.swing.JFrame {

    
int positionX = 0, positionY=0;


    public MeterStatus() {
        initComponents();
        Date.setDate(new Date());
    }
    
     public MeterStatus( String smeter) {
        initComponents();
        meterno.setText(smeter);
        
        
         try{
            Conn c = new Conn();
  
           String query = "select status from meter_request where meter_no = '"+smeter+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                String status = rs.getString("status");
               mstatus.setText(status);
            }
   
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
         String astatus = mstatus.getText();
        
        
            if (astatus.equals("Pending")){
            
                received.setEnabled(false);
                
            }else if (astatus.equals("Sent")){
                received.setEnabled(true);
                Date.setDate(new Date());
                
            }else{
                received.setEnabled(false);
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mstatus = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        received = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        meterno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Date = new com.toedter.calendar.JDateChooser();

        jLabel3.setText("jLabel3");

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
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Meter Status:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 84, -1, 28));

        mstatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mstatus.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(mstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 84, 105, 30));

        exit.setBackground(new java.awt.Color(255, 204, 204));
        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Oxygen-Icons.org-Oxygen-Actions-edit-delete.24.png"))); // NOI18N
        exit.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 255, 0)));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 2, -1, 30));

        received.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        received.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Tatice-Cristal-Intense-Ok.24.png"))); // NOI18N
        received.setText("Received");
        received.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                receivedStateChanged(evt);
            }
        });
        received.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                receivedMouseEntered(evt);
            }
        });
        received.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receivedActionPerformed(evt);
            }
        });
        jPanel1.add(received, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 199, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Meter No:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 38, -1, 28));

        meterno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(meterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 38, 128, 28));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Received Date:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 132, -1, 28));
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        setVisible(false);
    }//GEN-LAST:event_exitActionPerformed

    private void receivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receivedActionPerformed
       SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String sdate = df.format(Date.getDate());
        String smeter = meterno.getText();
                
                  try{
                        Conn c = new Conn();
                        
                        
                        String query = "update meter_request set status = 'Received', ReciveDate = '"+sdate+"' where meter_no = '"+smeter+"'";
                        c.s.executeUpdate(query);
                        
                        JOptionPane.showMessageDialog(null, "Confirmed");
                        received.setEnabled(false);
                        
                    }catch(Exception e){
                        e.printStackTrace();
                    }
    }//GEN-LAST:event_receivedActionPerformed

    private void receivedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receivedMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_receivedMouseEntered

    private void receivedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_receivedStateChanged
        String astatus = mstatus.getText();
        
        
            if (astatus.equals("Pending")){
            
                received.setEnabled(false);
            }else if (astatus.equals("Sent")){
                received.setEnabled(true);
            }else{
                received.setEnabled(false);
            }
    }//GEN-LAST:event_receivedStateChanged

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
            java.util.logging.Logger.getLogger(MeterStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeterStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeterStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeterStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MeterStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel meterno;
    private javax.swing.JLabel mstatus;
    private javax.swing.JButton received;
    // End of variables declaration//GEN-END:variables
}
