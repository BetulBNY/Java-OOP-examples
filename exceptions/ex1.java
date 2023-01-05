/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;
import java.util.*;
//About TRY-CATCH exception

 class askName{
     
    Scanner scanner= new Scanner(System.in); 
    private static final String MESSAGE ="Your Name:";
    
    public String Getname(){
        return Getname(MESSAGE);
    }
    //CASE 1: without exception
    /*
    public String Getname(String prompt){
        System.out.println(prompt);  //A prompt is a text expression that prompts a user for information or an entry.
        String name=scanner.next();
        return name;
    }
    */
    //CASE 2: with exception
    
    public String Getname(String prompt){
        String name;
      
        while(true){
            System.out.println(prompt);
            try{              
             name= scanner.next();
             if(!name.matches("[a-zA-Z]+")){  //here is only for letters not include numbers
                 throw new InputMismatchException("Please only enter letter. Not enter any number.");
             }
                return name;               
            }catch (InputMismatchException  hata){             
                System.out.println(hata.getMessage()); }       
        }
    }
 }

    public class ex1 {
     public static void main(String[] args) {
        
       askName input= new askName();
       String name=input.Getname();
    }
}
