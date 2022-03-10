/*CHRISTIAN OSUJI
MATRIC NUMBER : T1002021006
LVL : 200
 */



package com.codewithchris;

public class Main {

    public static void main(String[] args) {
        double[] myGrades = new double[5];
        myGrades[0] = 3.4;
        myGrades[1] = 4.0;
        myGrades[2] = 4.0;
        myGrades[3] = 3.4;
        myGrades[4] = 4.0;

        double sum = add(myGrades);
        double avg = sum/myGrades.length;
        print("your average is "+avg);
    }

    public  static double add(double[] grades) {
        double addition = 0;
        for(int i =0; i<grades.length;i++){
            addition += grades[i];
        }
        return addition;
    }
    public  static  void print(String text){
        System.out.println(text);
    }
    }







