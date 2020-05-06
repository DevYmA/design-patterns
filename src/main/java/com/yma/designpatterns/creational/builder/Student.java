package com.yma.designpatterns.creational.builder;

public class Student {

    public static class Builder{

        private String id;
        private String firstName;
        private String lastName;
        private String phoneNo;

        public Builder() {
        }


        public Student build(){
            return new Student(this);
        }

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder fistName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return  this;
        }

        public Builder phoneName(String phoneNo){
            this.phoneNo = phoneNo;
            return this;
        }

    }

    private String id;
    private String firstName;
    private String lastName;
    private String phoneNo;

    private Student(Builder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNo = builder.phoneNo;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}
