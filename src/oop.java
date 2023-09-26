/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rautr
 */
public class oop {
    
    
    public static void main (String [] args){
        Student student = new Student ();
        
        student.name = "Joash S. Rautraut";
        student.section = student.setSection();
        student.motto = student.getmotto();
        
        System.out.println(student.name);
        System.out.println(student.section);
        System.out.println(student.motto);
                
    }
}
