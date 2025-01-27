/*
*Ruben Ramirez
*SID: 0432694
*Professor Kewei Sha
*
*/


package hw5;

/**
 *
 * @author Ruben Ramirez
 */
public class swapElement {
    
    swapElement(double [] array){
        
        this.array = array;
        arrayLength = array.length;
    }
    
    
    // fields
    private double [] array;
    private final int arrayLength;
    //******************************************************
    // methods
    
    // swap method
    public void swap(int j,int i){
        double temp;
        try{
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        catch(IndexOutOfBoundsException indexout)
        {
            System.err.print(indexout);
        }
        
        
    }// end of swap method
    
    // odd or even method
    public int oddEven(int number){
        
        
    if(number%2 == 1)
            number = (number - 1)/2;
        else
            number = number/2;
    
    return number;
    
    }

    // reverse order method
    public void reverse(){
        
        int end = oddEven(arrayLength);
        try{
            for (int count = 0; count < end; count++){
            
            swap(count,arrayLength-count-1);
            }
        }
        catch(IndexOutOfBoundsException indexout)
        {
            System.err.print(indexout);
        }
        
    }// end of order method
    
    //*************************************************************************
    
    public void setArray(double [] array){
        this.array = array;
    }// end set method
    
    public double [] getArray(){
        return array;
    }// end get method

}
