/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment3part1;

import java.util.ArrayList;  // 导入 ArrayList 类

/**
 *
 * @author wawawu
 */
public class JavaAssignment3Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Print Hello World
        System.out.println("Hello World");

        // int variable
        int number = 42;
        System.out.println("Int variable: " + number);

        // String variable
        String name = "Ella";
        System.out.println("String variable: " + name);

        // Array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("ArrayList: " + fruits);
    }
}
