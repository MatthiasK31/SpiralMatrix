import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Main
{
    public static void main( String args[] ) throws IOException
    {
        File file = new File("src/matrices.txt");
        Scanner matrixReader = new Scanner(file);
        int totalMatrices = 0; totalMatrices = matrixReader.nextInt();

        SpiralMatrix [] matrices = new SpiralMatrix[totalMatrices];
        for (int i = 1; i < totalMatrices; i++){
            int matrixSize = matrixReader.nextInt();
            matrices[i] = new SpiralMatrix(matrixSize);
            out.println(matrices[i]);
        }


    }
}