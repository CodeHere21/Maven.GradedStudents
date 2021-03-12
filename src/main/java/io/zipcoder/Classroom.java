package io.zipcoder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Classroom {
    Student [] students;
    int maxNumberofStudents=0;

    //constructor with argument int
    public Classroom(int maxNumberofStudents){
        this.maxNumberofStudents=maxNumberofStudents;
    }
    //constructor with Student[]
    public Classroom(Student[] arrayOfStudents){
      this.students=arrayOfStudents;
        }

    //constructor nullary
    public Classroom(){
      Student[] students=new Student[30];
    }


    public Double getAverageExamScoreInClassroom(Student[] student){
        double sum=0;
        for(Student s: student){
                sum+=s.getAverageExamScore();
            }
        double n=student.length;
        double value=sum/n;
        return value;
        }
    public Student[] getStudents(){
        return students;
    }

    public void addStudent(Student[] studentArr, Student studentToAdd){
        int i=studentArr.length;
        studentArr[i]=studentToAdd;
    }
//    public void removeStudent(String firstName, String lastName){
//            Student studentZero=new Student(firstName,lastName,null);
//            students.remove(studentZero);
//    }
//    public Student[] getStudentsByScore(){
//
//    }
//    public String getGradeBook(){
//
//    }
}
