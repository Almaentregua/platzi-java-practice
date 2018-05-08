package ar.com.martinjm.practice;

import ar.com.martinjm.practice.anonymousclasses.AbstractClass;
import ar.com.martinjm.practice.anonymousclasses.FuncionalInterfaceA;
import ar.com.martinjm.practice.nestedclasses.OuterClass;

public class Application {
    public static void main(String args[]){
        nestedClasses();
        anonymousClass();

    }


    /**
     * Treat anonymous class
     * @author: Martin, Juan
     */
    public static void anonymousClass(){
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void getMessage() {
                System.out.println("Anonymous Class using an abstract class");
            }
        };

        FuncionalInterfaceA functionalInterface = new FuncionalInterfaceA() {
            @Override
            public void getMessage() {
                System.out.println("Anonymous Class using a funcional interface");
            }
        };

        FuncionalInterfaceA funcionalInterfaceLambda = ()->{
            System.out.println("Anonymous Class using a funcional interface with lambda");
        };

        abstractClass.getMessage();
        functionalInterface.getMessage();
        funcionalInterfaceLambda.getMessage();
    }

    /**
     * Treat nestedClasses
     * @author: Martin, Juan
     */
    private static void nestedClasses(){
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

        //Test class abstract
        OuterClass.AbstractClass abstractClass = outerClass.new AbstractClass() {
            @Override
            public void hereIAm() {
                System.out.println("I am in an anonymous class\n");
            }
        };

        abstractClass.hereIAm();
    }
}
