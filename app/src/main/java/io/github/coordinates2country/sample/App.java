/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.github.coordinates2country.sample;

import io.github.coordinates2country.Coordinates2Country;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(Coordinates2Country.country(-23.7, 39.8));
    }
}
