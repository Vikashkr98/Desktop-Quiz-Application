package techquizapp.gui;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import techquizapp.dao.ExamDao;
import techquizapp.pojo.ExamPojo;
import techquizapp.pojo.userProfile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JAIN
 */
public class ChoosePaperFrame extends javax.swing.JFrame {
    private String subjectName; 

    /**
     * Creates new form PaperSelectionFrame
     */
    public ChoosePaperFrame() {
        initComponents();
         this.setLocationRelativeTo(null);
        lblUsername.setText("HELLO"+userProfile.getUsername());
    }
        private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        this.dispose();
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        
    }                                      

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
         lblLogout.setForeground(new Color(255,153,0));
        Font f=new Font("Tahoma",Font.BOLD,12);
        lblLogout.setFont(f);
    }                                     

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
         lblLogout.setForeground(Color.WHITE);
        Font f=new Font("tahoma",Font.ITALIC,12);
        lblLogout.setFont(f);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcSubject = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jcExamId = new javax.swing.JComboBox();
        btnEdit = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Paper Selection Panel");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fill Paper Details");

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Choose The Subject");

        jcSubject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "C", "C++", "JAVA" }));
        jcSubject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcSubjectItemStateChanged(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Choose The Exam Id");

        btnEdit.setText("Take The Test");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblUsername.setForeground(new java.awt.Color(255, 51, 51));
        lblUsername.setText("jLabel5");

        lblLogout.setForeground(new java.awt.Color(255, 51, 51));
        lblLogout.setText("Logout");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techquizapp/gui/examicon.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcExamId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(lblLogout))
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addComponent(jcSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jcExamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int count=jcSubject.getSelectedIndex();
        if(count==0) {
            JOptionPane.showMessageDialog(null,"please choose a subject","error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        count=jcExamId.getItemCount();
        if(count==0) {
            JOptionPane.showMessageDialog(null,"please select an exam","error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String subject=jcSubject.getSelectedItem().toString();
        String examid=jcExamId.getSelectedItem().toString();
        int ans;
        ans=JOptionPane.showConfirmDialog(null,"you have choosen \""+subject+"\"and \""+examid+"\"paper!\nIs this OK?","confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
            try {
                int totalQuest=ExamDao.getQuestionCountByExam(examid.trim());
                System.out.println("Examid:"+examid+"totalQuest");
                ExamPojo exam=new ExamPojo(examid,subject,totalQuest);
                TakeTestFrame testFrame=new TakeTestFrame(exam);
                testFrame.setVisible(true);
                this.dispose();
                
            }
            catch(SQLException ex)
        {
          JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();  
        }
            
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void jcSubjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcSubjectItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.DESELECTED)
            return;
        boolean result=validateInput();
        if(result==false) {
            JOptionPane.showMessageDialog(null,"please choose a subject","error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        jcExamId.removeAllItems();
        
        try {
            if(ExamDao.isPaperSet(subjectName)==false) {
                JOptionPane.showMessageDialog(null,"sorry no exam set for"+subjectName,"subject not found",JOptionPane.ERROR_MESSAGE);
                return;
            }
            ArrayList<String> examList=ExamDao.getExamIdBySubject(userProfile.getUsername(),subjectName);
            
            if(examList.isEmpty()) {
                 JOptionPane.showMessageDialog(null,"you have given all exam for "+subjectName,"subject not found",JOptionPane.ERROR_MESSAGE);
                 return;
            }
            for(String examid:examList){
            jcExamId.addItem(examid);
        }
            
        
    }//GEN-LAST:event_jcSubjectItemStateChanged
         catch(SQLException ex)
        {
          JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();  
        }
    }
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
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChoosePaperFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jcExamId;
    private javax.swing.JComboBox jcSubject;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
public boolean validateInput() {
    int selectedIndex=jcSubject.getSelectedIndex();
    if(selectedIndex==0)//empty wala yadi subject choose kiya h tb false return karega
        return false;
    subjectName=jcSubject.getSelectedItem().toString();
    return true;
}
}