/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lms;

//import java.text.SimpleDateFormat;
import java.sql.*;
//import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import java.text.SimpleDateFormat;
//import com.toedter.calendar.JDateChooser;


/**
 *
 * @author aslam
 */
public class IssuedBooks extends javax.swing.JFrame {

    /**
     * Creates new form IssuedBooks
     */
    public IssuedBooks() {
        initComponents();
        setLocationRelativeTo(null);
        Connect();
    }
    Connection con;
    PreparedStatement ps1;
    PreparedStatement ps2;
    
    public void Connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students1","root","1234");
        
    }catch(Exception ex){
            System.out.println("Error in connection");
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

        Book_Id = new javax.swing.JLabel();
        Student_Id = new javax.swing.JLabel();
        Due_Date = new javax.swing.JLabel();
        Issued_Date = new javax.swing.JLabel();
        vBook_Id = new javax.swing.JTextField();
        vStudent_Id = new javax.swing.JTextField();
        vIssued_Date = new com.toedter.calendar.JDateChooser();
        vDue_Date = new com.toedter.calendar.JDateChooser();
        vSave = new javax.swing.JButton();
        vBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Book_Id.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        Book_Id.setText("Book Id:");
        getContentPane().add(Book_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 70, 30));

        Student_Id.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        Student_Id.setText("Student Id:");
        getContentPane().add(Student_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        Due_Date.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        Due_Date.setText("Due date:");
        getContentPane().add(Due_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        Issued_Date.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        Issued_Date.setText("Issued date:");
        getContentPane().add(Issued_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        vBook_Id.setBackground(new java.awt.Color(255, 255, 204));
        vBook_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vBook_IdActionPerformed(evt);
            }
        });
        getContentPane().add(vBook_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 200, -1));

        vStudent_Id.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(vStudent_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 200, -1));
        getContentPane().add(vIssued_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 200, -1));
        getContentPane().add(vDue_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 200, -1));

        vSave.setBackground(new java.awt.Color(0, 102, 102));
        vSave.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        vSave.setForeground(new java.awt.Color(255, 255, 255));
        vSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/save-icon--1.png"))); // NOI18N
        vSave.setText("Save");
        vSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vSaveActionPerformed(evt);
            }
        });
        getContentPane().add(vSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 130, 40));

        vBack.setBackground(new java.awt.Color(0, 102, 102));
        vBack.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        vBack.setForeground(new java.awt.Color(255, 255, 255));
        vBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/red-x-mark-transparent-background-3.png"))); // NOI18N
        vBack.setText("Close");
        vBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vBackActionPerformed(evt);
            }
        });
        getContentPane().add(vBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 130, 40));

        jLabel2.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("ISSUED BOOKS DETAILS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 330, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/123456.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vBook_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vBook_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vBook_IdActionPerformed

    private void vSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vSaveActionPerformed
         SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
    int Book_Id=Integer.parseInt(vBook_Id.getText());
    int Student_Id=Integer.parseInt(vStudent_Id.getText());
    String Issued_Date=dFormat.format(vIssued_Date.getDate());
    String Due_Date=dFormat.format(vDue_Date.getDate());
    String Return_book="No";
         
    try{
        Statement st=con.createStatement();
        ResultSet rs = st.executeQuery("select * from BookDetails where Book_Id='" + Book_Id + "'");
             
        if(rs.next()){
            ResultSet rs1 = st.executeQuery("select * from StudentsDetails where Student_Id='" + Student_Id + "'");
            if(rs1.next()){
                ResultSet rs2 = st.executeQuery("select * from IssuedBooks where Book_Id='" + Book_Id + "' AND Return_book='No'");
                if(!rs2.next()){
                    st.executeUpdate("INSERT INTO IssuedBooks VALUES ('" + Book_Id + "','" + Student_Id + "','" + Issued_Date + "','" + Due_Date + "','" + Return_book + "')");
                    JOptionPane.showMessageDialog(this,"Book successfully issued");
                    setVisible(false);
                    new IssuedBooks().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "Sorry, this book is already issued to someone.");
                }
            }else{
                JOptionPane.showMessageDialog(this,"Incorrect Student id");
            }
        }else{
            JOptionPane.showConfirmDialog(this,"Incorrect Book id");
        }
    }catch(Exception ex){
        ex.printStackTrace();
        System.out.println("Error in issue book code");
    }
    }//GEN-LAST:event_vSaveActionPerformed

    private void vBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vBackActionPerformed
        this.hide();
//        Home1 hm=new Home1();
//        hm.setVisible(true);
    }//GEN-LAST:event_vBackActionPerformed

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
            java.util.logging.Logger.getLogger(IssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssuedBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Book_Id;
    private javax.swing.JLabel Due_Date;
    private javax.swing.JLabel Issued_Date;
    private javax.swing.JLabel Student_Id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton vBack;
    private javax.swing.JTextField vBook_Id;
    private com.toedter.calendar.JDateChooser vDue_Date;
    private com.toedter.calendar.JDateChooser vIssued_Date;
    private javax.swing.JButton vSave;
    private javax.swing.JTextField vStudent_Id;
    // End of variables declaration//GEN-END:variables
}
