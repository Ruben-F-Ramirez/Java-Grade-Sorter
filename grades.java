/*
 * Ruben Ramirez
 * SID: 0432694
 * Professor Kewei Sha
 */

package hw5;

/**
 *
 * @author Ruben Ramirez
 */
public class grades {
    grades(String courseName, int[] grades){
        
        gradesArray = grades;
        course = courseName;
        letterGradesArray = new char [grades.length];
        ARRAY_SIZE = gradesArray.length;
    }

    // fields
    
    private int [] gradesArray;
    private char [] letterGradesArray;
    private String course;
    private final int ARRAY_SIZE;
    
    // methods
    
    
    
    //initialize grade array
    
    
    // calculate average
    public double getAverage(){
        int total = 0;
        
        // sum grades
        for (int grade : gradesArray)
            total += grade;
        
        return (double) total/ARRAY_SIZE;
    }
    
    // calculate min grade
    public int getMin(){
        int low = gradesArray[0];
        
        for (int grade : gradesArray){
            
            if (grade < low)
                low = grade;
        }// end loop
            
        return low;         
    }// end min method
    
    // calculate max grade
    public int getMax(){
        int high = gradesArray[0];
        
        for (int grade : gradesArray){
            
            if (grade > high)
                high = grade;
        }// end loop
            
        return high;         
    }// end max method
    
    // calculate distribution
    public void distr(){
        System.out.println("Grade Distribution");
        
        int [] freq = new int [11];
        
        for (int grade: gradesArray)
            ++freq[grade/10];
        // print labels
        
        try{
            for (int count = 0; count < freq.length; count++){
                if (count == 10)
                    System.out.printf("%5d: ", 100);
                else
                    System.out.printf("%02d-%02d: ", count*10,count*10 + 9);
                // print bar
                for ( int star = 0; star < freq[count]; star++)
                    System.out.print("*");
                System.out.println(); // next bar
            }// end bar chart loop
        }
        catch(IndexOutOfBoundsException indexout)
        {
            System.err.print(indexout);
        }
        
    }// end distribution method
    
    // display grades method
    public void displayGrades(){
        System.out.println("The grades are:\n");
        try{
            // ouput grades
            for (int student = 0; student < ARRAY_SIZE; student++)
                System.out.printf("Grade %2d: %3d\n", student +1,gradesArray[student]);
        }
        catch(IndexOutOfBoundsException indexout)
        {
            System.err.print(indexout);
        }
        
    }// end display grades method
    
    // change number grade to letter grade
    public char point2Letter(int pointGrade)
    {
        
        char letterGrade;
        switch (pointGrade/10)
        {
            case 9: case 10: letterGrade = 'A'; break;
            case 8: letterGrade = 'B'; break;
            case 7: letterGrade = 'C'; break;
            case 6: letterGrade = 'D'; break;
            case 0: case 1: case 2: case 3: case 4: case 5: letterGrade = 'F'; break;
            default: letterGrade = 'I';
        }
        return letterGrade;
    } // end change to letter grade method

    // create letter grade array
    public void setLetter(){
        try{
            for (int grade = 0; grade < ARRAY_SIZE; grade++)
                letterGradesArray[grade] = point2Letter(gradesArray[grade]);
        }
        catch(IndexOutOfBoundsException indexout)
        {
            System.err.print(indexout);
        }
        
    }// end letter grade array method
    
    public char [] getLetter(){
        return letterGradesArray;
    }
    
    
    /**
     * @return the gradesArray
     */
    public int[] getGradesArray() {
        return gradesArray;
    }

    /**
     * @param gradesArray the gradesArray to set
     */
    public void setGradesArray(int[] gradesArray) {
        this.gradesArray = gradesArray;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }
    

}
