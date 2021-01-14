/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaloperators;

import java.util.Scanner;

/**
 *
 * @author NAVTTC07
 */
public class LogicalOperators {

    public static void main(String[] args) {
        
        //ANd OR Not---> && || !
        //ANd --> T and T = T
                   //T and F =F
                   //F and T=F
                   //F and F=F
                   
         //OR ->>> T or T=T
                    //T or F=T
                    //F or T=T
                    //F or F=F
        int per =65;
        
        if(per >=50 && per<=59 ){
            System.out.println("Grade C");
        }
        
        Scanner user=new Scanner(System.in);
        
        System.out.println("Do you want to continue y/n");
        char ch=user.next().charAt(0);
        
        
        if(ch=='y' || ch=='Y'){
            System.out.println("OK Continue");
        }
        
        else
        {
            System.out.println("Exit");
        }
        user.nextLine();
        System.out.println("Enter any string");
        String word=user.nextLine();
        System.out.println("word "+word);
        
    }
    
}
