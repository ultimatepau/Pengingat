/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengingat;

/**
 *
 * @author azisn
 */

public class cbxDaysSaturday extends javax.swing.JPanel {

    /**
     * Creates new form cbxDays
     */
    public String day = "";
    public cbxDaysSaturday() {
        initComponents();
    }
    int[] arrDay = new int[6];
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CBWednesday = new javax.swing.JCheckBox();
        CBThursday = new javax.swing.JCheckBox();
        CBMonday = new javax.swing.JCheckBox();
        CBSunday = new javax.swing.JCheckBox();
        CBSaturday = new javax.swing.JCheckBox();
        CBFriday = new javax.swing.JCheckBox();
        CBTuesday = new javax.swing.JCheckBox();

        CBWednesday.setText("Wednesday");
        CBWednesday.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBWednesdayItemStateChanged(evt);
            }
        });

        CBThursday.setText("Thursday");
        CBThursday.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBThursdayItemStateChanged(evt);
            }
        });

        CBMonday.setText("Monday");
        CBMonday.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBMondayItemStateChanged(evt);
            }
        });

        CBSunday.setText("Sunday");
        CBSunday.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBSundayItemStateChanged(evt);
            }
        });

        CBSaturday.setText("Saturday");
        CBSaturday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSaturdayActionPerformed(evt);
            }
        });

        CBFriday.setText("Friday");
        CBFriday.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBFridayItemStateChanged(evt);
            }
        });

        CBTuesday.setText("Tuesday");
        CBTuesday.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBTuesdayItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CBSaturday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBSunday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBMonday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBTuesday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBWednesday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBThursday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBFriday))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBSunday)
                    .addComponent(CBMonday)
                    .addComponent(CBTuesday)
                    .addComponent(CBWednesday)
                    .addComponent(CBThursday)
                    .addComponent(CBFriday)
                    .addComponent(CBSaturday))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CBSaturdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBSaturdayActionPerformed
        // TODO add your handling code here:
        if (arrDay[0] == 0){
            day += "Saturday ";
            arrDay[0] = 1;
        }
        else{
            day = day.replace("Saturday ", "");
            arrDay[0] = 0;
        }
        System.out.println(day);
    }//GEN-LAST:event_CBSaturdayActionPerformed

    private void CBSundayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBSundayItemStateChanged
        // TODO add your handling code here:
        if (arrDay[1] == 0){
            day += "Sunday ";
            arrDay[1] = 1;
        }
        else{
            day = day.replace("Sunday ", "");
            arrDay[1] = 0;
        }
        System.out.println(day);
    }//GEN-LAST:event_CBSundayItemStateChanged

    private void CBMondayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBMondayItemStateChanged
        // TODO add your handling code here:
        if (arrDay[2] == 0){
            day += "Monday ";
            arrDay[2] = 1;
        }
        else{
            day = day.replace("Monday ", "");
            arrDay[2] = 0;
        }
        System.out.println(day);
    }//GEN-LAST:event_CBMondayItemStateChanged

    private void CBTuesdayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBTuesdayItemStateChanged
        // TODO add your handling code here:
        if (arrDay[3] == 0){
            day += "Tuesday ";
            arrDay[3] = 1;
        }
        else{
            day = day.replace("Tuesday ", "");
            arrDay[3] = 0;
        }
        System.out.println(day);
    }//GEN-LAST:event_CBTuesdayItemStateChanged

    private void CBWednesdayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBWednesdayItemStateChanged
        // TODO add your handling code here:
        if (arrDay[4] == 0){
            day += "Wednesday ";
            arrDay[4] = 1;
        }
        else{
            day = day.replace("Wednesday ", "");
            arrDay[4] = 0;
        }
        System.out.println(day);
    }//GEN-LAST:event_CBWednesdayItemStateChanged

    private void CBThursdayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBThursdayItemStateChanged
        // TODO add your handling code here:
        if (arrDay[5] == 0){
            day += "Thursday ";
            arrDay[5] = 1;
        }
        else{
            day = day.replace("Thursday ", "");
            arrDay[5] = 0;
        }
        System.out.println(day);
    }//GEN-LAST:event_CBThursdayItemStateChanged

    private void CBFridayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBFridayItemStateChanged
        // TODO add your handling code here:
        if (arrDay[6] == 0){
            day += "Friday ";
            arrDay[6] = 1;
        }
        else{
            day = day.replace("Friday ", "");
            arrDay[6] = 0;
        }
        System.out.println(day);
    }//GEN-LAST:event_CBFridayItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBFriday;
    private javax.swing.JCheckBox CBMonday;
    private javax.swing.JCheckBox CBSaturday;
    private javax.swing.JCheckBox CBSunday;
    private javax.swing.JCheckBox CBThursday;
    private javax.swing.JCheckBox CBTuesday;
    private javax.swing.JCheckBox CBWednesday;
    // End of variables declaration//GEN-END:variables
}
