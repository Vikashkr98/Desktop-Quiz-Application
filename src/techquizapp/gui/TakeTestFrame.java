package techquizapp.gui;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import techquizapp.dao.PerformanceDao;
import techquizapp.dao.QuestionDao;
import techquizapp.pojo.AnswerPojo;
import techquizapp.pojo.AnswerStore;
import techquizapp.pojo.ExamPojo;
import techquizapp.pojo.PerformancePojo;
import techquizapp.pojo.QuestionPojo;
import techquizapp.pojo.QuestionStore;
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
public class TakeTestFrame extends javax.swing.JFrame {
    private ExamPojo exam;
    private QuestionStore qstore;
    private AnswerStore astore;
    private int qno,pos=0;
    private Object buttongroup1;
    
    

    /**
     * Creates new form TakeTestFrame
     */
    public TakeTestFrame() {
        initComponents();
         this.setLocationRelativeTo(null);
        lblUsername.setText("HELLO"+userProfile.getUsername());
        qstore=new QuestionStore();
        astore=new AnswerStore();
        qno=1;
        lblQno.setText(lblQno.getText()+qno);
    }
    public TakeTestFrame(ExamPojo exam) {
        this();
        this.exam=exam;
        lblTitle.setText(exam.getLanguage().toUpperCase()+" PAPER");
        loadQuestions();
        showQuestion();
                
    }
                  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        jrOption1 = new javax.swing.JRadioButton();
        jrOption2 = new javax.swing.JRadioButton();
        jrOption3 = new javax.swing.JRadioButton();
        jrOption4 = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 0));
        lblTitle.setText("JAVA PAPER");

        jLabel2.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GOOD");

        jLabel3.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LUCK");

        lblQno.setText("Question No 1");

        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        buttonGroup1.add(jrOption1);
        jrOption1.setForeground(new java.awt.Color(255, 255, 255));
        jrOption1.setText("Interface");
        jrOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrOption1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrOption2);
        jrOption2.setForeground(new java.awt.Color(255, 255, 255));
        jrOption2.setText("String");

        buttonGroup1.add(jrOption3);
        jrOption3.setForeground(new java.awt.Color(255, 255, 255));
        jrOption3.setText("Signed");

        buttonGroup1.add(jrOption4);
        jrOption4.setForeground(new java.awt.Color(255, 255, 255));
        jrOption4.setText("Double");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        lblUsername.setForeground(new java.awt.Color(255, 51, 0));
        lblUsername.setText("jLabel5");

        lblLogout.setForeground(new java.awt.Color(255, 51, 0));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techquizapp/gui/questionpaper.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrOption1)
                            .addComponent(jrOption3))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrOption2)
                            .addComponent(jrOption4))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(302, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(149, 149, 149))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblUsername)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)))
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btnPrevious)
                .addGap(66, 66, 66)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(lblLogout))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption1)
                    .addComponent(jrOption2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption4)
                    .addComponent(jrOption3))
                .addGap(18, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(btnCancel)
                    .addComponent(btnDone))
                .addGap(24, 24, 24))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrOption1ActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null) {
            QuestionPojo question=qstore.getQuestion(pos);
            String correctAnswer=question.getCorrectAnswer();
            AnswerPojo newanswer=new AnswerPojo(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            AnswerPojo answer=astore.getAnswerByQno(qno);
            if(answer==null)
                    astore.addAnswer(newanswer);
            else {
                if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false) {
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(pos,newanswer);
            }
            }
        }
        pos--;
        if(pos<0)
        {
            pos=qstore.getCount()-1;
        }
        qno--;
        if(qno<=0)
            qno=qstore.getCount();
        lblQno.setText("Question no:"+qno);
        showQuestion();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null) {
            QuestionPojo question=qstore.getQuestion(pos);
            String correctAnswer=question.getCorrectAnswer();
            AnswerPojo newanswer=new AnswerPojo(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            AnswerPojo answer=astore.getAnswerByQno(qno);
            if(answer==null)
                    astore.addAnswer(newanswer);
            else {
                if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false) {
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(pos,newanswer);
            }
            }
        }
        pos++;
        if(pos>=qstore.getCount())
        {
            pos=0;
        }
        qno++;
        if(qno>qstore.getCount())
            qno=1;
        lblQno.setText("Question no:"+qno);
        showQuestion();
        
         
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null) {
            QuestionPojo question=qstore.getQuestion(pos);
            String correctAnswer=question.getCorrectAnswer();
            AnswerPojo newanswer=new AnswerPojo(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            AnswerPojo answer=astore.getAnswerByQno(qno);
            if(answer==null)
                    astore.addAnswer(newanswer);
            else {
                if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false) {
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(pos,newanswer);
            }
            }
        }
        
        int right=0,wrong=0;
        for(QuestionPojo question:qstore.getAllQuestions()) {
            int qno=question.getQno();
            AnswerPojo answer=astore.getAnswerByQno(qno);
            if(answer==null) 
                continue;
            else
            {
                String chosenAnswer1=answer.getChosenAnswer();
                String correctAnswer=answer.getCorrectAnswer();
                if(chosenAnswer1.equals(correctAnswer))
                    ++right;
                else
                    ++wrong;
            }
        }
        String reportCard="Total Questions:"+qstore.getCount();
        reportCard+="\nRight Answers:"+right;
        reportCard+="\nWrong Answers:"+wrong;
        reportCard+="\nUnattempted:"+(qstore.getCount()-(right+wrong));
        JOptionPane.showMessageDialog(null,reportCard,"your result!",JOptionPane.INFORMATION_MESSAGE);
        try {
            PerformancePojo performance=new PerformancePojo(exam.getExamId(),exam.getLanguage(),userProfile.getUsername(),right,wrong,(qstore.getCount()-(right+wrong)),(double)right/qstore.getCount()*100);
            PerformanceDao.addPerformance(performance);
            JOptionPane.showMessageDialog(null,"your performance has been successfully added to the db","performance added",JOptionPane.INFORMATION_MESSAGE);
            ChoosePaperFrame paperFrame=new ChoosePaperFrame();
            paperFrame.setVisible(true);
            this.dispose();
          }
        catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE); 
           ex.printStackTrace();
       }
        
        
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
       ChoosePaperFrame paperFrame=new ChoosePaperFrame();
       paperFrame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
         this.dispose();
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.WHITE);
        Font f=new Font("tahoma",Font.ITALIC,12);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(new Color(255,153,0));
        Font f=new Font("Tahoma",Font.BOLD,12);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

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
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrOption1;
    private javax.swing.JRadioButton jrOption2;
    private javax.swing.JRadioButton jrOption3;
    private javax.swing.JRadioButton jrOption4;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
  
public void loadQuestions() {
        try{
                ArrayList<QuestionPojo> questionList=QuestionDao.getQuestionsByExamId(exam.getExamId());
                for(QuestionPojo obj:questionList){
                    qstore.addQuestion(obj);
                }
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
    }

public void showQuestion() {
    QuestionPojo question=qstore.getQuestion(pos);
    buttonGroup1.clearSelection();
    txtQuestion.setText(question.getQuestion());
    jrOption1.setText(question.getAnswer1());
    jrOption2.setText(question.getAnswer2());
    jrOption3.setText(question.getAnswer3());
    jrOption4.setText(question.getAnswer4());
    AnswerPojo answer=astore.getAnswerByQno(qno);
    if(answer==null) 
        return;
    String chosenAnswer=answer.getChosenAnswer();
    switch(chosenAnswer){
        case"Answer1":
            jrOption1.setSelected(true);
            break;
        case"Answer2":
            jrOption2.setSelected(true);
            break;
        case"Answer3":
            jrOption3.setSelected(true);
            break;
        case"Answer4":
            jrOption4.setSelected(true);
            break;

    }
    
}
public String getUserAnswer() {
    
    if(jrOption1.isSelected()) 
        return "Answer1";
    else if(jrOption2.isSelected()) 
        return "Answer2";
    else if(jrOption3.isSelected()) 
        return "Answer3";
    else if(jrOption4.isSelected()) 
        return "Answer4";
    else
        return null;
}
}
