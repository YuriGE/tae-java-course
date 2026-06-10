/* @author <Yuri Kirkitadze> */

package homework6;

public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double averageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public String getStatus() {
        double avg = averageGrade();
        if (avg >= 60) {
            return "Pass";
        } else
            return "Fail";
    }

}
