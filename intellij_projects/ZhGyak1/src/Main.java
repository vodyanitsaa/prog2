import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<String> lines = FileUtils.readLines("students.txt");
        List<Student> students = new ArrayList<>();

        for(String line : lines){
            String[] parts = line.split(";" );
            Student nextStudent = new Student(parts[0], parts[1]);
            List<String> newGrades = new ArrayList<>(List.of(parts[2].split(",")));

            for(String actualGrade : newGrades){
                nextStudent.addGrade(Integer.parseInt(actualGrade));
            }

            students.add(nextStudent);
        }
        double bestAvg = students.getFirst().getAverage();
        Student bestStudent = students.getFirst();
        for (Student student : students) {
            if (student.getAverage() > bestAvg) {
                bestAvg = student.getAverage();
                bestStudent = student;
            }
        }
        System.out.printf("A legjobb: %s%n", bestStudent.toString());

    }


}