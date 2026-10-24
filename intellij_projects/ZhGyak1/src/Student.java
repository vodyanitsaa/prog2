import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String neptuneCode;
    private final String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(String neptuneCode, String name){
        this.neptuneCode = neptuneCode;
        this.name = name;

        if(neptuneCode.length() != 6) {
            System.out.println("Érvénytelen Neptun kód");
        }
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getAverage(){
        double average = 0.0;
        double sum = 0.0;
        int indicator = 0;
        for(int actual : grades){
            sum += (double) actual;
            ++indicator;
        }
        average = sum / indicator;
        return average;
    }

    @Override
    public String toString(){
        return String.format("%s - %s (Átlag: %.2f)", this.neptuneCode, this.name, getAverage());
    }

}
