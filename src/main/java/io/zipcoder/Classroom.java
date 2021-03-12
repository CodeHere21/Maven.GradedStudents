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
        Student[] newArrToAdd=new Student[studentArr.length+1];
                System.arraycopy(studentArr,0,newArrToAdd,0,studentArr.length);
        newArrToAdd[studentArr.length]=studentToAdd;
        System.out.println(newArrToAdd);
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
