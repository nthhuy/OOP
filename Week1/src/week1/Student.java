/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author ASUS
 */
public class Student {
    String name;
    String id;
    String group;
    String email;
    public Student(){
        this.name="Student";
        this.id="000";
        this.group="K62CB";
        this.email = "uet@vnu.edu.vn";
    }
     public Student(String name, String id, String email){
        this.name=name;
        this.id=id;
        this.group="K62CB";
        this.email=email;
    }
      public Student(Student s){
        this.name=s.getName();
        this.id=s.getID();
        this.group=s.getGroup();
        this.email=s.getEmail();
    }
     
    
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setID( String id) {
        this.id=id;
    }
    public String getID() {
        return id;
    }
    public void setGroup(String group) {
        this.group=group;
    }
    public String getGroup() {
        return group;
    }
     public void setEmail(String email) {
        this.email=email;
    }
    public String getEmail() {
        return email;
    }   
    
    public String getInfo() {
        
        return name + " - " + id + " - " + group + " - " + email;
    }
    
}
