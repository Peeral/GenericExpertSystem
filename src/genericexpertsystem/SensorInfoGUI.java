/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genericexpertsystem;

import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Peeral
 */
public class SensorInfoGUI extends javax.swing.JFrame {

    static private double sensorInfo;
    HumanInterferenceGUI hig;
    /**
     * Creates new form SensorInfoGUI
     */
    public SensorInfoGUI() {
        initComponents();
        hig = new HumanInterferenceGUI();
    }

    public void setSensorInfo(double sensorInfo) {
        SensorInfoGUI.sensorInfo = sensorInfo;
    }
    
    public double getSensorInfo() {
        return sensorInfo;
    }
   // public ArrayList<Double> getFactors() {
     //   hig.getArrayList();
    //}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_TamperResistance = new javax.swing.ButtonGroup();
        jLabel_SensorLabel = new javax.swing.JLabel();
        jLabel_ErrorPercentageLabel = new javax.swing.JLabel();
        jTextField_ErrorPercentage = new javax.swing.JTextField();
        jLabel_Mfg = new javax.swing.JLabel();
        jTextField_MfgDate = new javax.swing.JTextField();
        jLabel_MfgDate = new javax.swing.JLabel();
        jComboBox_Mfg = new javax.swing.JComboBox();
        jLabel_CalibrationDate = new javax.swing.JLabel();
        jTextField_CalibrationDate = new javax.swing.JTextField();
        jLabel_SensorApplication = new javax.swing.JLabel();
        jComboBox_SensorApplication = new javax.swing.JComboBox();
        jLabel_TamperResistance = new javax.swing.JLabel();
        jRadioButton_Low = new javax.swing.JRadioButton();
        jRadioButton_Medium = new javax.swing.JRadioButton();
        jRadioButton_High = new javax.swing.JRadioButton();
        jButton_SensorNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_SensorLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_SensorLabel.setText("Sensor Information");

        jLabel_ErrorPercentageLabel.setText("Error percentage in reading: ");

        jTextField_ErrorPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ErrorPercentageActionPerformed(evt);
            }
        });

        jLabel_Mfg.setText("Manufacturer:");

        jTextField_MfgDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MfgDateActionPerformed(evt);
            }
        });

        jLabel_MfgDate.setText("Manufacturing date:");

        jComboBox_Mfg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D" }));

        jLabel_CalibrationDate.setText("Last calibration date:");

        jTextField_CalibrationDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CalibrationDateActionPerformed(evt);
            }
        });

        jLabel_SensorApplication.setText("Application of the sensor:");

        jComboBox_SensorApplication.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Heart", "Blood pressure", "Blood sugar", "Pacemaker", "Hearing Aid" }));

        jLabel_TamperResistance.setText("Tamper resistance level:");

        buttonGroup_TamperResistance.add(jRadioButton_Low);
        jRadioButton_Low.setText("Low");

        buttonGroup_TamperResistance.add(jRadioButton_Medium);
        jRadioButton_Medium.setText("Medium");

        buttonGroup_TamperResistance.add(jRadioButton_High);
        jRadioButton_High.setText("High");

        jButton_SensorNext.setText("Next ->");
        jButton_SensorNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SensorNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel_SensorLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_Mfg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_ErrorPercentageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_MfgDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_CalibrationDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_SensorApplication, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel_TamperResistance))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton_Low)
                            .addComponent(jTextField_ErrorPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_MfgDate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Mfg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_CalibrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_SensorApplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton_Medium)
                            .addComponent(jRadioButton_High))))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_SensorNext)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_SensorLabel)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ErrorPercentageLabel)
                    .addComponent(jTextField_ErrorPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Mfg)
                    .addComponent(jComboBox_Mfg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_MfgDate)
                    .addComponent(jTextField_MfgDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_CalibrationDate)
                    .addComponent(jTextField_CalibrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_SensorApplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_SensorApplication))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TamperResistance)
                    .addComponent(jRadioButton_Low))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton_Medium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton_High)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(jButton_SensorNext)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_ErrorPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ErrorPercentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ErrorPercentageActionPerformed

    private void jTextField_MfgDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MfgDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MfgDateActionPerformed

    private void jTextField_CalibrationDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CalibrationDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CalibrationDateActionPerformed

    private void jButton_SensorNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SensorNextActionPerformed
        // TODO add your handling code here:
        // Store the sensor base error
        double sensorBaseError = getBaseError(jTextField_ErrorPercentage.getText());
        //System.out.println(sensorBaseError);

        // The manufacturer information is based on the quality and reputation of the manufacturer
        // These values are hard-coded
        double mfgInfo = getMfgInfo(jComboBox_Mfg.getSelectedItem().toString());

        // Mfg date
        double mfgDate = getMfgDate(jTextField_MfgDate.getText());

        // Calibrated date
        double calibDate = getCalibratedDate(jTextField_CalibrationDate.getText());
        //System.out.println(calibDate);
        
        // Tamper resistance level
        double tamperRes = getTamperResistance();
        //System.out.println(tamperRes);
        
        calculateSensorInfo(sensorBaseError, mfgInfo, mfgDate, calibDate, tamperRes);
        
        System.out.println("Sensor Info: " + sensorInfo);
        
        this.setVisible(false);
        //new HumanInterferenceGUI().setVisible(true);
        hig.setVisible(true);
    }//GEN-LAST:event_jButton_SensorNextActionPerformed

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
            java.util.logging.Logger.getLogger(SensorInfoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SensorInfoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SensorInfoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SensorInfoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SensorInfoGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_TamperResistance;
    private javax.swing.JButton jButton_SensorNext;
    private javax.swing.JComboBox jComboBox_Mfg;
    private javax.swing.JComboBox jComboBox_SensorApplication;
    private javax.swing.JLabel jLabel_CalibrationDate;
    private javax.swing.JLabel jLabel_ErrorPercentageLabel;
    private javax.swing.JLabel jLabel_Mfg;
    private javax.swing.JLabel jLabel_MfgDate;
    private javax.swing.JLabel jLabel_SensorApplication;
    private javax.swing.JLabel jLabel_SensorLabel;
    private javax.swing.JLabel jLabel_TamperResistance;
    private javax.swing.JRadioButton jRadioButton_High;
    private javax.swing.JRadioButton jRadioButton_Low;
    private javax.swing.JRadioButton jRadioButton_Medium;
    private javax.swing.JTextField jTextField_CalibrationDate;
    private javax.swing.JTextField jTextField_ErrorPercentage;
    private javax.swing.JTextField jTextField_MfgDate;
    // End of variables declaration//GEN-END:variables
    private JDateChooser jDate_MfgDate;
    private JDateChooser jDate_CalibrationDate;

    private double getBaseError(String errorPercentage) {
        double ans = 15 - (Double.parseDouble(errorPercentage) / 100 * 15);
        return ans;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getMfgInfo(String mfg) {
        // If the Manufacturer is A, then return 10; B then 8; C then 6. For any other manufacturer, return 5
        if (mfg.equals("A")) {
            return 10;
        } else if (mfg.equals("B")) {
            return 8;
        } else if (mfg.equals("C")) {
            return 6;
        }
        return 5;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getMfgDate(String text) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            Date date = df.parse(text);
            Date currDate = new Date();
            //System.out.println(currDate);
            //System.out.println(date);
            double diff = (double) (currDate.getTime() - (date.getTime())) / (1000 * 60 * 60 * 24);
            //System.out.println(diff);
            double years = diff/365;
            if (years <= 1.5) {
                return 15;
            } else if (years > 1.5 && years <= 3) {
                return 13.5;
            } else if (years > 3 && years <= 5) {
                return 11;
            } else if (years > 5 && years <= 7) {
                return 10;
            } else if (years > 7 && years <= 10) {
                return 8.5;
            }


            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (ParseException ex) {
            Logger.getLogger(SensorInfoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 5;
    }

    private double getCalibratedDate(String text) {
        int sixMonths = 0;
        try {
            SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            Date date = df.parse(text);
            Date currDate = new Date();
            //System.out.println(currDate);
            //System.out.println(date);
            double diff = (double) (currDate.getTime() - (date.getTime())) / (1000 * 60 * 60 * 24);
            double years = diff / 365;
            
            // Sensor should be calibrated every 6 months.
            
            sixMonths = (int)(years * 2);
            //System.out.println(years + "    " + sixMonths);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        } catch (ParseException ex) {
            Logger.getLogger(SensorInfoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (15 - sixMonths);
        
    }

    private double getTamperResistance() {
        if (jRadioButton_Low.isSelected()) {
            return 14;
        }
        else if (jRadioButton_Medium.isSelected()) {
            return 9;
        }
        return 4;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void calculateSensorInfo(double sensorBaseError, double mfgInfo, double mfgDate, double calibDate, double tamperRes) {
        double recorded = sensorBaseError + mfgInfo + mfgDate + calibDate + tamperRes;
        double max = 15 + 10 + 15 + 15 + 25;
        sensorInfo = recorded/max;
        System.out.println(sensorInfo);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}