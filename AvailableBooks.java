/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lms;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author aslam
 */
public class AvailableBooks extends javax.swing.JFrame {

    /**
     * Creates new form AvailableBooks
     */
    public AvailableBooks() {
        initComponents();
        setLocationRelativeTo(null);
        Connect();
    }
    public void Connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students1","root","1234");
        
    }catch(Exception ex){
            System.out.println("Error in connection");
    }
        
}
    Connection con;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        vTable = new javax.swing.JTable();
        vClick_here = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vTable.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        vTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Book Title", "Author", "Price"
            }
        ));
        jScrollPane2.setViewportView(vTable);
        if (vTable.getColumnModel().getColumnCount() > 0) {
            vTable.getColumnModel().getColumn(0).setHeaderValue("Book Id");
            vTable.getColumnModel().getColumn(1).setHeaderValue("Book Title");
            vTable.getColumnModel().getColumn(2).setHeaderValue("Author");
            vTable.getColumnModel().getColumn(3).setHeaderValue("Price");
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 375, 275));

        vClick_here.setBackground(new java.awt.Color(0, 102, 102));
        vClick_here.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        vClick_here.setForeground(new java.awt.Color(255, 255, 255));
        vClick_here.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/icons8-book-shelf-32.png"))); // NOI18N
        vClick_here.setText("Available books");
        vClick_here.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        vClick_here.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vClick_hereActionPerformed(evt);
            }
        });
        getContentPane().add(vClick_here, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 60));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/cancel.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 160, 60));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/icons8-borrow-book-32.png"))); // NOI18N
        jButton1.setText("Get books");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, 60));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("**Note: use book id for get books**");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 250, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/123456.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vClick_hereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vClick_hereActionPerformed
        try{
            Statement st=con.createStatement();
            String sql="SELECT * FROM BookDetails";
            ResultSet rs=st.executeQuery(sql);
            
            DefaultTableModel tblModel=(DefaultTableModel)vTable.getModel();
            tblModel.setRowCount(0);
            
            while(rs.next()){
                String Book_Id=String.valueOf(rs.getInt("Book_Id"));
                String Book_Title=rs.getString("Book_Title");
                String Author=rs.getString("Author");
                String Price=String.valueOf(rs.getInt("Price"));
                
                String tbData[]={Book_Id,Book_Title,Author,Price};
                //DefaultTableModel tblModel=(DefaultTableModel)vTable.getModel();
                
                tblModel.addRow(tbData);
                
            }
        }catch(Exception Ex){
            System.out.println("Error in available book show button code");
        }
    }//GEN-LAST:event_vClick_hereActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new IssuedBooks().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AvailableBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvailableBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvailableBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvailableBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvailableBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton vClick_here;
    private javax.swing.JTable vTable;
    // End of variables declaration//GEN-END:variables
}
