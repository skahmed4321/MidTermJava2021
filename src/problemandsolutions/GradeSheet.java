package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.

    public static void main(String[] args) {

        Scanner aa= new Scanner(System.in);
        double score1;
        double score2;
        double score3;
        System.out.println("Please Enter your First Score : ");
        score1= aa.nextDouble();

        System.out.println("Please Enter your Second Score : ");
        score2= aa.nextDouble();

        System.out.println("Please Enter your Third Score : ");
        score3= aa.nextDouble();

        double average =(score1+score2+score3)/3;

        if(average >=90){
            System.out.println("Your grade is A");
        }
        else if( average >=70 && average <90){
            System.out.println("Your score is B");
        }
        else if(average >=50 && average <70){
            System.out.println("Your score is C");
        }
        else{
            System.out.println("your score is F");
        }


    }


}
