package ptcmanagement_system;

import java.util.Scanner;



public class Ptc_management_system extends Student{
    public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner in = new Scanner(System.in);
    if (in.nextInt != 1){
        Display();
    } else {
        Register();
        }
      
            
    }
    private Object[] students;
    public static void Register() {
     System.out.print("Enter number of new enrollments: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
    
        for (int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
        }
    }
    
    public static void Display(){
        int numOfStudents = 0;
        for (int n = 0; n < numOfStudents; n++){
            System.out.print(students[n].toString());
        }
    }
       
    }
    

