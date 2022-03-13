import static java.lang.System.*;
import java.math.*;
import java.util.*;

public class SpiralMatrix
{
    //size and mat definitions
    private int matrixSize;
    private int [][] mat;

    //define a matrix
    public SpiralMatrix(){}

    //constructor to set matrix size and set size of matrix
    public SpiralMatrix(int size)
    {
        matrixSize = size;
        setSize(size);
    }

    public void setSize(int size)
    {
        mat = new int[size][size];
    }

    public void createSpiral()
    {
        //set starting and end positions for each of the array filling directions
        int counter = 1;
        int downXStart = 0; int downYStart = 0; int downConstraint = matrixSize;
        int rightXStart = 1; int rightYStart = matrixSize-1; int rightConstraint = matrixSize-1;
        int upXStart = matrixSize-1; int upYStart = matrixSize-1; int upConstraint = 0;
        int leftXStart = matrixSize-2; int leftYStart = 0; int leftConstraint = 1;


        /* loop through until the number reaches the matrix size squared
        For going down, the x and y start values increase while the loop length decreases
        For going right, the x start value increases, the y start value decreases, and the loop length decreases
        For going down, the x and y start values decrease while the loop length decreases
        For going down, the x start value decreases, the y start value increases, and the loop length decreases
         */
        do {
            for (int d = downYStart; d < downConstraint; d++){
                if (counter == Math.pow(matrixSize, 2)) break;
                mat[d][downXStart] = counter;
                counter++;
            } downXStart++; downYStart++; downConstraint--;

            for (int r = rightXStart; r < rightConstraint; r++) {
                mat[rightYStart][r] = counter;
                counter++;
            } rightXStart++; rightYStart--; rightConstraint--;

            for (int u = upYStart; u >= upConstraint; u--) {
                mat[u][upXStart] = counter;
                counter++;
            } upXStart--; upYStart--; upConstraint++;

            for (int l = leftXStart; l >= leftConstraint; l--){
                mat[leftYStart][l] = counter;
                counter++;
            } leftXStart--; leftYStart++; leftConstraint++;
        } while (counter <= Math.pow(matrixSize, 2));
    }

    public void single(){
        mat[0][0] = 1;
    }

    public String toString( )
    {
        String output="";

        //if the matrix is greater than 1, create grid, otherwise print 1
        if (matrixSize > 1)
            createSpiral();
        else if (matrixSize == 1)
            single();

        //loop through the mat and add on each of the numbers to the output return variable
        for (int [] rows : mat){
            for (int num : rows){
                output += num + "\t\t";
            }
            output += "\n";
        }

        return output;
    }
}