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
public class userProfile {

    public static void setUsername(String username) {
        userProfile.username = username;
    }

    public static void setUsertype(String usertype) {
        userProfile.usertype = usertype;
    }

    public static String getUsername() {
        return username;
    }

    public static String getUsertype() {
        return usertype;
    }
    private static String username;
    private static String usertype;
    
}
