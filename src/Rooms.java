

import java.sql.*;
public class Rooms extends javax.swing.JFrame {

 
   
    public Rooms() {
       
        initComponents();
         myconnection();
          lista();
          myconnection2();
          
        
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eisagwgh = new javax.swing.JDialog();
        enhmerwsh = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        meres = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        list = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();
        dcin = new javax.swing.JLabel();
        dcout = new javax.swing.JLabel();
        daystext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        typos_text = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ak = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        timi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        keimeno = new javax.swing.JLabel();

        javax.swing.GroupLayout eisagwghLayout = new javax.swing.GroupLayout(eisagwgh.getContentPane());
        eisagwgh.getContentPane().setLayout(eisagwghLayout);
        eisagwghLayout.setHorizontalGroup(
            eisagwghLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eisagwghLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(enhmerwsh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        eisagwghLayout.setVerticalGroup(
            eisagwghLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eisagwghLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(enhmerwsh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ΕΙΣΑΓΩΓΕΣ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Μέρες από 1-4:");

        meres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3","4" }));
        meres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meresActionPerformed(evt);
            }
        });

        list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });

        jButton1.setText("Ημερομηνίες");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        daystext.setText("1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Ημέρες:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Πλήθος Ασθενών");

        jButton2.setText("Κάνε Εισαγωγή");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Αρχική Σελίδα");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ακύρωσε Εισαγωγή");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Τιμή:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("ΑΚ:");

        jButton5.setText("Πληρωμή");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        keimeno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        keimeno.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(meres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jLabel2)
                            .addGap(28, 28, 28)
                            .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1))))
                .addGroup(layout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(dcin)
                    .addGap(158, 158, 158)
                    .addComponent(dcout)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                            .addComponent(daystext, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(timi, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addComponent(typos_text))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ak, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jButton2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton3)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(keimeno))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(meres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dcin)
                    .addComponent(dcout))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(daystext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButton3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(typos_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jLabel9))
                .addGap(37, 37, 37)
                .addComponent(keimeno)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meresActionPerformed
        String mr=meres.getSelectedItem().toString();
        daystext.setText(mr);
    }//GEN-LAST:event_meresActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         this.setVisible(false);
        new Hospital().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      keimeno.setText("Έγινε Εισαγωγή");
      int taytothta=Integer.valueOf(ak.getText());
       int plythos=Integer.valueOf(typos_text.getText());
      int meres=Integer.valueOf(daystext.getText());
        Double pay=Double.valueOf(timi.getText());
      String cin=dcin.getText();
      String cout=dcout.getText();
      
      try{
            insert_pelatis.setInt(1, taytothta);
            insert_pelatis.setInt(2,plythos);
            insert_pelatis.setInt(3, meres);
            insert_pelatis.setDouble(4, pay);
            insert_pelatis.setDate(5, null);
            insert_pelatis.setDate(6, null);
            
            insert_pelatis.executeUpdate();
        }
        catch(SQLException ex){
            System.out.println("\n  --SQL EXCEPTION--- \n");
            while(ex!=null){
                enhmerwsh.showMessageDialog(null,ex.getMessage(),"Ενημέρωση",enhmerwsh.INFORMATION_MESSAGE);
                System.out.println("Message : " + ex.getMessage());
                ex=ex.getNextException();
            }
        }
       eisagwgh.setVisible(true);
        eisagwgh.setSize(800, 800);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        keimeno.setText("Η Κράτηση Ακυρώθηκε");
      
        
         eisagwgh.setVisible(true);
        eisagwgh.setSize(800, 800);
        del();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new plhrwmh().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String type=list.getSelectedItem().toString();
        String mr=meres.getSelectedItem().toString();
        String pay;
        if("1".equals(mr)){
            if(null!=type)switch (type) {
                case "Surgery":
                pay="500";
                timi.setText(pay);
                break;
                case "ICU":
                pay="400";
                timi.setText(pay);
                break;
                case "Pulmonary":
                pay="300";
                timi.setText(pay);
                break;
                case "Neurological":
                pay="200";
                timi.setText(pay);
                break;
                default:
                break;
            }
        }
        if("2".equals(mr)){
            if(null!=type)switch (type) {
                case "Surgery":
                pay="1000";
                timi.setText(pay);
                break;
                case "ICU":
                pay="800";
                timi.setText(pay);
                break;
                case "Pulmonary":
                pay="600";
                timi.setText(pay);
                break;
                case "Neurological":
                pay="400";
                timi.setText(pay);
                break;
                default:
                break;
            }
        }
        if("3".equals(mr)){
            if(null!=type)switch (type) {
                case "Surgery":
                pay="2000";
                timi.setText(pay);
                break;
                case "ICU":
                pay="1600";
                timi.setText(pay);
                break;
                case "Pulmonary":
                pay="900";
                timi.setText(pay);
                break;
                case "Neurological":
                pay="800";
                timi.setText(pay);
                break;
                default:
                break;
            }
        }
        if("4".equals(mr)){
            if(null!=type)switch (type) {
                case "Surgery":
                pay="3000";
                timi.setText(pay);
                break;
                case "ICU":
                pay="2300";
                timi.setText(pay);
                break;
                case "Pulmonary":
                pay="1500";
                timi.setText(pay);
                break;
                case "Neurological":
                pay="1200";
                timi.setText(pay);
                break;
                default:
                break;
            }
        }

        int day=Integer.parseInt(mr);
        try{

            kratisi.setInt(1, day);
            kratisi.setString(2, type);
            rs=kratisi.executeQuery();
            while(rs.next()){

                String cin=rs.getString("check_in");
                String cout=rs.getString("check_out");

                dcin.setText(cin);
                dcout.setText(cout);
            }

        }catch(SQLException ex){
            System.out.println("\n SQL EXCEPTION \n");
            while(ex!=null){
                System.out.println("Message"+ex.getMessage());
                ex=ex.getNextException();
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        String type=list.getSelectedItem().toString();
        typos_text.setText(type);
    }//GEN-LAST:event_listActionPerformed
   
    /**
     * @param args the command line arguments
     */
    
    public String vf(){
        return dcin.getText();
    }
  void lista(){
        int i=0;
        String typoi_dwmatiwn="INSERT INTO it174972.\"Insertion\"(\n" +
"	id, plythos, meres, kostos, check_in, check_out)\n" +
"	VALUES (?, ?, ?, ?, ?, ?);"; //stored procedure
        try{
          statement=dbConnection.createStatement();
          rs=statement.executeQuery(typoi_dwmatiwn);
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
    void myconnection2(){
      try{
         Class.forName(driverClassName);  
       }
       catch(ClassNotFoundException ex){
             //gia na mhn ginei crash to programma
           }
       try{
         dbConnection=DriverManager.getConnection(url,username,passwd);
         String insert_pelati="INSERT INTO it174972.\"Insertion\"(\n" +
"	id, plythos, meres, kostos, check_in, check_out)\n" +
"	VALUES (?, ?, ?, ?, ?, ?);"; //stored procedure
         insert_pelatis=dbConnection.prepareStatement(insert_pelati);
       }
       catch(SQLException ex){
          
           
            while(ex!=null){
          
           
           
           ex=ex.getNextException();
            }
           
          
       }
    }
    void myconnection(){
               try{
         Class.forName(driverClassName);  
       }
       catch(ClassNotFoundException ex){
             //gia na mhn ginei crash to programma
           }
       try{
         dbConnection=DriverManager.getConnection(url,username,passwd);
         String apotelesma=" select * from diathesimothta(?,?)";
         kratisi=dbConnection.prepareStatement(apotelesma);
        
       }
       catch(SQLException ex){
          
           System.out.println("\n SQL EXCEPTION \n");
            while(ex!=null){
          
           
           System.out.println("Message"+ex.getMessage());
           ex=ex.getNextException();
            }
           
          
       }
    }
    void del(){
         try{
         Class.forName(driverClassName);  
       }
       catch(ClassNotFoundException ex){
             //gia na mhn ginei crash to programma
           }
       try{
           int taytothta=Integer.valueOf(ak.getText());
         dbConnection=DriverManager.getConnection(url,username,passwd);
         String delete_pelati="DELETE FROM it174972.\"Insertion\"\n" +
"	WHERE id="+ taytothta +" ;"; //stored procedure
         del_pelatis=dbConnection.prepareStatement(delete_pelati);
         del_pelatis.executeUpdate();
       }
       catch(SQLException ex){
          
           
            while(ex!=null){
          
           
           
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
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rooms().setVisible(true);
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
    PreparedStatement kratisi=null;
    static PreparedStatement insert_pelatis=null;
    static PreparedStatement del_pelatis=null;
           

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ak;
    private javax.swing.JTextField daystext;
    private javax.swing.JLabel dcin;
    private javax.swing.JLabel dcout;
    private javax.swing.JDialog eisagwgh;
    public javax.swing.JOptionPane enhmerwsh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel keimeno;
    private javax.swing.JComboBox<String> list;
    private javax.swing.JComboBox<String> meres;
    private javax.swing.JTextField timi;
    private javax.swing.JTextField typos_text;
    // End of variables declaration//GEN-END:variables
}