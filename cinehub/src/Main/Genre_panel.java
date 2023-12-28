/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.Genre;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Immanity
 */
public class Genre_panel extends javax.swing.JPanel {

    /**
     * Creates new form Genre_panel
     */
    public Genre_panel() {
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

        genreComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        GenreTable = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        OkBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(38, 38, 38));
        setPreferredSize(new java.awt.Dimension(760, 460));

        genreComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fantasy", "Sci-fi", "Romance", "Drama", "Thriller", "Documentary", "Comedy" }));
        genreComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreComboBoxActionPerformed(evt);
            }
        });

        GenreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Film ID", "Title", "Genre", "Duration", "Mood"
            }
        ));
        jScrollPane1.setViewportView(GenreTable);

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Genre");

        OkBtn.setText("OK");
        OkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(genreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    private void displayFilm() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinehub", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from filmTable");
            GenreTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    private void genreComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreComboBoxActionPerformed

    private void OkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkBtnActionPerformed
        try {
            // Get the selected mood from the combo box
            String selectedGenre = (String) genreComboBox.getSelectedItem();

            // Check if a mood is selected
            if (selectedGenre != null) {
                // Construct the Mood object and set the moodType
                Genre genre = new Genre();
                genre.setGenreType(selectedGenre);

                // Construct the SQL query with a WHERE clause based on the selected mood
                String query = "SELECT * FROM filmTable WHERE Genre = '" + genre.getGenreType() + "'";

                // Establish database connection
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinehub", "root", "");
                St = Con.createStatement();

                // Execute the query and update the table model
                Rs = St.executeQuery(query);
                GenreTable.setModel(DbUtils.resultSetToTableModel(Rs));
            } else {
                // Handle the case where no mood is selected
                System.out.println("Please select a genre");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_OkBtnActionPerformed
    
    public void Reset() {
        genreComboBox.setSelectedIndex(-1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable GenreTable;
    private javax.swing.JButton OkBtn;
    private javax.swing.JComboBox<String> genreComboBox;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
