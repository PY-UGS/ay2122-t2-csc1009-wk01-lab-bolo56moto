import java.util.Scanner;
public class Example3

{
 public static void main(String arg[])
 {
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("What's the course code");
            String currency = input.nextLine();
        
        
         
         switch(currency)
         {
         case "CSC1007":
         System.out.println("Operating Systems");
         break;
         case "CSC1008":
         System.out.println("Data Structures and Algorithms");
         break;
         case "CSC1009":
         System.out.println("Object Oriented Programming");
         break;
         case "CSC1010":
         System.out.println("Computer Networks");
         break;
         default:
         System.out.println("Unknown Course");
         break;
         }
    }
 
} 
}