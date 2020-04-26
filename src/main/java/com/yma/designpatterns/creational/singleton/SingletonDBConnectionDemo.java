package com.yma.designpatterns.creational.singleton;

public class SingletonDBConnectionDemo {

    public static void main(String[] args) {

        SingletonEagerDBConnection singletonEagerDBConnection_1 =  SingletonEagerDBConnection.getSingletonEagerDBConnection();
        SingletonEagerDBConnection singletonEagerDBConnection_2 =  SingletonEagerDBConnection.getSingletonEagerDBConnection();

        System.out.println(singletonEagerDBConnection_1);
        System.out.println(singletonEagerDBConnection_2);

        if(singletonEagerDBConnection_1 == singletonEagerDBConnection_2){
            System.out.println("Both instance are same location");
        }

    }

}
