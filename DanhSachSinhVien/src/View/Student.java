/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author Conroy
 */
public class Student implements Serializable{

    public String Student_ID;
    public String Name;
    public String Class_Room;
    public String Major;
    public double Mark;
    public boolean Gender;

    public Student(String Student_ID, String Name, String Class_Room, String Major, double Mark,boolean Gender) {
        this.Student_ID = Student_ID;
        this.Name = Name;
        this.Class_Room = Class_Room;
        this.Major = Major;
        this.Mark = Mark;
        this.Gender=Gender;
    }

    public boolean isGender() {
        
       
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public Student() {
    }

    public String getStudent_ID() {

        return Student_ID;
    }

    public void setStudent_ID(String Student_ID) {

        this.Student_ID = Student_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getClass_Room() {
        return Class_Room;
    }

    public void setClass_Room(String Class_Room) {
        this.Class_Room = Class_Room;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public double getMark() {
      
        return Mark;
    }

    public void setMark(double Mark) {
        this.Mark = Mark;
    }

}
