package com.mastercode.week01.method;

public class Challenge1 {
    public static void main(String[] args) {
        String mark1 = checkExamMark(87);
        String mark2 = checkExamMark(90);
        String mark3 = checkExamMark(92);
        String mark4 = checkExamMark(46);
        String mark5 = checkExamMark(76);

        System.out.println("87 -> " + mark1);
        System.out.println("90 -> " + mark2);
        System.out.println("92 -> " + mark3);
        System.out.println("46 -> " + mark4);
        System.out.println("76 -> " + mark5);
    }


    public static String checkExamMark(int studentScore) {

        if (studentScore > 100) return "Invalid Number";

        if (studentScore > 90 && studentScore <= 100) {
            return "A";
        } else if (studentScore > 80 && studentScore <= 90) {
            return "B";
        } else if (studentScore > 70 && studentScore <= 80) {
            return "C";
        } else if (studentScore > 60 && studentScore <= 70) {
            return "D";
        } else if (studentScore > 50 && studentScore <= 60) {
            return "E";
        }

        return "FAILED !!!";
    }
}
