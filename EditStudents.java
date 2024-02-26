/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lms;
import java.sql.*;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import com.toedter.calendar.JDateChooser;
/**
 *
 * @author aslam
 */
public class EditStudents extends javax.swing.JFrame {

    /**
     * Creates new form EditStudents
     */
    public EditStudents() {
        initComponents();
       //setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        Student_Id = new javax.swing.JLabel();
        vStudent_Id = new javax.swing.JTextField();
        Student_Name = new javax.swing.JLabel();
        Student_Class = new javax.swing.JLabel();
        Contect_Num = new javax.swing.JLabel();
        vContect_Num = new javax.swing.JTextField();
        vClass = new javax.swing.JTextField();
        vStudent_Name = new javax.swing.JTextField();
        vEdit = new javax.swing.JButton();
        vDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        vDate = new com.toedter.calendar.JDateChooser();
        Regs_Date = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Student_Id.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Student_Id.setText("Student Id:");
        getContentPane().add(Student_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, 24));

        vStudent_Id.setBackground(new java.awt.Color(255, 255, 153));
        vStudent_Id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        vStudent_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vStudent_IdActionPerformed(evt);
            }
        });
        getContentPane().add(vStudent_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 180, -1));

        Student_Name.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Student_Name.setText("Student Name:");
        getContentPane().add(Student_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        Student_Class.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Student_Class.setText("Class:");
        getContentPane().add(Student_Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        Contect_Num.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Contect_Num.setText("Contect Num:");
        getContentPane().add(Contect_Num, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        vContect_Num.setBackground(new java.awt.Color(255, 255, 153));
        vContect_Num.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(vContect_Num, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 180, -1));

        vClass.setBackground(new java.awt.Color(255, 255, 153));
        vClass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        vClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vClassActionPerformed(evt);
            }
        });
        getContentPane().add(vClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 180, -1));

        vStudent_Name.setBackground(new java.awt.Color(255, 255, 153));
        vStudent_Name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(vStudent_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 180, -1));

        vEdit.setBackground(new java.awt.Color(0, 102, 102));
        vEdit.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        vEdit.setForeground(new java.awt.Color(255, 255, 255));
        vEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/icons8-edit-property-32.png"))); // NOI18N
        vEdit.setText("Edit");
        vEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vEditActionPerformed(evt);
            }
        });
        getContentPane().add(vEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 130, 40));

        vDelete.setBackground(new java.awt.Color(0, 102, 102));
        vDelete.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        vDelete.setForeground(new java.awt.Color(255, 255, 255));
        vDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/icons8-delete-32.png"))); // NOI18N
        vDelete.setText("Delete");
        vDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(vDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 130, 40));

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("MAKE YOUR CHANGES HERE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 370, 40));
        getContentPane().add(vDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 220, 180, -1));

        Regs_Date.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Regs_Date.setText("Reg.Date:");
        getContentPane().add(Regs_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/back (1).png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/123456.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vStudent_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vStudent_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vStudent_IdActionPerformed

    private void vClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vClassActionPerformed

    private void vEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vEditActionPerformed
       SimpleDateFormat dFormat = new SimpleDateFormat("MM-dd-yyyy");
    try {
        String Student_Id = vStudent_Id.getText();
        String Student_Name = vStudent_Name.getText();
        String Student_Class = vClass.getText();
        String RegsDate = dFormat.format(vDate.getDate()); // Use Regs_Date instead of RegsDate
        int Contect_Num = Integer.parseInt(vContect_Num.getText());

        ps2 = con.prepareStatement("UPDATE StudentsDetails SET Student_Name=?, Class=?, RegsDate=?, Contact_Number=? WHERE Student_Id=?");
        ps2.setString(1, Student_Name);
        ps2.setString(2, Student_Class);
        ps2.setString(3, RegsDate);
        ps2.setInt(4, Contect_Num);
        ps2.setString(5, Student_Id);

        int Status = ps2.executeUpdate();
        if (Status == 1) {
            JOptionPane.showMessageDialog(this, "Successfully updated");
            vStudent_Id.setText("");
            vStudent_Name.setText("");
            vClass.setText("");
            vContect_Num.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Can't update");
        }

    } catch (Exception Ex) {
        Ex.printStackTrace();
        System.out.println("Error in Student update code");
    }
       

    }//GEN-LAST:event_vEditActionPerformed

    private void vDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vDeleteActionPerformed
        try{
        String Student_Id=vStudent_Id.getText();
        
        ps2=con.prepareStatement("DELETE FROM StudentsDetails WHERE Student_Id=?");
        ps2.setString(1, Student_Id);
        int Status = ps2.executeUpdate();
        
        if(Status == 1){
            JOptionPane.showMessageDialog(this, "Succesfully deleted");
            vStudent_Id.setText("");
            vStudent_Name.setText("");
            vClass.setText("");
            vContect_Num.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Can't delete");
        }
        
        }catch(Exception ex){
            System.out.println("Error in student delete code");
        }

    }//GEN-LAST:event_vDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
//        Home1 hm=new Home1();
//        hm.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EditStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contect_Num;
    private javax.swing.JLabel Regs_Date;
    private javax.swing.JLabel Student_Class;
    private javax.swing.JLabel Student_Id;
    private javax.swing.JLabel Student_Name;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField vClass;
    private javax.swing.JTextField vContect_Num;
    private com.toedter.calendar.JDateChooser vDate;
    private javax.swing.JButton vDelete;
    private javax.swing.JButton vEdit;
    private javax.swing.JTextField vStudent_Id;
    private javax.swing.JTextField vStudent_Name;
    // End of variables declaration//GEN-END:variables
}
