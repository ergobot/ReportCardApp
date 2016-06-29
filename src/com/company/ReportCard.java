package com.company;

import java.util.ArrayList;

public class ReportCard {


    public ReportCard(){
        this.courses = new ArrayList<Course>();
    }

    public ReportCard(ArrayList<String> ids,
                      ArrayList<String> names,
                      ArrayList<String> firstQuarterGrades,
                      ArrayList<String> secondQuarterGrades,
                      ArrayList<String> thirdQuarterGrades,
                      ArrayList<String> fourthQuarterGrades,
                      ArrayList<String> finalGrades){
        courses = new ArrayList<Course>();
        for(int i = 0; i < ids.size(); i++){
            courses.add(new Course(ids.get(i),
                                    names.get(i),
                                    firstQuarterGrades.get(i),
                                    secondQuarterGrades.get(i),
                                    thirdQuarterGrades.get(i),
                                    fourthQuarterGrades.get(i),
                                    finalGrades.get(i)));

        }


    }

    public void addCourse(String id, String name, String firstQuarterGrade, String secondQuarterGrade, String thirdQuarterGrade, String fourthQuarterGrade, String finalGrade){
        this.courses.add(new Course(id,name,firstQuarterGrade,secondQuarterGrade,thirdQuarterGrade,fourthQuarterGrade,finalGrade));
    }

    ArrayList<Course> courses;

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }


    public class Course{


        public Course(){}

        public Course(String id, String name, String firstQuarterGrade, String secondQuarterGrade, String thirdQuarterGrade, String fourthQuarterGrade, String finalGrade) {
            this.id = id;
            this.name = name;
            this.firstQuarterGrade = firstQuarterGrade;
            this.secondQuarterGrade = secondQuarterGrade;
            this.thirdQuarterGrade = thirdQuarterGrade;
            this.fourthQuarterGrade = fourthQuarterGrade;
            this.finalGrade = finalGrade;
        }

        private String id;
        private String name;
        private String firstQuarterGrade;
        private String secondQuarterGrade;
        private String thirdQuarterGrade;
        private String fourthQuarterGrade;
        private String finalGrade;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirstQuarterGrade() {
            return firstQuarterGrade;
        }

        public void setFirstQuarterGrade(String firstQuarterGrade) {
            this.firstQuarterGrade = firstQuarterGrade;
        }

        public String getSecondQuarterGrade() {
            return secondQuarterGrade;
        }

        public void setSecondQuarterGrade(String secondQuarterGrade) {
            this.secondQuarterGrade = secondQuarterGrade;
        }

        public String getThirdQuarterGrade() {
            return thirdQuarterGrade;
        }

        public void setThirdQuarterGrade(String thirdQuarterGrade) {
            this.thirdQuarterGrade = thirdQuarterGrade;
        }

        public String getFourthQuarterGrade() {
            return fourthQuarterGrade;
        }

        public void setFourthQuarterGrade(String fourthQuarterGrade) {
            this.fourthQuarterGrade = fourthQuarterGrade;
        }
        public String getFinalGrade(){
            return finalGrade;
        }
        public void setFinalGrade(String finalGrade){
            this.finalGrade = finalGrade;
        }

        @Override
        public String toString() {
            return "Course{" +
                    "name='" + name + '\'' +
                    ", firstQuarterGrade='" + firstQuarterGrade + '\'' +
                    ", secondQuarterGrade='" + secondQuarterGrade + '\'' +
                    ", thirdQuarterGrade='" + thirdQuarterGrade + '\'' +
                    ", fourthQuarterGrade='" + fourthQuarterGrade + '\'' +
                    ", finalGrade='" + finalGrade + '\'' +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "ReportCard{" +
                "courses=" + courses +
                '}';
    }
}

