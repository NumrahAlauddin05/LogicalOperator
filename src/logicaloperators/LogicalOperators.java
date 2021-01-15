
package logicaloperators;

import java.util.Scanner;

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
        
//        Scanner user=new Scanner(System.in);
//        
//        System.out.println("Enter a or b");
//        char ch=user.next().charAt(0);
        
        
//        if(ch=='y' || ch=='Y'){
//            System.out.println("OK Continue");
//        }
//        
//        else
//        {
//            System.out.println("Exit");
//        }
     
//        if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')){
//            System.out.println("Vowel");
//        }
//        else
//        { 
//            System.out.println("InCorrect");
//        }
       
        //a,e,i,o,u
        
//        System.out.println("Enter any character");
//        char ch1=user.next().charAt(0);
//        
//        //ch1 >='a' || ch1>='A' && ch1<='z' || ch1<='Z'
//        
//        if((ch1 >='a' && ch1<='z') || (ch1 >='A' && ch1<='Z')) {
//            System.out.println("Alphabet");
//        }
//        
//        else if(ch1 >='0' && ch1<='9'){
//            System.out.println("Digits");
//        }
//        else
//        {
//            
//            System.out.println("Symbol");
//        }
//        
        Scanner user=new Scanner(System.in);
        char ch2=65;
        System.out.println("ch2 "+ch2);
        
        System.out.println("Enter any integer");
       // char ch3=user.next().charAt(0);
       int ch3=user.nextInt();//45
       ch3=ch3+45;
        
        //System.out.println("ch3 "+ch3);
        
         if((ch3 >=97 && ch3<= 122) || (ch3 >=65 && ch3<=90)) {
            System.out.println("Alphabet");
        }
        
        else if(ch3 >=47 && ch3<=57){
            System.out.println("Digits");
        }
        else
        {
            
            System.out.println("Symbol");
        }
        
    }
    
}
