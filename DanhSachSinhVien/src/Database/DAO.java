/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import View.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Conroy
 */
public class DAO {
    private  Connection conn;
     private String url="jdbc:mysql://localhost:3306/student";
    private String user="root";
    private String pass="Bestmatch@123";
    public DAO()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean addStudent(Student st)
    {
        String sql="INSERT INTO student(Student_ID,Name,Class_Room,Major,Mark,Gender) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, st.getStudent_ID());
            ps.setString(2, st.getName());
            ps.setString(3, st.getClass_Room());
            ps.setString(4, st.getMajor());
            ps.setDouble(5, st.getMark());
            ps.setBoolean(6, st.isGender());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<Student> getListStudent()
    {
        ArrayList<Student> list=new ArrayList<>();
        String sql="SELECT*FROM student";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Student st=new Student();
                st.setStudent_ID(rs.getString("Student ID"));
                st.setName(rs.getString("Name"));
                st.setClass_Room(rs.getString("Class Room"));
                st.setMajor(rs.getString("Major"));
                st.setMark(rs.getDouble("Mark"));
                st.setGender(rs.getBoolean("Gender"));
                list.add(st);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
        new DAO();
    }
}
