package ar.com.martinjm.practice;

import ar.com.martinjm.practice.nestedclasses.OuterClass;

public class Application {
    public static void main(String args[]){
        System.out.println("nested classes");
        System.out.println("");

        //Test StaticNestedClass with static method and non static methods
        OuterClass.StaticNestedClass.hereIAm();
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.hereIam();

        //Test Inner class
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.hereIam();

        //Test class in a method
        OuterClass.hereIAm();

    }
}
