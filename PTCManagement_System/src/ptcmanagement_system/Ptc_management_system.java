package ptcmanagement_system;

import java.util.Scanner;



public class Ptc_management_system {
    public static void main(String[] args) {  
        System.out.print("Enter number of new enrollments: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
    
        for (int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
        }
        
    
        for (int n = 0; n < numOfStudents; n++){
            System.out.println(students[n]);
    }
}
}
    

