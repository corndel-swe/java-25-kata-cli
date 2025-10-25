package org.kata.tania;

public class HelloWorld {


    /**
     * Returns the string "Hello World!".
     * It does not take any parameters and always returns the same message.
     *
     * @return a string that contains the message "Hello World!"
     */
    public String helloWorld() {
        return "Hello World!";
    }


    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        System.out.println(hello.helloWorld());
    }
}
