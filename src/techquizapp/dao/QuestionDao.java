/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.QuestionPojo;
import techquizapp.pojo.QuestionStore;

/**
 *
 * @author JAIN
 */
public class QuestionDao {
    public static boolean addQuestion(QuestionStore qstore)throws SQLException{
        String qry="Insert into questions values(?,?,?,?,?,?,?,?,?)";
        ArrayList <QuestionPojo> questionList=qstore.getAllQuestions();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps =conn.prepareStatement(qry);
        for(QuestionPojo obj:questionList) {
            ps.setString(1,obj.getExamId());
            ps.setInt(2,obj.getQno());
            ps.setString(3,obj.getQuestion());
            ps.setString(4,obj.getAnswer1());
            ps.setString(5,obj.getAnswer2());
            ps.setString(6,obj.getAnswer3());
            ps.setString(7,obj.getAnswer4());
            ps.setString(8,obj.getCorrectAnswer());
            ps.setString(9,obj.getLanguage());
            ps.executeUpdate();
            
        }
        return false;
    }
    public static ArrayList<QuestionPojo> getQuestionsByExamId(String examId)throws SQLException{
        String qry="Select * from questions where examid=? order by qno";
        ArrayList <QuestionPojo> questionList=new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps =conn.prepareStatement(qry);
            ps.setString(1,examId);
            ResultSet rs=ps.executeQuery();
            System.out.println("Exam id in Dao is"+examId);
            while(rs.next()) {
                int qno=rs.getInt(2);
                String question=rs.getString(3);
                String option1=rs.getString(4);
                String option2=rs.getString(5);
                String option3=rs.getString(6);
                String option4=rs.getString(7);
                String correctAnswer=rs.getString(8);
                String language=rs.getString(9);
                QuestionPojo obj=new QuestionPojo(examId,qno,question,option1,option2,option3,option4,correctAnswer,language);
                questionList.add(obj);
            }
            return questionList;
            }
    public static void updateQuestion(QuestionStore qStore)throws SQLException
    {
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("update Questions set question=?,answer1=?,answer2=?,answer3=?,answer4=?,correct_answer=?,language=? where examid=? AND qno=?");
        ArrayList<QuestionPojo> questionList=qStore.getAllQuestions();
        for(QuestionPojo obj:questionList)
        {
        ps.setString(1,obj.getQuestion());
        ps.setString(2,obj.getAnswer1());
        ps.setString(3,obj.getAnswer2());
        ps.setString(4,obj.getAnswer3());
        ps.setString(5,obj.getAnswer4());
        ps.setString(6,obj.getCorrectAnswer());
        ps.setString(7,obj.getLanguage());
        ps.setString(8,obj.getExamId());
        ps.setInt(9,obj.getQno());
        ps.executeUpdate();
        }
    }
}