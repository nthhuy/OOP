/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import week1.Student;

/**
 *
 * @author ASUS
 */
public class StudentManagement {
    Student[] students  = new Student[100];
    int i=0;
    
    public static boolean sameGroup(Student s1, Student s2){
        if(s1.getGroup().equals(s2.getGroup()))
           return true;
        else return false;
    }  
   
    public void addStudent(Student newStudent) {
         students[i++] = newStudent;
     }
    
    public String studentsByGroup(){
        int l = 0;
        boolean kt;
        Student[] listGroup = new Student[100]; 
        for(int j=0; j<i;j++) {
            kt = true;
            for(int k=0; k<l;k++){
                if(sameGroup(students[j],listGroup[k]) == true) { kt = false; }
            }
            if (kt == true) listGroup[l++] = students[j];
                
        }
        //
        String result=new String();   
        for(int j=0; j<l; j++){
            result += listGroup[j].getGroup();
            for(int k=0; k<i; k++){
                if(sameGroup(students[k],listGroup[j])==true)
                    result += "\n" +students[k].getInfo();                  
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Student a=new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
            a.setGroup("K62CC");
            System.out.println(a.getInfo());
    }
    
}
