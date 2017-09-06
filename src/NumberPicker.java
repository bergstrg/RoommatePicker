import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class Test
{
    public static void main(String args[])
    {
        int[] solutionArray = { 1, 2, 3, 4 };
        //int counter = 0;
        for(int j = 0; j < 100; j++){
            shuffleArray(solutionArray);
            for (int i = 0; i < solutionArray.length; i++)
            {

                //if(counter == 99) {
                    if (solutionArray[i] == 1) {
                        System.out.print(" Adam ");
                    } else if (solutionArray[i] == 2) {
                        System.out.print(" Gabe ");
                    } else if (solutionArray[i] == 3) {
                        System.out.print(" John ");
                    } else if (solutionArray[i] == 4) {
                        System.out.print(" Karl ");
                    }
                //}
            }
            System.out.println();
            //counter++;
        }


    }

    //Fisher–Yates shuffle
    static void shuffleArray(int[] ar)
    {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}