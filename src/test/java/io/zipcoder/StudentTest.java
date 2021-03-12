package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
    public void testConstructorWithNamesAndScores() {
        String expectedFirstName = "Lena";
        String expectedLastName = "Litouka";
        Double[] expectedArr = {130.0, 95.0, 250.0, 83.0};
        String expectedArrayString = Arrays.toString(expectedArr);
        Student studentZero = new Student(expectedFirstName, expectedLastName, expectedArr);

        String actualFirstName = studentZero.getFirstName();
        String actualLastName = studentZero.getLastName();
        ArrayList<Double> actualExamScoresArr = new ArrayList<Double>();

        String actualArrayString = studentZero.getExamScores();


        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedArrayString, actualArrayString);
    }

    @Test
    public void testNegativeConstructorWithNamesAndScores() {
        String expectedFirstName = "Marie";
        String expectedLastName = "Curie";
        Double[] expectedArr = {250.0, 195.0, 80.0, 83.0};
        String expectedArrayString = Arrays.toString(expectedArr);
        Student studentZero = new Student(expectedFirstName, expectedLastName, expectedArr);

        String actualFirstName = studentZero.getFirstName();
        String actualLastName = studentZero.getLastName();
        ArrayList<Double> actualExamScoresArr = new ArrayList<Double>();

        String actualArrayString = studentZero.getExamScores();


        Assert.assertNotEquals("Sps", actualFirstName);
        Assert.assertNotEquals("Bgdha", actualLastName);
        Assert.assertNotEquals(" ", actualArrayString);
    }

    @Test
    public void testSetFirstName() {
        String firstName = "Steve";
        String lastName = "Jobs";
        Double[] newArr = {190.0, 180.0, 200.0, 183.0};

        Student studentZero = new Student(firstName, lastName, newArr);

        studentZero.setFirstName("Mike");
        String expectedFirstName = "Mike";
        String actualFirstName = studentZero.getFirstName();

        Assert.assertEquals(expectedFirstName, actualFirstName);

    }

    @Test
    public void testNegativeSetFirstName() {
        String firstName = "Steve";
        String lastName = "Jobs";
        Double[] newArr = {190.0, 180.0, 200.0, 183.0};

        Student studentZero = new Student(firstName, lastName, newArr);

        studentZero.setFirstName("Mike");
        String expectedFirstName = "Mike";
        String actualFirstName = studentZero.getFirstName();

        Assert.assertNotEquals("hgjag", actualFirstName);
    }

    @Test
    public void testSetLastName() {
        String firstName = "Joe";
        String lastName = "Jobs";
        Double[] newArr = {190.0, 180.0, 200.0, 183.0};

        Student studentZero = new Student(firstName, lastName, newArr);

        studentZero.setLastName("Biden");
        String expectedLastName = "Biden";
        String actualLastName = studentZero.getLastName();

        Assert.assertEquals(expectedLastName, actualLastName);

    }

    @Test
    public void testNegativeSetLastName() {
        String firstName = "Joe";
        String lastName = "Jobs";
        Double[] newArr = {190.0, 180.0, 200.0, 183.0};

        Student studentZero = new Student(firstName, lastName, newArr);

        studentZero.setLastName("Biden");
        String expectedLastName = "Biden";
        String actualLastName = studentZero.getLastName();

        Assert.assertNotEquals("jdgrg", actualLastName);

    }

    @Test
    public void testGetFirstName() {
        String firstName = "Steve";
        String lastName = "Jobs";
        Double[] newArr = {190.0, 180.0, 200.0, 183.0};

        Student studentZero = new Student(firstName, lastName, newArr);
        studentZero.getFirstName();
        String expected = firstName;
        String actualFirstName = studentZero.getFirstName();

        Assert.assertEquals(expected, actualFirstName);
    }

    @Test
    public void testNegativeGetFirstName() {
        String firstName = "Steve";
        String lastName = "Jobs";
        Double[] newArr = {190.0, 180.0, 200.0, 183.0};

        Student studentZero = new Student(firstName, lastName, newArr);
        studentZero.getFirstName();
        String expected = firstName;
        String actualFirstName = studentZero.getFirstName();

        Assert.assertNotEquals("hdgjedgj", actualFirstName);
    }
    @Test
    public void testGetLastName() {
        String firstName = "Steve";
        String lastName = "Jobs";
        Double[] newArr = {190.0, 180.0, 200.0, 183.0};

        Student studentZero = new Student(firstName, lastName, newArr);
        studentZero.getLastName();
        String expected = lastName;
        String actualLastName = studentZero.getLastName();

        Assert.assertEquals(expected, actualLastName);
    }
    @Test
    public void testNegativeGetLastName() {
        String firstName = "Steve";
        String lastName = "Jobs";
        Double[] newArr = {190.0, 180.0, 200.0, 183.0};

        Student studentZero = new Student(firstName, lastName, newArr);
        studentZero.getLastName();
        String expected = lastName;
        String actualLastName = studentZero.getLastName();

        Assert.assertNotEquals("jhjgsjg", actualLastName);
    }
    @Test
    public void testGetExamScores() {
        String firstName = "Steve";
        String lastName = "Jobs";
        Double[] newArr = {190.0, 180.0, 200.0, 183.0};
        String actualNewArr=Arrays.toString(newArr);

        Student studentZero = new Student(firstName, lastName, newArr);
        String expectedArrayString=studentZero.getExamScores();


        Assert.assertEquals(expectedArrayString, actualNewArr);
    }
    @Test
    public void testNegativeGetExamScores() {
        String firstName = "Steve";
        String lastName = "Jobs";
        Double[] newArr = {190.0, 180.0, 200.0, 183.0};
        String actualNewArr=Arrays.toString(newArr);

        Student studentZero = new Student(firstName, lastName, newArr);
        String expectedArrayString=studentZero.getExamScores();


        Assert.assertNotEquals("hiihioi", actualNewArr);
    }
    @Test
    public void testSetExamScores() {
        String firstName = "Steve";
        String lastName = "Jobs";
        Double[] newArr = {190.0, 180.0, 200.0, 183.0};
        String newArrStr=Arrays.toString(newArr);


        int examNumber=3;
        double newScore=300;

        Student studentZero = new Student(firstName, lastName, newArr);
        studentZero.setExamScore(examNumber,newScore);
        String NewArr=studentZero.getExamScores();
        String expectedArrayString="[190.0, 180.0, 200.0, 300.0]";


        Assert.assertEquals(expectedArrayString, NewArr);
    }
    @Test
    public void testNegativeSetExamScores() {
        String firstName = "Steve";
        String lastName = "Jobs";
        Double[] newArr = {190.0, 180.0, 200.0, 183.0};
        String newArrStr=Arrays.toString(newArr);


        int examNumber=3;
        double newScore=300;

        Student studentZero = new Student(firstName, lastName, newArr);
        studentZero.setExamScore(examNumber,newScore);
        String NewArr=studentZero.getExamScores();
        String expectedArrayString="[190.0, 180.0, 200.0, 300.0]";


        Assert.assertNotEquals("jhffh", expectedArrayString);}
        @Test
    public void testGetNumberOfExamsTaken(){
            String firstName = "Steve";
            String lastName = "Jobs";
            Double[] newArr = {190.0, 180.0, 200.0, 183.0};
            String newArrStr=Arrays.toString(newArr);
            int expected= newArr.length;

            Student studentZero = new Student(firstName, lastName, newArr);
            int actual=studentZero.getNumberOfExamsTaken();

            Assert.assertEquals(expected,actual);
        }
        @Test
    public void testNegativeGetNumberofExamsTaken(){
            String firstName = "Steve";
            String lastName = "Jobs";
            Double[] newArr = {190.0, 180.0, 200.0, 183.0};
            String newArrStr=Arrays.toString(newArr);
            int expected= newArr.length;

            Student studentZero = new Student(firstName, lastName, newArr);
            int actual=studentZero.getNumberOfExamsTaken();

            Assert.assertNotEquals(8,actual);
        }

        @Test
        public void testAddExamScore() {
            String firstName = "Steve";
            String lastName = "Jobs";
            Double[] newArr = {190.0, 180.0, 200.0, 183.0};
            String newArrStr = Arrays.toString(newArr);
            double examScore=250.0;
            Student studentZero = new Student(firstName, lastName, newArr);
            studentZero.addExamScore(examScore);
            String actual=studentZero.getExamScores();
            String expected="[190.0, 180.0, 200.0, 183.0, 250.0]";
            Assert.assertEquals(expected,actual);

        }
        @Test
        public void testNegativeAddExamScore() {
            String firstName = "Steve";
            String lastName = "Jobs";
            Double[] newArr = {190.0, 180.0, 200.0, 183.0};
            String newArrStr = Arrays.toString(newArr);
            double examScore=250.0;
            Student studentZero = new Student(firstName, lastName, newArr);
            studentZero.addExamScore(examScore);
            String actual=studentZero.getExamScores();
            String expected="[190.0, 180.0, 200.0, 183.0, 250.0]";
            Assert.assertNotEquals("hghgh",actual);
        }
        @Test
    public void testGetAverageExamScore(){
            String firstName = "Steve";
            String lastName = "Jobs";
            Double[] newArr = {190.0, 180.0, 200.0, 183.0};
            String newArrStr = Arrays.toString(newArr);
            Student studentZero=new Student(firstName,lastName,newArr);
            double actual=studentZero.getAverageExamScore();
            double expected=188.25;
            Assert.assertEquals(expected,actual,0.0001);
        }
    @Test
    public void testNegativeGetAverageExamScore(){
        String firstName = "Steve";
        String lastName = "Jobs";
        Double[] newArr = {190.0, 180.0, 200.0, 183.0};
        String newArrStr = Arrays.toString(newArr);
        Student studentZero=new Student(firstName,lastName,newArr);
        double actual=studentZero.getAverageExamScore();
        double expected=188.25;
        Assert.assertNotEquals(120,actual,0.0001);
    }

}