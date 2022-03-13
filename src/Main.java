/*
Matthias Kim
Mr. Hendricks
3/13/22
Extra: Allows user to enter a length of a spiral matrix they want to see
 */

import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

public class Main
{
    public static void main( String args[] ) throws IOException
    {
        //create scanner for file
        Scanner matrixReader = new Scanner(new File("src/matrices.txt"));

        //arraylist of all the spiral matrices
        ArrayList<SpiralMatrix> matrices = new ArrayList<>();

        //loop through the file, passing in the size of the matrix then printing out the grid.
        for (int i = 0; i < 6; i++){
            int matrixSize = matrixReader.nextInt();
            matrices.add(new SpiralMatrix(matrixSize));
            out.println(matrices.get(i));
        }

        Scanner s = new Scanner(in);
        out.print("Create a spiral matrix! How big would you like it to be?  ");
        int size = s.nextInt();
        out.println(new SpiralMatrix(size));

    }
}