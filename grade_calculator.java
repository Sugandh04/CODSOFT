import java.util.Scanner;

public class grade_calculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of subjects : ");
        int sub = sc.nextInt();
        int count=1;
        int marks=0;
        while ( count <= sub){
            System.out.println("Enter the marks of Subject " + count + " (out of 100) : ");
            int score= sc.nextInt();
            marks = marks + score;
            count ++;
        }
        int avg=(marks/sub);
        System.out.println("The average percentage for the marks obtained is : " + avg + "%");

        char grade;
        if (avg >= 90){
            System.out.println(" Grade: A");
            grade='A';
        }else if(avg>=80){
            System.out.println("Grade: B");
            grade='B';
        }else if(avg>=70){
            System.out.println("Grace: C");
            grade='C';
        }else if(avg >=60){
            System.out.println("Grade: D");
            grade='D';
        }else if(avg >=50){
            System.out.println("Grade: E");
            grade='E';
        }else{
            System.out.println("Grade: F");
            grade='F';
        }
        System.out.println("You have Scored " + marks + " Marks and you have scored Grade: " + grade + " with " +avg +"%" );
    }
}
