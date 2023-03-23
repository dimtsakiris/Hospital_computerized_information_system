


import java.sql.*;


public class Insertion extends javax.swing.JFrame {

    /**
     * Creates new form dwmatia
     */
    public Insertion() {
        initComponents();
        myconnection();
        lista();
        
    }
 void lista(){
        int i=0;
        String plythos="SELECT listadom()"; //stored procedure
        try{
          statement=dbConnection.createStatement();
          rs=statement.executeQuery(plythos);
           while(rs.next()){
               typoi[i]=rs.getString("listadom"); //dinw olo ton pinaka gia na parw ta apotelesmata
               i++;
           }
        }catch(SQLException ex){
            System.out.println("\n ---SQL EXCEPTION-- \n");
            while(ex!=null){
            System.out.println("ERROR: "+ex.getMessage());
            ex=ex.getNextException();
            } 
        }
        list.addItem("");
        for(int y=0;y<i;y++){
            list.addItem(typoi[y]);
       
       
       
       
       
        }
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        list = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        tipos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        timi1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        arithmos1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText(" Κλινικές");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Τύποι Δωματίων:");

        list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });

        jLabel2.setText("Πληροφορίες για :");

        tipos.setText("jLabel4");

        jLabel5.setText("Τιμή:");

        timi1.setText("jLabel6");

        jLabel7.setText("Αριθμός:");

        arithmos1.setText("jLabel8");

        jButton3.setText("Αρχική Σελίδα");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Εισαγωγή");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(arithmos1))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(timi1)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipos)
                                    .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tipos))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(timi1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(arithmos1))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        String type=list.getSelectedItem().toString();
        tipos.setText(type);
        try{
          selectdom.setString(1, type);
          rs=selectdom.executeQuery();
          while(rs.next()){
              String apotelesma=rs.getString("pldom"); 
              String ar=apotelesma.substring(4, 5); 
              String tim=apotelesma.substring(1, 3);
              timi1.setText(tim);
              arithmos1.setText(ar);
              
              
          }
          
        }catch(SQLException ex){
            System.out.println("\n SQL EXCEPTION \n");
            while(ex!=null){
                System.out.println("Message"+ex.getMessage());
                ex=ex.getNextException();
            }
        }
        
    }//GEN-LAST:event_listActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new Hospital().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
        new Rooms().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    void myconnection(){
               try{
         Class.forName(driverClassName);  
       }
       catch(ClassNotFoundException ex){
             //gia na mhn ginei crash to programma
           }
       try{
         dbConnection=DriverManager.getConnection(url,username,passwd);
         String apotelesma="SELECT pldom(?)";
         selectdom=dbConnection.prepareStatement(apotelesma);
        
       }
       catch(SQLException ex){
          
           System.out.println("\n SQL EXCEPTION \n");
            while(ex!=null){
          
           
           System.out.println("Message"+ex.getMessage());
           ex=ex.getNextException();
            }
           
          
       }
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
            java.util.logging.Logger.getLogger(Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertion().setVisible(true);
            }
        });
    }
    static String     driverClassName = "org.postgresql.Driver" ;
    static String     url = "jdbc:postgresql://dblabs.it.teithe.gr:5432/it174972" ;
    static Connection dbConnection = null;
    static String     username = "it174972";
    static String     passwd = "23101999"; 
    static Statement statement=null;
    String typoi[]=new String[5];
    static ResultSet rs=null;
    PreparedStatement selectdom=null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arithmos1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> list;
    private javax.swing.JLabel timi1;
    private javax.swing.JLabel tipos;
    // End of variables declaration//GEN-END:variables
}
