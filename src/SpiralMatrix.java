import static java.lang.System.*;
import java.math.*;
import java.util.*;

public class SpiralMatrix
{
    private int matrixSize;
    private int [][] mat;
    //define a matrix
    public SpiralMatrix(){}

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
        int counter = 1;
        int down = matrixSize;
        int right = matrixSize -1;
        int up = matrixSize - 1;
        int left = matrixSize - 2;
        do {
            for (int d = 0; d < down; d++){
                mat[d][0] = counter;
                counter++;
            }
        } while (counter <= Math.pow(matrixSize, 2));
    }

    public String toString( )
    {
        String output="";
        createSpiral();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                out.print(mat[i][j]);
            }
            out.println();
        }
        return output;
    }
}