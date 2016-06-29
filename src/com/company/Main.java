package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> ids = new ArrayList<String>();
        ids.add("1");
        ids.add("2");
        ArrayList<String> names = new ArrayList<String>();
        names.add("Math");
        names.add("History");
        ArrayList<String> firstQuarterGrades = new ArrayList<String>();
        firstQuarterGrades.add("A");
        firstQuarterGrades.add("D");
        ArrayList<String> secondQuarterGrades = new ArrayList<String>();
        secondQuarterGrades.add("B");
        secondQuarterGrades.add("C");
        ArrayList<String> thirdQuarterGrades = new ArrayList<String>();
        thirdQuarterGrades.add("C");
        thirdQuarterGrades.add("B");
        ArrayList<String> fourthQuarterGrades = new ArrayList<String>();
        fourthQuarterGrades.add("D");
        fourthQuarterGrades.add("A");
        ArrayList<String> finalGrades = new ArrayList<String>();
        finalGrades.add("C+");
        finalGrades.add("B-");


        ReportCard reportCard = new ReportCard(ids,names,firstQuarterGrades,secondQuarterGrades,thirdQuarterGrades,fourthQuarterGrades,finalGrades);

        System.out.println(reportCard.toString());

    }
}
