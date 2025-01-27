/*
 * Ruben Ramirez
 * SID: 0432694
 * Professor Kewei Sha
 */
package hw5;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Ruben Ramirez
 */
public class Hw5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        /***********************************************************************
         *      problem 1 grades array test
         **********************************************************************/
        // fields
        int [] grades = new int [30];
        Random rand = new Random();
        
        // initialize grades array
        for (int i = 0;i < grades.length; i++){
            
            // randomize grade
            grades [i] = rand.nextInt(101);
        }
        // display number grades
        System.out.println(Arrays.toString(grades));
        
        grades myGrades = new grades("Java",grades);
        
        System.out.printf( "\nClass average is %.2f\n", myGrades.getAverage());
        
        myGrades.setLetter();
        
        System.out.printf("The min grade is: %3d\n", myGrades.getMin());
        
        System.out.printf("The max grade is: %3d\n", myGrades.getMax());
        
        myGrades.distr();
        
        /***********************************************************************
         *      problem 2 grades array test
         **********************************************************************/
        
        int [] randArray = new int [10];
        int [] min = new int[2];
               
        intSort myArray;
        
        
        
        for (int i = 0;i < randArray.length; i++){
            
            // randomize grade
            randArray [i] = rand.nextInt(11);
        }
        
        System.out.println("The unsorted array is: ");
        System.out.println(Arrays.toString(randArray));
        myArray = new intSort(randArray);
        
        System.out.println("\nThe sorted array is: ");
        System.out.println(Arrays.toString(myArray.sorted()));
        
        /***********************************************************************
         *      problem 3 reverse array test
         **********************************************************************/
        
        swapElement swapArray;
        
        double [] Array1 = new double [6];
        
        for (int i = 0;i < Array1.length; i++){
            
            // randomize grade
            Array1 [i] = rand.nextInt(11);
        }
        System.out.println(Arrays.toString(Array1));
        swapArray = new swapElement(Array1);
        swapArray.reverse();
        System.out.println(Arrays.toString(swapArray.getArray()));


        

        
    }
    
}
