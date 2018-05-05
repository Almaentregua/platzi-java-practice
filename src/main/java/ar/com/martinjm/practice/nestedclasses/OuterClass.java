package ar.com.martinjm.practice.nestedclasses;

/**
 * Class that use as father class
 * Documentation: https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
 *
 * @author: Martin, Juan
 */
public class OuterClass {

    /**
     * Class static to test Static nesteed class
     */
    public static class StaticNestedClass{

        public static void hereIAm(){
            System.out.println("I am in the StaticNestedClass in a static method");
        }

        public void hereIam(){
            System.out.println("I am in the StaticNestedClass in a non static method");
        }
    }

    /**
     * Class non static to test InnerClass
     */
    public class InnerClass{
        public void hereIam(){
            System.out.println("I am in the InnerClass in a non static method");
        }
    }

    /**
     * Method to test class locals in methods (very complicated)
     */
    public static void hereIAm(){
        class Local{
            private void run(){
                System.out.println("I am in a method that has a class");
            }
        }
        Local local = new Local();
        local.run();
    }

    public abstract class AbstractClass{
        public abstract void hereIAm();
    }
}
