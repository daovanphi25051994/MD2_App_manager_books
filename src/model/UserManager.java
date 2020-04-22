/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author samsung
 */
public class UserManager {
   private static UserManager userManager;
   private static final ArrayList<User> listUser = new ArrayList<>();
   private UserManager(){}
   
   public static UserManager getUserManager(){
       if(userManager == null){
           userManager = new UserManager();
       }
       return userManager;
   }
   
   public boolean addUser(User user){
       if(user == null){
           return false;
       }
       listUser.add(user);
       return true;
   }
   
    public boolean removeUser(User user){
       if(user == null){
           return false;
       }
       for(User myUser : listUser){
           if(myUser.equals(user)){
               listUser.remove(user);
               return true;
           }
       }
     
       return false;
   }
    public ArrayList<User> getListUser(){
        return listUser;
    }
    
}