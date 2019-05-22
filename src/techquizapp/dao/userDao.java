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
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.userPojo;
//import techquizapp.dbutil.DBConnection;

/**
 *
 * @author JAIN
 */
public class userDao {
    public static boolean validateUser(userPojo user)throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps =conn.prepareStatement("Select * from users where USER_ID=? and PASSWORD=? and USERTYPE=?");//kyunki where clause hai isliye prepare statement use krte hai
        ps.setString(1,user.getUser_Id());
  
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getUsertype());
        ResultSet rs=ps.executeQuery();
        return rs.next();
        
    }
        public static boolean addUser(userPojo user)throws SQLException {
        boolean status=true;
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps =conn.prepareStatement("Select * from users where USER_ID=?");//kyunki where clause hai isliye prepare statement use krte hai
        ps.setString(1,user.getUser_Id());
        ResultSet rs=ps.executeQuery();
        //result set me row h ya nhi//ifrs.next=false mtlb records set nhi h therefore we will go to else,,,,if rs.next =true then give as it is
        if(rs.next()) 
            status=false;
        
        else {
            String qry="Insert into users values(?,?,?)";
            ps=conn.prepareStatement(qry);
            ps.setString(1,user.getUser_Id());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getUsertype());
            ps.executeUpdate();
        }
        return status;
            
        }
        public static boolean changePassword(String userid,String password)throws SQLException{
        String qry="Update users set password=? where userid=?";
        boolean status=true;
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,password);
        ps.setString(2,userid);
        int ans=ps.executeUpdate();
        if(ans==0)
               status=false;
     return status;
     } 

        
    
}

