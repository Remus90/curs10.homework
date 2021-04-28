package ro.fasttrackit.curs11.homework11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ObjectsFromFile {
    public static void main(String[] args) throws Exception {
        List<StudentGrade> grade = readObjectsFromFile();
        System.out.println(grade);
    }

    private static List<StudentGrade> readObjectsFromFile() throws Exception {
        List<StudentGrade> grade = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader("files/grade.txt"));
        String line;
        while ((line = fileReader.readLine()) != null) {
            grade.add(readGrades(line));
        }

        return grade;

    }
    private static StudentGrade readGrades(String gradeResult){
        String [] gradeData = gradeResult.split("\\|");
        String name = gradeData[0];
        String discipline = gradeData[1];
        int grade = Integer.parseInt(gradeData[2]);
        return new StudentGrade(name,discipline,grade);
    }


}
