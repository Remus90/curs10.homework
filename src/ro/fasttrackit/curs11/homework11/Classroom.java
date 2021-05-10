package ro.fasttrackit.curs11.homework11;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> grades = new ArrayList<>();

    public Classroom(List<StudentGrade> grades) {
        if (grades != null) {
            this.grades.addAll(grades);
        }
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade max = null;
        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                if (max == null || studentGrade.getGrade() > max.getGrade()) {
                    max = studentGrade;
                }
            }
        }
        return max;
    }

    public StudentGrade getMaxGrade2Iter(String discipline) {
        int maxGrade = finalMaxGrade(discipline);
        return firstStudentWithGrade(maxGrade, discipline);

    }

    private StudentGrade firstStudentWithGrade(int searchGrade, String discipline) {
        for (StudentGrade grade : grades) {
            if (grade.getGrade() == searchGrade && grade.getDiscipline().equals(discipline)) {
                return grade;
            }
        }
        return null;
    }

    private int finalMaxGrade(String discipline) {
        int max = 0;
        for (int i = 0; i < grades.size(); i++) {
            StudentGrade studentGrade = grades.get(i);
            if (max < studentGrade.getGrade()
                    && studentGrade.getDiscipline().equals(discipline)) {
                max = studentGrade.getGrade();
            }
        }
        return max;
    }

}
