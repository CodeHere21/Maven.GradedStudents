package io.zipcoder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {
        @Test
        public void testGetStudents() {
                //Given
                ArrayList<Student> students = new ArrayList<Student>();
                Double[] studentOneScores = {130.0, 95.0, 250.0, 129.0};
                Student studentOne = new Student("Kelly", "Porter", studentOneScores);

                Double[] studentTwoScores = {140.0, 75.0, 250.0, 143.0};
                Student studentTwo = new Student("Monali", "Khandelwal", studentTwoScores);

                Double[] studentThreeScores = {170.0, 69.0, 150.0, 243.0};
                Student studentThree = new Student("Ashley", "Smart", studentThreeScores);
                students.add(studentOne);
                students.add(studentTwo);
                students.add(studentThree);


                //When
                Classroom classroomZero = new Classroom();
                //Then
                Assert.assertTrue(classroomZero instanceof Classroom);
        }
        @Test
        public void testGetAverageExamScoreInClassrom() {
                //Given
                ArrayList<Student> students = new ArrayList<Student>();
                Double[] studentOneScores = {130.0, 95.0, 250.0, 129.0};
                Student studentOne = new Student("Kelly", "Porter", studentOneScores);

                Double[] studentTwoScores = {140.0, 75.0, 250.0, 143.0};
                Student studentTwo = new Student("Monali", "Khandelwal", studentTwoScores);

                Double[] studentThreeScores = {170.0, 69.0, 150.0, 243.0};
                Student studentThree = new Student("Ashley", "Smart", studentThreeScores);

                Student[] arrayOfStudents = {studentOne,studentTwo,studentThree};
                System.out.println(arrayOfStudents);
                Classroom classroomZero = new Classroom(arrayOfStudents);
                Double actual = classroomZero.getAverageExamScoreInClassroom(arrayOfStudents);
                System.out.println(studentOne.getAverageExamScore());
                Double expected = ((studentOne.getAverageExamScore()+studentTwo.getAverageExamScore()+studentThree.getAverageExamScore()))/3;

                Assert.assertEquals(expected, actual);

        }
        @Test
        public void testAddStudent() {
                //Given
                ArrayList<Student> students = new ArrayList<Student>();
                Double[] studentOneScores = {130.0, 95.0, 250.0, 129.0};
                Student studentOne = new Student("Kelly", "Porter", studentOneScores);

                Double[] studentTwoScores = {140.0, 75.0, 250.0, 143.0};
                Student studentTwo = new Student("Monali", "Khandelwal", studentTwoScores);

                Double[] studentThreeScores = {170.0, 69.0, 150.0, 243.0};
                Student studentThree = new Student("Ashley", "Smart", studentThreeScores);

                Student[] arrayOfStudents = {studentOne,studentTwo,studentThree};

                Double[] studentFourScores={120.0, 270.0, 76.8, 128.3};
                Student studentFour= new Student("Lena","Litouka",studentFourScores);

                Student[] expected= {studentOne, studentTwo, studentThree, studentFour};

                Classroom classroomZero = new Classroom(expected);
              //  Double actual = classroomZero.getAverageExamScoreInClassroom(arrayOfStudents);
                //System.out.println(studentOne.getAverageExamScore());
                //Double expected = ((studentOne.getAverageExamScore()+studentTwo.getAverageExamScore()+studentThree.getAverageExamScore()))/3;

                classroomZero.addStudent(arrayOfStudents, studentFour);
                Student[] actual=classroomZero.getStudents();

               Assert.assertEquals(expected, actual);


        }

}