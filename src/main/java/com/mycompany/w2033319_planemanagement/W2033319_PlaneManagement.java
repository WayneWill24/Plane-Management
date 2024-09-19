/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.w2033319_planemanagement;
import static com.mycompany.w2033319_planemanagement.Ticket.send_price;
import static com.mycompany.w2033319_planemanagement.Ticket.input;
import java.util.Scanner;

/**
 *
 * @author waynewilliams
 */
public class W2033319_PlaneManagement {
    
    static Scanner input= new Scanner(System.in);

    public static void main (String[] args) {
        
        int[][] plane = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
      int indexrow = 0;
        int indexnum = 0;
        System.out.println("Welcome to the Plane Management application");
            
        System.out.println("************************************************");
        System.out.println("*                 Menu Optons                  *");
        System.out.println("************************************************");

        System.out.println("    1) Buy a seat");
        System.out.println("    2) Cancel a seat");
        System.out.println("    3) Find first available seat");
        System.out.println("    4) Show seeting plan");
        System.out.println("    5) Print tickets information and total sales");
        System.out.println("    6) Search tickets");
        System.out.println("    0) Quit");
        System.out.println("************************************************");    
       
        int i = 0;
        
        while (i != 1) {
            
            System.out.println("Please pick an opton: ");
            String user = input.nextLine();
            
            switch (user) {
                case "1":
                buy_seat(plane);
                break;
                
                case "2":
                cancel_seat(plane);
                break;
                
                case "3": 
                find_first_available(plane);
                break;
                
                case "4":
                show_seating_plan(plane);
                break;
                
                case "5":
                print_tickets_info(plane, indexrow,indexnum);
                break;
                
                case "6":
                search_ticket();
                break;
                
                case "0":
                i++;
                break;

                default:
                    error();
                break; 
            }
        }
    }
//------------------------------------------------------------------------------

    public static void buy_seat(int plane[][]) {
    
        Ticket ticket = new Ticket(plane);
    }
//------------------------------------------------------------------------------

    public static void cancel_seat(int plane[][])  {
    
        Scanner in = new Scanner(System.in);  
    
        int indexrow = 0;
        int indexnum = 0;
        
        System.out.println("enter row:");
        String input = in.next().toUpperCase();//reference 1 at the bottom
        
        boolean a = input.equals("A");//reference 1 at the bottom
        boolean b = input.equals("B");//reference 1 at the bottom
        boolean c = input.equals("C");//reference 1 at the bottom
        boolean d = input.equals("D");//reference 1 at the bottom
        
        if (a){
            
            indexrow = 0;
        
        } else if (b) {
            
            indexrow = 1;
        
        } else if (c) {
            
            indexrow = 2;
        
        } else if (d) {
            
            indexrow = 3;
        
        } else {
           
           error();
           cancel_seat(plane);
        
        }
        
        System.out.println("enter seat");
        
        int user1 = in.nextInt();
        user1--;
        indexnum = user1;
        
        if (user1 > plane[indexrow].length || user1 < 0){  
            
            error();
            buy_seat(plane);
            
        } else if (plane[indexrow][indexnum] == 1) {
            
            plane[indexrow][indexnum]--;
            System.out.println("This seat is now canceled");
        
        } else {
            
            System.out.println("This seat is not sold");
        }
    }

//------------------------------------------------------------------------------

    public static void find_first_available(int plane[][])  {
        
        int searchValue = 0;
        int indexrow = 0;
        int indexnum = 0;
    
        while (indexnum < plane[indexrow].length && plane[indexrow][indexnum] 
            != searchValue) {
           
           indexnum++;
        }
           
       if (indexnum != plane[indexrow].length) {
           
           indexnum++;
           System.out.println("A" + indexnum + " is avalable");
           
        } else {  
           
           plane_b(plane);
        
        }
      
    }

//------------------------------------------------------------------------------

    public static void show_seating_plan (int plane[][])  {
    
        int searchValue = 0;
    
        for(int indexrow = 0; indexrow < 4; indexrow++) {
            
            for(int indexnum = 0; indexnum < plane[indexrow].length;) {
                
                if (plane[indexrow][indexnum] == searchValue) {
                
                    System.out.print("O");
                    indexnum++;
                    
                } else {
                    
                    System.out.print("X");
                    indexnum++;   
                }
            }   System.out.println(); 
        }      
    }
//------------------------------------------------------------------------------

    public static void print_tickets_info(int plane[][],int indexnum, int indexrow)  {
            
   Ticket.send_price(plane[indexrow][indexnum], 0);
    }
//------------------------------------------------------------------------------

    public static void search_ticket()  {
        
    }
//------------------------------------------------------------------------------

    public static void error()  {
        
        String error = "Invalid input";
            
        System.out.println(error);
    }
//------------------------------------------------------------------------------
 
    public static void plane_b(int plane[][])  {
    
        int searchValue = 0;
        int indexrow = 1;
        int indexnum = 0;
    
       while (indexnum < plane[indexrow].length && plane[indexrow][indexnum] 
            != searchValue) {
           
           indexnum++;
        }
             
       if (indexnum != plane[indexrow].length) {
       
           indexnum++;
           System.out.println("B" + indexnum + " is avalable");
       
        } else {
           
           plane_c(plane);
        } 
    }
//------------------------------------------------------------------------------
 
    public static void plane_c(int plane[][])  {
    
        int searchValue = 0;
        int indexrow = 2;
        int indexnum = 0;
    
       while (indexnum < plane[indexrow].length && plane[indexrow][indexnum] 
            != searchValue) {
           
           indexnum++;
        }
              
       if (indexnum != plane[indexrow].length) {
           
           indexnum++;
           System.out.println("C" + indexnum + " is avalable");
       
        } else {
           
           plane_d(plane);
        }    
    }
//------------------------------------------------------------------------------
 
    public static void plane_d(int plane[][])  {
        
        int searchValue = 0;
        int indexrow =3;
        int indexnum =0;
    
       while (indexnum < plane[indexrow].length && plane[indexrow][indexnum] 
            != searchValue) {
        
            indexnum++;
        
        }
              
       if (indexnum != plane[indexrow].length) {
       
           indexnum++;
           System.out.println("D" + indexnum + " is avalable");
           
        } else if (indexnum == plane[indexrow].length) {
           
           System.out.println("All Seats are sold");
        }   
    }
//------------------------------------------------------------------------------
}

/* reference 1
*https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-8.php
*/