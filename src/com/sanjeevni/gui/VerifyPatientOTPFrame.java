/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjeevni.gui;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.sanjeevni.dao.AppointmentDao;
import com.sanjeevni.dao.DoctorDao;
import com.sanjeevni.dao.PatientDao;
import com.sanjeevni.pojo.AppointmentPojo;
import com.sanjeevni.pojo.PatientPojo;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utility.OTPSender;
import utility.Sender;
import java.awt.Color;
import java.awt.Toolkit;
/**
 *
 * @author LENOVO
 */
public class VerifyPatientOTPFrame extends javax.swing.JFrame {

    /**
     * Creates new form VerifyPatientOTPFrame
     */
    private PatientPojo patient;
    public VerifyPatientOTPFrame() {
        initComponents();
           setLocationRelativeTo(null);
        lblBackground.add(lblHeading);
        lblHeading.setBounds(360, 20, 600, 50);
        setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\It's me sanju\\Downloads\\BeansProjects\\SanjeevaniApplication\\src\\com\\sanjeevni\\icons\\icon.png"));
        getContentPane().setBackground(new Color(236, 249, 255));
    }
       public VerifyPatientOTPFrame(PatientPojo patient) {
       this();
          
       txtPatientName.setText(patient.getFirstName()+" "+patient.getLastName());
       txtMobileNo.setText(patient.getMobileNO());
       this.patient=patient;
       btnVerify.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtPatientName = new javax.swing.JTextField();
        txtMobileNo = new javax.swing.JTextField();
        txtOTP = new javax.swing.JTextField();
        btnSendOTP = new javax.swing.JButton();
        btnVerify = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblBackground = new javax.swing.JLabel();
        lblHeading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Verify OTP ");

        jPanel1.setBackground(new Color(236, 249, 255));

        jPanel2.setBackground(new Color(180, 228, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Patient Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36))); // NOI18N

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        txtMobileNo.setEditable(false);
        txtMobileNo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        txtOTP.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOTPActionPerformed(evt);
            }
        });

        btnSendOTP.setBackground(new Color(47, 88, 205));
        btnSendOTP.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSendOTP.setText("Send OTP");
        btnSendOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendOTPActionPerformed(evt);
            }
        });

        btnVerify.setBackground(new Color(47, 88, 205));
        btnVerify.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnVerify.setForeground(new java.awt.Color(255, 255, 255));
        btnVerify.setText("Verify");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Patient Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Enter OTP");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Mobile NO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("______________________________________________________________________");

        btnBack.setBackground(new Color(47, 88, 205));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new Color(47, 88, 205));
        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(txtOTP))
                        .addGap(142, 142, 142)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(36, 36, 36)
                                .addComponent(txtMobileNo, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                            .addComponent(btnSendOTP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtOTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendOTP))
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerify)
                    .addComponent(btnBack)
                    .addComponent(btnCancel))
                .addGap(39, 39, 39))
        );

        jPanel3.setBackground(new Color(180, 228, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(47, 88, 205), 2));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sanjeevni/icons/HomePageBG1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBackground)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBackground)
                .addContainerGap())
        );

        lblHeading.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblHeading.setForeground(new Color(47, 88, 205));
        lblHeading.setText("SANJEEVNI APPLICATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(lblHeading)
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOTPActionPerformed

    private void btnSendOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendOTPActionPerformed
        // TODO add your handling code here:
           try{
               System.out.println(txtOTP.getText());
//           Sender sender=new OTPSender();
           String pOtp=String.valueOf(patient.getOtp());
           System.out.println("OPt:"+pOtp);
//           boolean result=sender.send(patient.getMobileNO(), pOtp);
//           System.out.println("num:"+patient.getMobileNO()+" pto:"+pOtp);
//           System.out.println("result:"+result);
//           if(result){
               JOptionPane.showMessageDialog(null,"OTP SEND SUCCESSFULLY!");
               btnSendOTP.setText("RESEND OTP");
                  btnVerify.setEnabled(true);
//           }
//           else{
//                 JOptionPane.showMessageDialog(null,"CANNOT SEND THE OTP","Error",JOptionPane.ERROR_MESSAGE);
//           }
       }
//catch(UnirestException ex){
//          JOptionPane.showMessageDialog(null,"SERVER ISSUE PLEASE CONNECT TO INTERNET","Error",JOptionPane.ERROR_MESSAGE);
//           ex.printStackTrace();
//    }
          catch(Exception ex){
           JOptionPane.showMessageDialog(null,"SOMETHING WENT WRONG","Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
       }
        
    }//GEN-LAST:event_btnSendOTPActionPerformed

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        // TODO add your handling code here:
             if(!isValidOTP()){
            JOptionPane.showMessageDialog(null,"INVALID OTP.TRY AGAIN! ","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            AppointmentPojo appojo=new AppointmentPojo();
            appojo.setDateTime(patient.getpDate().toString());
            appojo.setMobileNo(patient.getMobileNO());
            appojo.setOdp(patient.getOdp());
            appojo.setPatientId(patient.getPatientId());
            appojo.setPatientName(txtPatientName.getText().trim());
            appojo.setStatus("REQUEST");
            String docName=DoctorDao.getDoctorNameById(patient.getDoctorId());
            appojo.setDoctorName(docName);
            boolean result1=PatientDao.addPatient(patient);
            boolean result2=AppointmentDao.addAppointment(appojo);
            if(result1 && result2){
                JOptionPane.showMessageDialog(null,"PATIENT RECORD SAVED");
                ViewAllPatientForRecepFrame viewAll=new ViewAllPatientForRecepFrame();
                this.dispose();
                viewAll.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"SORRY! COULD NOT SAVE PATIENT RECORD");
            }
            
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"DATABASE ERROR","Error",JOptionPane.ERROR_MESSAGE);

           ex.printStackTrace();
       }
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new AddPatientFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        new ReceptionistOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(VerifyPatientOTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerifyPatientOTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerifyPatientOTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerifyPatientOTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerifyPatientOTPFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSendOTP;
    private javax.swing.JButton btnVerify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtOTP;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
    private boolean isValidOTP() {
        boolean result=false;
        try{
            int otp=Integer.parseInt(txtOTP.getText().trim());
        
            if(otp==patient.getOtp())
                result=true;
        }catch(NumberFormatException ex){
//            JOptionPane.showMessageDialog(null,"");

        }finally{
            return result;
        }
        
    }
}
