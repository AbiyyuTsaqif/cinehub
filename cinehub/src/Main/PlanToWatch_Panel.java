/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.Film;
import Model.History;
import Model.PlanToWatch;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.JTextField;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Immanity
 */
public class PlanToWatch_Panel extends javax.swing.JPanel {

    /**
     * Creates new form PlanToWatch
     */
    public PlanToWatch_Panel() {
        initComponents();
        displayFilm();
        displayPlanToWatch();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        filmIdTb = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        titleTb = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        GenreTb = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        DurationTb = new javax.swing.JTextField();
        watchplanTb = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        filmTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        plantowatchTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        watchBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(38, 38, 38));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 50)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Plan to Watch");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Film id");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        filmIdTb.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        add(filmIdTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 30));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Title");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        titleTb.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        add(titleTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 160, 30));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Genre");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        GenreTb.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        add(GenreTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 160, 30));

        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Watch Plan");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        DurationTb.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        add(DurationTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 160, 30));

        watchplanTb.setDateFormatString("dd-MM-yyyy");
        add(watchplanTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 160, 30));

        filmTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Film id", "Title ", "Genre", "Duration"
            }
        ));
        filmTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filmTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(filmTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 500, 110));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Film List");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 500, -1));

        plantowatchTable.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        plantowatchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Film id", "Title ", "Genre", "Duration", "Watch Plan"
            }
        ));
        plantowatchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plantowatchTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(plantowatchTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 500, 180));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Your Plan to Watch");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 500, -1));

        watchBtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        watchBtn.setText("Watch");
        watchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchBtnActionPerformed(evt);
            }
        });
        add(watchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 80, 30));

        saveBtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 80, 30));

        ResetBtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 170, 30));

        jLabel19.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Duration");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void watchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_watchBtnActionPerformed
       if(filmIdTb.getText().isEmpty() || ((JTextField) watchplanTb.getDateEditor().getUiComponent()).getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a film to watch");
        } else {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinehub", "root", "")) {

                // Insert into HISTORYTABLE
                String insertQuery = "INSERT INTO historyTable VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement add = connection.prepareStatement(insertQuery)) {
                    History classHistory = new History();
                    
                    classHistory.setFilmid(filmIdTb.getText());
                    classHistory.setTitle(titleTb.getText());
                    classHistory.setGenre(GenreTb.getText());
                    classHistory.setDuration(DurationTb.getText());
                    classHistory.setWatchplan(((JTextField) watchplanTb.getDateEditor().getUiComponent()).getText());
                    
                    LocalDate currentDate = LocalDate.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    String formattedDate = currentDate.format(formatter);
                    
                    classHistory.setWatchdate(formattedDate);
                    
                    add.setString(1, classHistory.getFilmid());
                    add.setString(2, classHistory.getTitle());
                    add.setString(3, classHistory.getGenre());
                    add.setString(4, classHistory.getDuration());
                    add.setString(5, classHistory.getWatchplan());
//                    String watchplanString = ((JTextField) watchplanTb.getDateEditor().getUiComponent()).getText();
//                    
                    add.setString(6, classHistory.getWatchdate());

                    int rowsInserted = add.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(this, "Film successfully watched");
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to watch the film. Please try again.");
                    }
                }

                // Delete from PLANTOWATCH
//                String filmId = filmIdTb.getText();
//
//                // Create a Film object and set the film ID
//                Film deletedFilm = new Film();
//                deletedFilm.setFilmid(filmId);
//                
//                String deleteQuery = "DELETE FROM plantoWatchTable WHERE FILMID = ?";
//                try (PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery)) {
//                    deleteStatement.setString(1, filmIdTb.getText());
//                    int rowsDeleted = deleteStatement.executeUpdate();
////                    if (rowsDeleted <= 0) {
////                        JOptionPane.showMessageDialog(this, "Failed to delete the film from PlanToWatch.");
////                    }
//                }
                  
                String filmId = filmIdTb.getText();

                // Create a Film object and set the film ID
                PlanToWatch deletedFilm = new PlanToWatch();
                deletedFilm.setFilmid(filmId);

                String query = "DELETE FROM plantoWatchTable WHERE FILMID = ?";

                try (PreparedStatement deleteStatement = connection.prepareStatement(query)) {
                    deleteStatement.setString(1, deletedFilm.getFilmid());

                    int rowsDeleted = deleteStatement.executeUpdate();
                    if (rowsDeleted > 0) {
//                        JOptionPane.showMessageDialog(this, "Film deleted successfully");
                        // Refresh the film display
                        displayFilm();
                    } else {
//                        JOptionPane.showMessageDialog(this, "Failed to delete the film. Please try again.");
                    }
                }

                // Refresh the PlanToWatch display
                displayPlanToWatch();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_watchBtnActionPerformed

    private void filmTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filmTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) filmTable.getModel();
        int rowIndex = filmTable.getSelectedRow();
        filmIdTb.setText(model.getValueAt(rowIndex, 0).toString());
        titleTb.setText(model.getValueAt(rowIndex, 1).toString());
        GenreTb.setText(model.getValueAt(rowIndex, 2).toString());
        DurationTb.setText(model.getValueAt(rowIndex, 3).toString());
    }//GEN-LAST:event_filmTableMouseClicked

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        if (filmIdTb.getText().isEmpty() || titleTb.getText().isEmpty() || GenreTb.getText().isEmpty() || DurationTb.getText().isEmpty() ||  watchplanTb.getDate() == null) {
        JOptionPane.showMessageDialog(this, "Please fill all of the information");
        } else {
            if (filmIdExists(filmIdTb.getText())) {
                JOptionPane.showMessageDialog(this, "Film already Added");
            } else {
                try {
                    PlanToWatch classPlanToWatch = new PlanToWatch();

                    // Use setter methods to set the values
                    classPlanToWatch.setFilmid(filmIdTb.getText());
                    classPlanToWatch.setTitle(titleTb.getText());
                    classPlanToWatch.setGenre(GenreTb.getText());
                    classPlanToWatch.setDuration(DurationTb.getText());
                    classPlanToWatch.setWatchplan(((JTextField) watchplanTb.getDateEditor().getUiComponent()).getText());
                    
                    Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinehub", "root", "");
                    PreparedStatement add = Con.prepareStatement("insert into plantoWatchTable values (?, ?, ?, ?, ?)");
                    
                    add.setString(1, classPlanToWatch.getFilmid());
                    add.setString(2, classPlanToWatch.getTitle());
                    add.setString(3, classPlanToWatch.getGenre());
                    add.setString(4, classPlanToWatch.getDuration());
//                    String watchplanString = ((JTextField) watchplanTb.getDateEditor().getUiComponent()).getText();
                    add.setString(5, classPlanToWatch.getWatchplan());

                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Film Successfully Added");
                    displayPlanToWatch();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void plantowatchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plantowatchTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) plantowatchTable.getModel();
        int rowIndex = plantowatchTable.getSelectedRow();
        filmIdTb.setText(model.getValueAt(rowIndex, 0).toString());
        titleTb.setText(model.getValueAt(rowIndex, 1).toString());
        GenreTb.setText(model.getValueAt(rowIndex, 2).toString());
        DurationTb.setText(model.getValueAt(rowIndex, 3).toString());

        String dateString = model.getValueAt(rowIndex, 4).toString();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy"); // You should specify the format based on the string date
        try {
            Date date = format.parse(dateString);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            watchplanTb.setCalendar(cal);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_plantowatchTableMouseClicked

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        Reset();
    }//GEN-LAST:event_ResetBtnActionPerformed
    
    public void Reset() {
        filmIdTb.setText("");
        titleTb.setText("");
        GenreTb.setText("");
        DurationTb.setText("");
        watchplanTb.setCalendar(null);
    }
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    private void displayFilm() {
        Film classFilm = new Film();
        classFilm.displayFilm(filmTable, "filmTable");
    }
    
    private void displayPlanToWatch() {
        PlanToWatch classPlanToWatch = new PlanToWatch();
        classPlanToWatch.displayFilm(plantowatchTable, "plantowatchtable");
    }
    
    private boolean filmIdExists(String filmId) {
        boolean exists = false;
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinehub", "root", "");
            PreparedStatement checkFilmId = Con.prepareStatement("SELECT * FROM plantoWatchTable WHERE filmId = ?");
            checkFilmId.setString(1, filmId);
            ResultSet rs = checkFilmId.executeQuery();
            exists = rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exists;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DurationTb;
    private javax.swing.JTextField GenreTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JTextField filmIdTb;
    private javax.swing.JTable filmTable;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable plantowatchTable;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField titleTb;
    private javax.swing.JButton watchBtn;
    private com.toedter.calendar.JDateChooser watchplanTb;
    // End of variables declaration//GEN-END:variables
}