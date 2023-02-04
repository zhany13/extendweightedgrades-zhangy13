public class Student {
    private double earnedscores[];
    /**
     * The student's grades for each assignment
      */
    private double percentages[];
    /**
     * Percentages for each assignment
     */
    private double totalscores[];
    /**
     * Total Score for each assignment
      */
    private double finalScore;
    /**
     * Calculated final score
      */
    private char grade;
    /**
     * Calculated final grade.
     */
    public double getFinalScore() {
        return finalScore;
    }
    public char getGrade() {
        return grade;
    }
    public Student(double[] totalscores,double[] earnedscores,double[] percentages) {
        /**
         * The constructor of the Student class
         */
        this.totalscores=totalscores;
        this.earnedscores=earnedscores;
        this.percentages=percentages;
    }

    public void ComputeGrade() {
        /**
         * Calculating student's final grade
         */
        this.finalScore=0.0;
        for(int i=0;i<this.earnedscores.length;i++) {
            this.finalScore+=this.earnedscores[i]/this.totalscores[i]*this.percentages[i];
        }
        if(this.finalScore>=90.0) {
            this.grade='A';
        }else if(this.finalScore>=80.0&&this.finalScore<90.0) {
            this.grade='B';
        }else if(this.finalScore>=70.0&&this.finalScore<80.0) {
            this.grade='C';
        }else if(this.finalScore>=60.0&&this.finalScore<70.0) {
            this.grade='D';
        }else {
            this.grade='F';
        }
    }

}
