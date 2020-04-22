/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author samsung
 */
public class User {
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    
    public User(){}
    
    public User(String email, String password, String phoneNumber,String address){
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setEmail(String email){
              this.email = email;
    }
    
    public void setPassword(String password){
              this.password = password;
    }
    
    public void setPhoneNumber(String phoneNumber){
              this.phoneNumber = phoneNumber;
    }
    
    public void setAddress(String address){
              this.address = address;
    }
    
    public String toString(){
        return "Email : " +this.email
                +" ; Password : " +this.password
                +" ; Phone number : " +this.phoneNumber
                +" ; Address : " +this.address;
    }
}
