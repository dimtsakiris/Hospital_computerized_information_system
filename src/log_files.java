/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.sql.*;
//import java.time.LocalDateTime;
import javax.swing.table.DefaultTableModel;
public class log_files extends javax.swing.JFrame {

    /**
     * Creates new form log_files
     */
    public log_files() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        times = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Log Files");

        jButton1.setText("Insertions");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        times.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},

            },
            new String [] {
                "id", "plythos","meres","kostos"
            }
        ));
        jScrollPane1.setViewportView(times);

        jButton3.setText("Αρχική Σελίδα");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButton1)
                        .addGap(51, 51, 51)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DefaultTableModel model=(DefaultTableModel) times.getModel();
       model.setRowCount(0);
        try{
         Class.forName(driverClassName);  
       }
       catch(ClassNotFoundException ex){
             //gia na mhn ginei crash to programma
           }
       try{
         dbConnection=DriverManager.getConnection(url,username,passwd);
         statement=dbConnection.createStatement();
         rs=statement.executeQuery("SELECT id, plythos, meres, kostos, check_in, check_out\n" +
"	FROM it174972.\"Insertion\";");
         while(rs.next()){
             Integer t=rs.getInt("id");
             Integer type=rs.getInt("plythos");
             Integer meres=rs.getInt("meres");
             String kostos=rs.getString("kostos");
             //String cin=rs.getString("check_in");
             //String cout=rs.getString("check_out");
             
             Object[]row={t,type,meres,kostos,};
             model.addRow(row);
         }
        
       }
       catch(SQLException ex){
          
           System.out.println("\n SQL EXCEPTION \n");
            while(ex!=null){
          
           
           System.out.println("Message"+ex.getMessage());
           ex=ex.getNextException();
            }
           
          
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           this.setVisible(false);
         new Hospital().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(log_files.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log_files.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log_files.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log_files.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log_files().setVisible(true);
            }
        });
    }
    static String     driverClassName = "org.postgresql.Driver" ;
    static String     url = "jdbc:postgresql://dblabs.it.teithe.gr:5432/it174972" ;
    static Connection dbConnection = null;
    static String     username = "it174972";
    static String     passwd = "23101999";
    static Statement statement=null;
    static ResultSet rs=null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable times;
    // End of variables declaration//GEN-END:variables
}
