/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w2033319_planemanagement;
import static com.mycompany.w2033319_planemanagement.W2033319_PlaneManagement.error;
import java.util.Scanner;

/**
 *
 * @author waynewilliams
 */
public class Ticket {
   
    static Scanner input= new Scanner(System.in);
    private String row;
    private int seat;
    private int price;
    private String person;
    
//------------------------------------------------------------------------------ 
    
    public  Ticket (int[][] plane){
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enter Row ");
        String input = in.next().toUpperCase();
       
        this.row = input;
        
        System.out.println("Enter Seat ");
        int seat = in.nextInt();
        this.seat = seat;
       
        int priceTotel=0;
        this.price = priceTotel;
        
        
        buy_seat(plane,seat,input);     
    }
    
//------------------------------------------------------------------------------
    
    public static void send_price(int seat, int priceTotel ) {
        
        int firstClass = 200;
        int secondClass = 150;
        int basicClass = 180;
        int price = 0;
                
        if (seat == 1 || seat == 2||seat == 3|| seat == 4||seat == 5) {
            
            price =firstClass;
            priceTotel+=firstClass;
            
        
        } else if (seat == 6 || seat == 7||seat == 8|| seat == 9) {
            
            price =secondClass;
            priceTotel+=secondClass;
           
        
        } else if (seat == 10 || seat == 11||seat == 12|| seat == 13
            ||seat == 14) {
        
            price =basicClass;
            priceTotel+=basicClass;
            
        
        } else {
            
            System.out.println("Invalid input");
        
        }
        
        System.out.println(priceTotel);
    }
    
//------------------------------------------------------------------------------
    
    public  void buy_seat(int[][] plane,int seat, String input) {
        Scanner in = new Scanner(System.in);  

        int indexrow=0;


        boolean a = input.equals("A");//reference 1 at the bottom
        boolean b = input.equals("B");//reference 1 at the bottom
        boolean c = input.equals("C");//reference 1 at the bottom
        boolean d = input.equals("D");//reference 1 at the bottom


        if (a) {

            indexrow = 0;

        } else if (b) {

            indexrow += 1;

        } else if (c) {

            indexrow += 2;

        } else if (d) {

            indexrow +=3;

        } else {

          error();
          

        }
        
        seat--;
        
        if (seat > plane[indexrow].length || seat < 0) {  
            
            error();
            
            
            
        } else if (plane[indexrow][seat] == 0) {
            
            plane[indexrow][seat]++;
            Person test = new Person();
            System.out.println("This seat is now yours");
        
        } else {
            
            System.out.println("This seat is not avalble");
        
        }

    }
//------------------------------------------------------------------------------  
          
} 
             
/* reference 1
*https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-8.php
*/