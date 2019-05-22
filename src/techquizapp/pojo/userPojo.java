/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.pojo;

/**
 *
 * @author JAIN
 */

public class userPojo {
    public userPojo() {
        
    }

    public void setUser_Id(String user_Id) {
        this.user_Id = user_Id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getUser_Id() {
        return user_Id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsertype() {
        return usertype;
    }

    public userPojo(String user_Id, String password, String usertype) {
        this.user_Id = user_Id;
        this.password = password;
        this.usertype = usertype;
    }
    private String user_Id;
    private String password;
    private String usertype;
    
}
