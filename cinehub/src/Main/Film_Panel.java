/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import Model.Film;
/**
 *
 * @author Immanity
 */
public class Film_Panel extends javax.swing.JPanel {

    /**
     * Creates new form Home
     */
    public Film_Panel() {
        initComponents();
        displayFilm();
        Reset();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        titleTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        GenreTb = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        DurationTb = new javax.swing.JTextField();
        filmIdTb = new javax.swing.JTextField();
        ResetBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        filmTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        moodcb = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(38, 38, 38));
        setPreferredSize(new java.awt.Dimension(750, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Film List");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        titleTb.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 13)); // NOI18N
        titleTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTbActionPerformed(evt);
            }
        });
        add(titleTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tittle");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Genre");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        GenreTb.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 13)); // NOI18N
        GenreTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenreTbActionPerformed(evt);
            }
        });
        add(GenreTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 140, 30));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Mood");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, -1, -1));

        DurationTb.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 13)); // NOI18N
        DurationTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DurationTbActionPerformed(evt);
            }
        });
        add(DurationTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 140, 30));

        filmIdTb.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 13)); // NOI18N
        filmIdTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmIdTbActionPerformed(evt);
            }
        });
        add(filmIdTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, 30));

        ResetBtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 90, 30));

        SaveBtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 90, 30));

        EditBtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 90, 30));

        DeleteBtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 90, 30));

        filmTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Film id", "Tittle", "Genre", "Duration", "Mood"
            }
        ));
        filmTable.setRowHeight(20);
        filmTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filmTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(filmTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 730, 320));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 50)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Manage Films");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Film id");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        moodcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sad", "Comedy", "Horror", "Action", "Thriller", "Sci-fi", "Romance", "Musical", "Documentary" }));
        moodcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moodcbActionPerformed(evt);
            }
        });
        add(moodcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 100, 30));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Duration");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void titleTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTbActionPerformed

    private void GenreTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenreTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenreTbActionPerformed

    private void DurationTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DurationTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DurationTbActionPerformed

    private void filmIdTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmIdTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filmIdTbActionPerformed
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
//    
    private void displayFilm() {
        Film classFilm = new Film();
        classFilm.displayFilm(filmTable, "filmTable");
    }
//        try {
//            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinehub", "root", "");
//            St = Con.createStatement();
//            Rs = St.executeQuery("select * from filmTable");
//            filmTable.setModel(DbUtils.resultSetToTableModel(Rs));
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        if (filmIdTb.getText().isEmpty() || titleTb.getText().isEmpty() || GenreTb.getText().isEmpty() || DurationTb.getText().isEmpty() || moodcb.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Please fill all of the information");
    } else {
        try {
            Film classFilm = new Film();

            // Use setter methods to set the values
            classFilm.setFilmid(filmIdTb.getText());
            classFilm.setTitle(titleTb.getText());
            classFilm.setGenre(GenreTb.getText());
            classFilm.setDuration(DurationTb.getText());
            classFilm.setMood(moodcb.getSelectedItem().toString());

            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinehub", "root", "");
            PreparedStatement add = Con.prepareStatement("insert into filmTable values (?, ?, ?, ?, ?)");

            // Use getter methods to retrieve values
            add.setString(1, classFilm.getFilmid());
            add.setString(2, classFilm.getTitle());
            add.setString(3, classFilm.getGenre());
            add.setString(4, classFilm.getDuration());
            add.setString(5, classFilm.getMood());

            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Film Successfully Added");
            displayFilm();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed

        
        if (filmIdTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a film to edit");
        } else {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinehub", "root", "")) {
                String filmId = filmIdTb.getText();

                // Create a Film object and set its properties
                Film updatedFilm = new Film();
                updatedFilm.setFilmid(filmId);
                updatedFilm.setTitle(titleTb.getText());
                updatedFilm.setGenre(GenreTb.getText());
                updatedFilm.setDuration(DurationTb.getText());
                updatedFilm.setMood(moodcb.getSelectedItem().toString());

                String query = "UPDATE filmTable SET TITLE=?, GENRE=?, DURATION=?, MOOD=? WHERE FILMID=?";

                try (PreparedStatement updateStatement = connection.prepareStatement(query)) {
                    updateStatement.setString(1, updatedFilm.getTitle());
                    updateStatement.setString(2, updatedFilm.getGenre());
                    updateStatement.setString(3, updatedFilm.getDuration());
                    updateStatement.setString(4, updatedFilm.getMood());
                    updateStatement.setString(5, updatedFilm.getFilmid());

                    int rowsUpdated = updateStatement.executeUpdate();
                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(this, "Film updated successfully");
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to update the film. Please try again.");
                    }
                }

                // Refresh the film display
                displayFilm();
                Reset();

            } catch (SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(this, "Duplicate key value in FILMTABLE. Please choose a different FILMID.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if (filmIdTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select film to delete");
        } else {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinehub", "root", "")) {
                String filmId = filmIdTb.getText();

                // Create a Film object and set the film ID
                Film deletedFilm = new Film();
                deletedFilm.setFilmid(filmId);

                String query = "DELETE FROM filmTable WHERE FILMID = ?";

                try (PreparedStatement deleteStatement = connection.prepareStatement(query)) {
                    deleteStatement.setString(1, deletedFilm.getFilmid());

                    int rowsDeleted = deleteStatement.executeUpdate();
                    if (rowsDeleted > 0) {
                        JOptionPane.showMessageDialog(this, "Film deleted successfully");
                        // Refresh the film display
                        displayFilm();
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to delete the film. Please try again.");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void filmTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filmTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) filmTable.getModel();
        int rowIndex = filmTable.getSelectedRow();
        filmIdTb.setText(model.getValueAt(rowIndex, 0).toString());
        titleTb.setText(model.getValueAt(rowIndex, 1).toString());
        GenreTb.setText(model.getValueAt(rowIndex, 2).toString());
        DurationTb.setText(model.getValueAt(rowIndex, 3).toString());
        moodcb.setSelectedItem(model.getValueAt(rowIndex, 4).toString());
    }//GEN-LAST:event_filmTableMouseClicked
    
    public void Reset() {
        filmIdTb.setText("");
        titleTb.setText("");
        GenreTb.setText("");
        DurationTb.setText("");
        moodcb.setSelectedIndex(-1);
    }
    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        Reset();
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void moodcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moodcbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moodcbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField DurationTb;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField GenreTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField filmIdTb;
    private javax.swing.JTable filmTable;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> moodcb;
    private javax.swing.JTextField titleTb;
    // End of variables declaration//GEN-END:variables
}
