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
import java.sql.Statement;
import java.util.ArrayList;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.ExamPojo;

/**
 *
 * @author JAIN
 */
public class ExamDao {
    public static String getExamId() throws SQLException {
        String qry="Select count(*) as totalrows from Exam";
        int rowCount=0;
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();//kyunki where clause nhi h isliye preparestatement use nhi kiya hai
        ResultSet rs=st.executeQuery(qry);
           if(rs.next())
               rowCount=rs.getInt(1);
        String newId="EX-"+(rowCount+1);
        return newId;

        }
    public static boolean addExam(ExamPojo newExam)throws SQLException{
        String qry="Insert into exam values(?,?,?)";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,newExam.getExamId());
        ps.setString(2,newExam.getLanguage());
        ps.setInt(3,newExam.getTotalQuestions());
        int ans=ps.executeUpdate();
        return ans==1;
        
        
    }
     public static boolean isPaperSet(String subject)throws SQLException{
        String qry="select examid from Exam where language=?";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,subject);
        ResultSet rs=ps.executeQuery();
        return(rs.next());
        
     }
     public static ArrayList<String> getExamIdBySubject(String userid,String subject)throws SQLException{
        String qry="Select examid from Exam where language=? minus Select examid from performance where userid=?";
        ArrayList<String> examList=new ArrayList<>();
        
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,subject);
        ps.setString(2,userid);
        ResultSet rs=ps.executeQuery();
        
        while (rs.next()) {
            examList.add(rs.getString(1));
            
        }
        return examList;
        
        
    }
     public static int getQuestionCountByExam(String examid) throws SQLException {
         String qry="select totalquestion from Exam where examid=?";
         Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,examid);
        ResultSet rs=ps.executeQuery();
        rs.next();
        int rowCount=rs.getInt(1);
        return rowCount;
         
     }
    
    
        
     
    
}
