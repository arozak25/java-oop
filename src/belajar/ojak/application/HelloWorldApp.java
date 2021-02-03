package belajar.ojak.application;

import belajar.ojak.data.HelloWorld;

/**
 * @author Abdul Rozak
 * @since 2/4/21
 */
public class HelloWorldApp {

    public static void main(String[] args) {

        HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("hello");
            }

            public void sayHello(String name) {
                System.out.println("hello " + name);
            }
        };

        english.sayHello();
        english.sayHello("Ojak");
    }
}
