/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w2033319_planemanagement;
import java.util.Scanner;

/**
 *
 * @author waynewilliams
 */
public class Person {
    static Scanner input= new Scanner(System.in);
    
    private String name;
    private String surname;
    private String email;
    
    public Person () {
        System.out.println("Enter your name");
        String name = input.nextLine();
        this.name = name;

        System.out.println("Enter your surname");
        String surname = input.nextLine();
        this.surname = surname;

        System.out.println("Enter your email");
        String email = input.nextLine();
        this.email = email;
    }
}
