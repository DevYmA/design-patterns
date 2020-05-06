package com.yma.designpatterns.creational.builder;

public class StudentDemo {
    public static void main(String[] args) {

        Student.Builder studentBuilder = new Student.Builder()
                .id("1001")
                .fistName("Rich")
                .lastName("Gremy")
                .phoneName("89897798789798");

        Student student = studentBuilder.build();

        System.out.format("ID : %s \nName : %s %s \nPhone No : %s",
                student.getId(), student.getFirstName(),student.getLastName(),student.getPhoneNo());

    }
}
