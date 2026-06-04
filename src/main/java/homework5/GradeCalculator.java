/* @author <Yuri Kirkitadze> */

package homework5;

public class GradeCalculator {
    public static void main(String[] args) {
        int myScore =100;
        System.out.println("My grade is " + getGrade(myScore));
    }
    public static String getGrade (int score){
        if(score < 0 || score > 100) return "Invalid";
        else if (score >= 90)  return "A";
        else if (score >= 80)  return "B";
        else if (score >= 70)  return "C";
        else if (score >= 60)  return "D";
        else   return  "F";
    }
}
