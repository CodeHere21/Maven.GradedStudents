package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student (String firstName,String lastName,Double[] testScores){
        this.firstName=firstName;
        this.lastName=lastName;
        Double[] testScoresRegArrType=testScores;
        ArrayList<Double>testScoresAsArrList=new ArrayList<Double>(Arrays.asList(testScoresRegArrType));
        examScores=testScoresAsArrList;
        System.out.println(examScores);
    }
    public void setFirstName(String name){
        this.firstName=name;
    }
    public void setLastName(String name){
        this.lastName=name;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber, newScore);
        System.out.println(examScores.set(examNumber,newScore));
    }
    public String getExamScores(){
        String tempString="";
        tempString+=examScores.toString();
        System.out.println(tempString);
        return tempString;
    }
    public int getNumberOfExamsTaken(){
        return examScores.size();
    }
    public void addExamScore(double examScore){
        examScores.add(examScore);
    }
    public int getAverageExamScore(){
        int sum=0;
        for(int i=0;i<examScores.size();i++){
            sum+=i;
        }
    return sum/examScores.size();
    }

}
