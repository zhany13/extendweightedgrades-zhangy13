import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n=8;
        double totalscores[]=new double[n];

        double earnedScores[]=new double[n];
        double percentages[]=new double[n];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input the total score of each assignment:");
        /**
         * step1: input the total score of each assignment
          */

        for(int i=0;i<n;i++) {
            totalscores[i]=scanner.nextDouble();
        }
        System.out.println("Please input the earned score of each assignment:");
        /**
         * step2: input the earned score of each assignment
         */

        for(int i=0;i<n;i++) {
            earnedScores[i]=scanner.nextDouble();
        }
        System.out.println("Please input the percentage of each assignment:");
        /**
         * step3: input the percentage of each assignment
         */

        for(int i=0;i<n;i++) {
            percentages[i]=scanner.nextDouble();
        }
        Student stu=new Student(totalscores,earnedScores, percentages);
        /**
         * step4: calculating student's final grade
          */

        stu.ComputeGrade();
        /**
         * output
         */

        System.out.println(stu.getGrade());
    }

}
