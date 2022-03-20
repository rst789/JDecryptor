import java.io.*;
import java.util.*;

public class Decryptor {

    public Decryptor() {}

    public static void main(String[] args) {
        Decryptor dc = new Decryptor();

        try{
            File f = new File("texts.txt");

            Scanner scanner = new Scanner(f);

            // Read the first line, and initialize the array1 of that line's length
            String firstLine = scanner.nextLine();
            String[] array1 = new String[firstLine.length()];

            // Split the String read by using split("\\*")
            // And put them into the array1
            for(int i = 0; i < firstLine.length(); i++) {
                array1 = firstLine.split("\\*");
            }

            // Initialize a char variable, on ASCII table space is 32
            // Therefore cSpace represents " "
            char cSpace = 32;

            // A double for loop to write in elements read each iteration
            for(int i = 0; i < array1.length; i++) {
                /*System.out.println("Array1: " + array1[i]);*/

                // For each break of array1, or each * there are, create an empty linked list
                LinkedList subListX = new LinkedList();

                // For each character of array1 element, check they are odd or even
                for(int j = 0; j < array1[i].length(); j++) {

                    // If even, addToTail
                    if((j % 2) == 0){
                        subListX.addToTail(new NodePointer(array1[i].charAt(j)));
                    }
                    // If odd, addToFront
                    else {
                        subListX.addToFront(new NodePointer(array1[i].charAt(j)));
                    }
                }
                // After each break, or each * read in the file, add a space to the tail
                subListX.addToTail(new NodePointer(cSpace));
                // Then print with toString method
                System.out.print(subListX.toString());
            }

            // The above print method instead of println, for the format sake
            // Add a \n to make a new line
            System.out.print("\n");

            // Initializing another String array
            String[] array2 = new String[50];

            // While loop to read the remainder of the file, after the first line
            while(scanner.hasNext()) {

                // Split the String read using the same method
                String line2 = scanner.next();
                array2 = line2.split("\\*");

                for (int i = 0; i < array2.length; i++) {
                    //System.out.println("Array2: " + array2[i]);
                    LinkedList subListY = new LinkedList();
                    for (int j = 0; j < array2[i].length(); j++) {
                        if ((j % 2) == 0) {
                            subListY.addToTail(new NodePointer(array2[i].charAt(j)));
                        } else {
                            subListY.addToFront(new NodePointer(array2[i].charAt(j)));
                        }
                    }
                    subListY.addToTail(new NodePointer(cSpace));
                    System.out.print(subListY.toString());
                }
                System.out.print("\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not open file.");
        }
    }

}