package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    //Default Nullery Constructor
    public Student(){
        firstName="";
        lastName="";
        examScores= new ArrayList<Double>(3);
        examScores.add(100.0);
        examScores.add(90.0);
        examScores.add(130.0);
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getExamScores(){
        String tempString="";
        tempString+=examScores.toString();
        System.out.println(tempString);
        return tempString;
    }

}
