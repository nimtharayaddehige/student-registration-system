/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Control.CStudentinfo;
import Control.CSubject;
import Model.DBConnection;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Model.SStudentinfo;
import Model.SSubjectinfo;
import java.awt.Font;
import javax.swing.table.TableModel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Thara
 */
public class Vsubjectinfo extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
private DefaultTableModel tableModel;
private ResultSet rst;
 
    public Vsubjectinfo() {
        initComponents();
        setupUI();
        populateTableWithData();
    }
     
     private void setupUI()
    {
        String[] columnNames = {"Subject"};
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(columnNames);
        tbl_subject.setModel(tableModel);
       
    }
     
    private void populateTableWithData() {
        
    // Create a font with the desired size
    Font tableFont = new Font("Segoe UI", Font.PLAIN, 36); // Change the font and size as needed

    // Create a cell renderer with the new font
    DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
    cellRenderer.setFont(tableFont);

    // Apply the cell renderer to all columns
    for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++) {
        tbl_subject.getColumnModel().getColumn(columnIndex).setCellRenderer(cellRenderer);
    }
     CSubject c1 = new CSubject();
    rst = c1.getSubjectInfo();

    
    try {
    // Clear any existing data
    tableModel.setRowCount(0);
    
    
    
    // Populate the table model with data from the result set
    while (rst.next()) {
        String SubjectName = rst.getString("subName");
        
        // Add the data to the table model
        Object[] rowData = {SubjectName};
        tableModel.addRow(rowData);
    }
} catch (SQLException e) {
    e.printStackTrace();
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//       public ArrayList<SSubjectinfo> getSubjectinfoList()
//    {
//        ArrayList<SSubjectinfo> Subjecctinfo = new ArrayList<SSubjectinfo>();
//        Connection con = DBConnection.connectDB();
//        String query = "select * from admin";
//        Statement st;
//        ResultSet rs;
//        
//          try
//        {
//            st = con.createStatement();
//            rs =st.executeQuery(query);
//            Subjecctinfo subinfo;
//            
//            while(rs.next())
//            {
//                subinfo = new Subjecctinfo(rs.getString("subjectname"));
//                 Subjecctinfo(subinfo );
//            }
//                
//        }
//           catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        return Subjecctinfo;
//    }
//       
//         public void show_Jtable()
//    {
//       ArrayList <SSubjectinfo> list = getSubjectinfoList();
//        DefaultTableModel model = (DefaultTableModel)tableDark3.getModel();
//        Object[] row = new Object[1];
//        for(int i=0;i<list.size();i++)
//        {
//            row[0] = list.get(i).getSubname();                     
//            model.addRow(row);
//        }
//    }
//    
//          private static String generateNextId(String lastId) {
//        int nextNumber = 1;
//        if (lastId != null && lastId.startsWith("J")) {
//            int lastNumber = Integer.parseInt(lastId.substring(1));
//            nextNumber = lastNumber + 1;
//        }
//        
//        String formattedNumber = String.format("%03d" , nextNumber);
//        return "J" + formattedNumber;
//    }
//    
//    private String generateLastID()
//    {
//        String lastId = null;
//        try
//        {
//            ResultSet resultSet;
//            CSubject c2 = new CSubject();
//            resultSet = c2.getSubjectInfo();
//            
//            if (resultSet.next()) {
//                lastId = resultSet.getString(1);
//            }
//
//          }
//        catch(SQLException e)
//        {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        return lastId;
//    }
    // </editor-fold>
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_subject = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_subname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().setLayout(null);

        tbl_subject.setBackground(new java.awt.Color(13, 73, 100));
        tbl_subject.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbl_subject.setForeground(new java.awt.Color(255, 255, 255));
        tbl_subject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Subject ID", "Subject name"
            }
        ));
        tbl_subject.setGridColor(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(tbl_subject);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 40, 190, 280);

        btn_add.setBackground(new java.awt.Color(13, 73, 100));
        btn_add.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Save-icon.png"))); // NOI18N
        btn_add.setText("Add Subject");
        btn_add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add);
        btn_add.setBounds(120, 130, 140, 50);

        btn_reset.setBackground(new java.awt.Color(13, 73, 100));
        btn_reset.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/account.png"))); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset);
        btn_reset.setBounds(120, 200, 140, 50);

        btn_delete.setBackground(new java.awt.Color(13, 73, 100));
        btn_delete.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/cancel1.png"))); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete);
        btn_delete.setBounds(120, 270, 140, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Subject Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 80, 110, 16);

        txt_subname.setBackground(new java.awt.Color(230, 230, 245));
        txt_subname.setForeground(new java.awt.Color(0, 0, 51));
        txt_subname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_subname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_subnameKeyTyped(evt);
            }
        });
        getContentPane().add(txt_subname);
        txt_subname.setBounds(150, 72, 170, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/bk6.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADD SUBJECT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Historic", 1, 18), new java.awt.Color(0, 42, 50))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, 0, 580, 400);

        setSize(new java.awt.Dimension(577, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        if(txt_subname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter a subject to Save");
        }
        else
        {
            String subname = txt_subname.getText();
            CSubject sub = new CSubject();
            sub.addSubject(subname);
            populateTableWithData();
//            DefaultTableModel model = (DefaultTableModel)tableDark3.getModel();
//            model.setRowCount(0);
//            show_Jtable();
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
      txt_subname.setText(null);
      populateTableWithData();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try
        {
            
            int userChoice = JOptionPane.showConfirmDialog(null, "Do you wish to Delete the Subject?", "Warning", JOptionPane.ERROR_MESSAGE);
            if(userChoice == JOptionPane.YES_OPTION)
            {
                int index = tbl_subject.getSelectedRow();
                TableModel model = tbl_subject.getModel();
            
                String subname = model.getValueAt(index, 0).toString();
                CSubject c4 = new CSubject();
                c4.deleteSubject(subname);
                populateTableWithData();
            }
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null,"Please select a Subject to Delete","Error",JOptionPane.ERROR_MESSAGE);
        }
//         String subname= txt_subname.getText();         
//         CSubject c3 = new CSubject();
//         c3.deleteSubject(subname);
//         txt_subname.setText(null);
//       
//        
//         DefaultTableModel model = (DefaultTableModel)tbl_subject.getModel();
//            model.setRowCount(0);
            
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void txt_subnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_subnameKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_subnameKeyTyped

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
            java.util.logging.Logger.getLogger(Vsubjectinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vsubjectinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vsubjectinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vsubjectinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vsubjectinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_subject;
    private javax.swing.JTextField txt_subname;
    // End of variables declaration//GEN-END:variables

    private static class Subjecctinfo {

        public Subjecctinfo() {
        }

    }
}
