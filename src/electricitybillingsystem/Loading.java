/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electricitybillingsystem;

import javax.swing.*;

/**
 *
 * @author Zim
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    loadThread a1;
    public Loading() {
        initComponents();
        
        a1 = new loadThread(bar);
        a1.start();
    }
    
    class loadThread extends Thread{
        
        JProgressBar pbar;
        
        loadThread(JProgressBar pbar){
            pbar = bar;
        }
        
        public void run(){
            int min=0;
            int max = 100;
            
            bar.setMaximum(min);
            bar.setMaximum(max);
            bar.setValue(0);
            try{
                Conn c = new Conn();
            
            String query1 = "create table adminlogin(username varchar(20), name char(20), PASSWORD varchar(20), date_of_birth date, account_type char(10), jobid int(20) PRIMARY KEY NOT NULL, Security_Question text, answer text)";
            c.s.executeUpdate(query1);
        String query2 = "create table customer(name char(20) NOT NULL, meter_no int PRIMARY KEY NOT null, address varchar(50)NOT NULL, city varchar(30)NOT NULL, email varchar(50)NOT null, phone int(20) NOT NULL, PASSWORD varchar(20) NOT NULL, date_of_birth date NOT NULL, nid int UNIQUE NOT NULL, Security_Question text NOT NULL, answer text NOT NULL)";    
            c.s.executeUpdate(query2);
            String query3 = "create table meter_info(meter_no int(20) NOT NULL, meter_location char(20) NOT NULL, meter_type char(20) NOT NULL, phase_code int(20) NOT NULL, bill_type char(20) NOT NULL, days char(20) NOT NULL,FOREIGN KEY (meter_no) REFERENCES customer(meter_no) ON DELETE CASCADE)";    
            c.s.executeUpdate(query3);
         String query4 = "create table tax(cost_per_unit float(20,5) NOT NULL, meter_rent float(20,5) NOT NULL, service_charge float(20,5) NOT NULL, service_tax float(20,5) NOT NULL, vat float(20,5) NOT NULL)";    
            c.s.executeUpdate(query4);    
            String query5 = "create table bill(meter_no int(20) NOT NULL, bill_entry_date date NOT NULL, billing_month char(20) NOT NULL, billing_year int NOT NULL, units float(20,5) NOT NULL, totalbill int NOT NULL, status char(10) NOT NULL, FOREIGN KEY (meter_no) REFERENCES customer(meter_no) ON DELETE CASCADE)";    
            c.s.executeUpdate(query5);
            
            String query6 = "CREATE TABLE customer_report( meter_no int NOT NULL, report text, date_month_year date , replay text ,  FOREIGN KEY (meter_no) REFERENCES customer(meter_no) ON DELETE CASCADE)";    
            c.s.executeUpdate(query6); 
            
            String query7 = "CREATE TABLE meter_request( meter_no int NOT NULL, status char(10) NOT NULL, RequestDate date, SendingDate date, ReciveDate date, FOREIGN KEY (meter_no) REFERENCES customer(meter_no) ON DELETE CASCADE)";    
            c.s.executeUpdate(query7);
            
            String query8 = "CREATE TABLE TRANSACTION ( meter_no int NOT NULL, TRANSACTIONNO int NOT NULL, amount int NOT NULL, TRANSACTION_date date, FOREIGN KEY (meter_no) REFERENCES customer(meter_no))";    
            c.s.executeUpdate(query8);
            
           
            
            String query9 = "insert into tax VALUES('8.95', '50', '20', '50', '15')";    
            c.s.executeUpdate(query9);
            
            String query10 = "CREATE TRIGGER TotalBill_Constraints BEFORE INSERT ON bill FOR EACH ROW BEGIN SET NEW.totalbill = CEIL(NEW.totalbill); END ";    
            c.s.executeUpdate(query10);
            }catch(Exception e){
                e.printStackTrace();
            }
            for (int i = min; i<max; i++){
                bar.setValue(i);
                try{
                    sleep(20);
                }catch (Exception e){
                e.printStackTrace();
                }
                
            }
           setVisible(false);
        new Login().setVisible(true); 
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bar = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar.setBackground(new java.awt.Color(204, 255, 255));
        bar.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 531, 14));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Version 1.0.0");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" © 2024 B.M. Zim, Inc. All Right Reserved");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 280, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AI technology product loading animation#2.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
