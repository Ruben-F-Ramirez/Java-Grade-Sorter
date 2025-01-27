/*
*Ruben Ramirez
*SID: 0432694
*Professor Kewei Sha
*
*/



package hw5;

import java.util.InputMismatchException;

/**
 *
 * @author Ruben Ramirez
 */
public class intSort {
    
    intSort(int [] array){
        while(flag){
        try{
            sortArray = array;
            flag = false;
        }
        catch (InputMismatchException IMExp)
            {
                    
                System.err.println(IMExp);
                flag = true;
            }
        
        
        }
    }
    
    // fields
    private int [] sortArray;
    boolean flag = true;
    
    // methods
    
    // calculate min value
    public int [] getMin(int i){
        int low = getSortArray()[i];
        
        int index = i;
        
        try{
            for (int j = i;j < getSortArray().length; j++){
            
            if (getSortArray()[j] < low){
                index = j;
                low = getSortArray()[j];
                
                }
            
            }// end loop
        }
        catch(IndexOutOfBoundsException indexout)
        {
            System.err.print(indexout);
        }
        
        
        
        int [] min = {low,index};
            
        return min;         
    }// end min method
    
    // method to swap elements
    public void swap(int [] min,int i){
        int temp;
        try
        {
            temp = getSortArray()[i];
            sortArray[i] = min [0];
            sortArray[min[1]] = temp;
            
        }
        catch(IndexOutOfBoundsException indexout)
        {
            System.err.print(indexout);
        }
        
        
    }
    
    // method to sort order
    public int [] sorted(){
        
        
        for (int count = 0; count < getSortArray().length; count++){
             
            // call swap element method
            swap(getMin(count),count);
        }
        
        return getSortArray();
    }

    /**
     * @return the sortArray
     */
    public int[] getSortArray() {
        return sortArray;
    }
    
    

}
