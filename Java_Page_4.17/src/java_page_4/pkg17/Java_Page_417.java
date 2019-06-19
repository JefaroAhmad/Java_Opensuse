/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_page_4.pkg17;

/**
 *
 * @author opensuse
 */
//public class Java_Page_417 {

    /**
     * @param args the command line arguments
     */
    // Scholarship programs
    class student
    {
        boolean allpass;
        int totalmarks;
        
        student()
        {
            allpass = true;
            totalmarks = 180;
        }
        
        void print_student()
        {
            if ((allpass != false) && (totalmarks >175))
                System.out.println("Scholarship granted");
            else 
                System.out.println("Scholarship not granted");
        }
//    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        student student = new student();
        System.out.println("Scholarship status of David: ");
        student.print_student();   
    }
}
