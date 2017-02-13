import com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl;

import java.util.Scanner;

/**
 * Created by teronb1005 on 2/8/2017.
 */
public class StudentsInClass {
    public static void main (String [] args) {
        // Scanner being used
        Scanner scan = new Scanner(System.in);

            // A set of Arrays
        String[] students = {"Jacob","Joel","Shawn","Niall","Aaron","Jayden","Daniel","Daniel","Danny","Michael","Spencer",
            "Alex","Austin","Ryan","Logan","Muhammad","Nathan","James","Aiden","Teron"};

        String[] hometowns = {"Indianapolis","Nashville","Lexington","New York","Atlanta","Stockton","Colorado Springs","Chesapeake","Tampa",
            "Glendale","New Orleans","Tucson","Arlington","Montgomery","Austin","Madison","San Diego","Dearborn","Miami"," Detroit"};

        String[] cars = {"Volvo","Bentley","Ford","Dodge","GMC","Subaru","Toyota","Land Rover","GM","KIA","Honda","Jaguar","Lotus",
            "Mercedes","Infiniti","Lexus","Porsche", "Alfa Romeo","BMW","Audi a 7"};

            System.out.println("Welcome to the information library");
            System.out.print("Hello what's your name? ");
             // Scanner input from client. Saying Hello to clientInput.
            String clientInput;
             clientInput = scan.nextLine();
              System.out.println("Hello " + clientInput);
            String infoEntered = "Yes";
        do {
        System.out.println("So " + clientInput + " what student would you like to know about? ");
         int i = scan.nextInt() -1;
        System.out.println("Student " + (i+1) + " is " + students[i] + ".");
        System.out.println("What would you like to know about " + students[i] + "? " + " You can find out where they're from " +
                "and the kind of car they drive?");
        // Capture user input
           infoEntered = scan.next();
        if (infoEntered.equalsIgnoreCase("hometown")) {
            System.out.println(hometowns[i] + " is " + (students[i]) + " 's hometown.");
        }else if (infoEntered.equalsIgnoreCase("car")) {
            System.out.println(cars[i] + " is " + (students[i]) + " 's car.");
        }
            System.out.println("Would  you like to know about someone else? " + " Type Yes or no");
            infoEntered = scan.next();
        } while (infoEntered.equalsIgnoreCase("yes"));














        }
    }

