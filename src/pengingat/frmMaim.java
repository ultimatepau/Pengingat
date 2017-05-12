/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package pengingat;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author azisn
 */
public class frmMaim extends javax.swing.JFrame {
    
    /**
     * Creates new form frmMaim
     */
    DefaultTableModel dtm;
    Connection koneksi;
    public frmMaim() {
        initComponents();
        koneksi = DatabaseConnection.getKoneksi("localhost", "3306", "root", "", "db_pengingat");
        showData();
    }
    
    public void showData() {
        String[] kolom = { "Enabled", "Alarm Name", "Time", "Repeat", "Days", "Music" };
        dtm = new DefaultTableModel(null, kolom){
            @Override
            public Class getColumnClass(int column) {
                switch(column){
                    case 0 : return Boolean.class;
                    case 3 : return Boolean.class;
                    default : return String.class;
                }
            }
        };
        try
        {
            java.sql.Statement stmt = koneksi.createStatement();
            String query = "\tSELECT\n\t    `tb_alarm`.`enabled`\n\t    , `tb_alarm`.`alarm_name`\n\t    ,`tb_alarm`.`time`\t    \n\t    , `tb_alarm`.`repeat`\n\t    , `tb_alarm`.`days`\n\t    , `tb_music`.`filename`\n\tFROM\n\t    `db_pengingat`.`tb_alarm`\n\t    INNER JOIN `db_pengingat`.`tb_music` \n\t\tON (`tb_alarm`.`id_music` = `tb_music`.`id_music`);";
            ResultSet rs = stmt.executeQuery(query);
            int no = 1;
            while (rs.next()) {
                boolean enabled;
                if (rs.getInt("enabled") == 1) {
                    enabled = true;
                }
                else
                    enabled = false;
                String days;
                boolean repeat;
                if (rs.getInt("repeat") == 1) {
                    repeat = true;
                    days = rs.getString("days");
                }
                else {
                    repeat = false;
                    days = "-";
                }
                String alarm_name = rs.getString("alarm_name");
                String filename = rs.getString("filename");
                String time = rs.getString("time");
                
                dtm.addRow(new Object[] { Boolean.valueOf(enabled), alarm_name, time, Boolean.valueOf(repeat), days, filename });
                no++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        tbDataPengingat.setModel(dtm);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbDataPengingat = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jToolBar1 = new javax.swing.JToolBar();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnSetting = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbDataPengingat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDataPengingat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataPengingatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDataPengingat);

        jToolBar1.setRollover(true);

        btnNew.setText("New");
        btnNew.setFocusable(false);
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNew);

        btnEdit.setText("Edit");
        btnEdit.setFocusable(false);
        btnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEdit);

        btnDelete.setText("Delete");
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDelete);

        btnRefresh.setText("Refresh");
        btnRefresh.setFocusable(false);
        btnRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRefresh);
        jToolBar1.add(jSeparator1);

        jButton1.setText("Mode : Alarm");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator2);

        btnSetting.setText("Setting");
        btnSetting.setFocusable(false);
        btnSetting.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSetting.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSetting);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int baris;
    private void tbDataPengingatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataPengingatMouseClicked
        // TODO add your handling code here:
        baris = tbDataPengingat.getSelectedRow();
    }//GEN-LAST:event_tbDataPengingatMouseClicked
    
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        new NewAlarm(this, true, "Tambah", "").setVisible(true);
    }//GEN-LAST:event_btnNewActionPerformed
    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        String alarm_namee = tbDataPengingat.getValueAt(baris, 1).toString();
        new NewAlarm(this, true, "Edit", alarm_namee).setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        showData();
    }//GEN-LAST:event_btnRefreshActionPerformed
    
    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        // TODO add your handling code here:
        new Setting().setVisible(true);
    }//GEN-LAST:event_btnSettingActionPerformed
    
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
            java.util.logging.Logger.getLogger(frmMaim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMaim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMaim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMaim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Set System L&F
                    UIManager.setLookAndFeel(
                            UIManager.getSystemLookAndFeelClassName());
                }
                catch (UnsupportedLookAndFeelException e) {
                    // handle exception
                }
                catch (ClassNotFoundException e) {
                    // handle exception
                }
                catch (InstantiationException e) {
                    // handle exception
                }
                catch (IllegalAccessException e) {
                    // handle exception
                }
                new frmMaim().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tbDataPengingat;
    // End of variables declaration//GEN-END:variables
}
