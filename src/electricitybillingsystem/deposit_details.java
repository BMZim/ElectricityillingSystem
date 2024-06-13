
package electricitybillingsystem;

import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Zim
 */
public class deposit_details extends javax.swing.JFrame {

    
int positionX = 0, positionY=0;


    
    public deposit_details() {
        initComponents();
        
         
        cmonth.add("Full Year");
        cmonth.add("January");
        cmonth.add("February");
        cmonth.add("March");
        cmonth.add("April");
        cmonth.add("May");
        cmonth.add("June");
        cmonth.add("July");
        cmonth.add("August");
        cmonth.add("September");
        cmonth.add("October");
        cmonth.add("November");
        cmonth.add("December");
        
        
        
        
        
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
        meterno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmonth = new java.awt.Choice();
        jLabel4 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        back = new javax.swing.JButton();
        paid = new javax.swing.JButton();
        notpaid = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 255, 0), new java.awt.Color(204, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Antialiasfactory-Enterprise-Resource-Planning-Balance.24.png"))); // NOI18N
        jLabel1.setText(" Deposit Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 293, 54));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Search By Meter No:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 98, -1, -1));

        meterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meternoActionPerformed(evt);
            }
        });
        jPanel1.add(meterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 92, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("By Month:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 98, -1, -1));
        jPanel1.add(cmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 92, 111, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("By Year:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 92, -1, 30));

        year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearKeyPressed(evt);
            }
        });
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 92, 105, 30));

        search.setBackground(new java.awt.Color(204, 255, 255));
        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Ampeross-Qetto-2-Search.24.png"))); // NOI18N
        search.setText("Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 140, -1, -1));

        print.setBackground(new java.awt.Color(204, 255, 255));
        print.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Treetog-Junior-Printer.24.png"))); // NOI18N
        print.setText("Print Details");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 140, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Meter No", "Bill Entry Date", "Billing Month", "Billing Year", "Units", "Total Bill", "Status"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 233, 726, 327));

        back.setBackground(new java.awt.Color(255, 204, 204));
        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Graphicloads-100-Flat-2-Arrow-back.24.png"))); // NOI18N
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 2));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, 84, 35));

        paid.setBackground(new java.awt.Color(204, 255, 255));
        paid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        paid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Tatice-Cristal-Intense-Ok.24.png"))); // NOI18N
        paid.setText("Paid");
        paid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paidMouseEntered(evt);
            }
        });
        paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidActionPerformed(evt);
            }
        });
        jPanel1.add(paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 190, -1, -1));

        notpaid.setBackground(new java.awt.Color(204, 255, 255));
        notpaid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        notpaid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Oxygen-Icons.org-Oxygen-Actions-edit-delete.24.png"))); // NOI18N
        notpaid.setText("Not Paid");
        notpaid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                notpaidMouseEntered(evt);
            }
        });
        notpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notpaidActionPerformed(evt);
            }
        });
        jPanel1.add(notpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 189, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText(" X");
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 8, 30, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void meternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meternoActionPerformed
        
    }//GEN-LAST:event_meternoActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String smeter =  meterno.getText();
        String smonth = cmonth.getSelectedItem();
        String syear = year.getText();
        
        
        
         try {
            Conn c = new Conn();
            String query1 = "select * from bill where meter_no = '"+smeter+"'  and billing_year = '"+syear+"'";
            ResultSet rs = c.s.executeQuery(query1);
            
            
            if (rs.next()) {
                
                if(smonth.equals("Full Year"))  {
                    String query2 = "select * from bill where meter_no = '"+smeter+"' and billing_year = '"+syear+"'";
                ResultSet ra = c.s.executeQuery(query2);
                table.setModel(DbUtils.resultSetToTableModel(ra));
                      
            }else{
                  
                    String query3 = "select * from bill where meter_no = '"+smeter+"' and billing_month = '"+smonth+"' and billing_year = '"+syear+"'";
                ResultSet rf = c.s.executeQuery(query3);
                table.setModel(DbUtils.resultSetToTableModel(rf));
                      
                }
                }else if (smeter.equals("")){
                JOptionPane.showMessageDialog(null, "Meter No Cannot Be Empty!!!"); 
            } 
                else if (syear.equals("")){
                    JOptionPane.showMessageDialog(null, "Year Cannot Be Empty!!!"); 
                }
                
                    else{
                JOptionPane.showMessageDialog(null, "           Meter No Doesn't Match\n                     OR\n        This Meter No Doesn't Exists in "+syear+"\nSo Please Kindly Enter Correct Meter No That Exist in "+syear+"!!");
                meterno.setText("");
                year.setText("");
            } 
                
                
                
            
            
            
                
                     
                
               
                         
     
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
    }//GEN-LAST:event_searchActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try {
            table.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_printActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
      
    }//GEN-LAST:event_backActionPerformed

    private void paidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidActionPerformed
       String smonth = cmonth.getSelectedItem();
       String syear = year.getText();
        try{
        Conn c = new Conn();
        String query4 = "select * from bill where billing_month = '"+smonth+"' and billing_year = '"+syear+"' and status = 'Paid'";
                ResultSet rz = c.s.executeQuery(query4);
                table.setModel(DbUtils.resultSetToTableModel(rz));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_paidActionPerformed

    private void notpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notpaidActionPerformed
        String smonth = cmonth.getSelectedItem();
       String syear = year.getText();
        
        try{
        Conn c = new Conn();
        String query5 = "select * from bill where billing_month = '"+smonth+"' and billing_year = '"+syear+"' and status = 'Not Paid'";
                ResultSet rn = c.s.executeQuery(query5);
                table.setModel(DbUtils.resultSetToTableModel(rn));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_notpaidActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        int response = JOptionPane.showConfirmDialog(this, "Do You want to Exit the Application?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION){
          System.exit(0);  
        }else{
            
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        String syear = year.getText();
        
        if ( syear.equals("")){
            search.setEnabled(false);
        }else{
            search.setEnabled(true);
        }
    }//GEN-LAST:event_searchMouseEntered

    private void paidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paidMouseEntered
        String syear = year.getText();
        
        if ( syear.equals("")){
            paid.setEnabled(false);
        }else{
            paid.setEnabled(true);
        }
    }//GEN-LAST:event_paidMouseEntered

    private void notpaidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notpaidMouseEntered
        String syear = year.getText();
        
        if ( syear.equals("")){
            notpaid.setEnabled(false);
        }else{
           notpaid.setEnabled(true);
        }
    }//GEN-LAST:event_notpaidMouseEntered

    private void yearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String smeter =  meterno.getText();
        String smonth = cmonth.getSelectedItem();
        String syear = year.getText();
        
        
        
         try {
            Conn c = new Conn();
            String query1 = "select * from bill where meter_no = '"+smeter+"'  and billing_year = '"+syear+"'";
            ResultSet rs = c.s.executeQuery(query1);
            
            
            if (rs.next()) {
                
                if(smonth.equals("Full Year"))  {
                    String query2 = "select * from bill where meter_no = '"+smeter+"' and billing_year = '"+syear+"'";
                ResultSet ra = c.s.executeQuery(query2);
                table.setModel(DbUtils.resultSetToTableModel(ra));
                      
            }else{
                  
                    String query3 = "select * from bill where meter_no = '"+smeter+"' and billing_month = '"+smonth+"' and billing_year = '"+syear+"'";
                ResultSet rf = c.s.executeQuery(query3);
                table.setModel(DbUtils.resultSetToTableModel(rf));
                      
                }
                }else if (smeter.equals("")){
                JOptionPane.showMessageDialog(null, "Meter No Cannot Be Empty!!!"); 
            } 
                else if (syear.equals("")){
                    JOptionPane.showMessageDialog(null, "Year Cannot Be Empty!!!"); 
                }
                
                    else{
                JOptionPane.showMessageDialog(null, "           Meter No Doesn't Match\n                     OR\n        This Meter No Doesn't Exists in "+syear+"\nSo Please Kindly Enter Correct Meter No That Exist in "+syear+"!!");
                meterno.setText("");
                year.setText("");
            } 
                
           
     
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_yearKeyPressed

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
            java.util.logging.Logger.getLogger(deposit_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deposit_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deposit_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deposit_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deposit_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private java.awt.Choice cmonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField meterno;
    private javax.swing.JButton notpaid;
    private javax.swing.JButton paid;
    private javax.swing.JButton print;
    private javax.swing.JButton search;
    private javax.swing.JTable table;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
