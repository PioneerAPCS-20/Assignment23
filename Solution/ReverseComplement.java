
import java.util.Scanner;

public class ReverseComplement
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String run = "";
        String dna = "";

        while(!run.equalsIgnoreCase("no"))
        {
            System.out.print("Enter the DNA string: ");
            dna = in.next();
            System.out.println("The reverse complement of " + dna + " is " + revComp(dna));
            System.out.print("Would you like to try another DNA string? ");
            run = in.next();
        }
    }
    
    public static String revComp(String dna)
    {
        String result = "";

        for(int i = dna.length() - 1; i >= 0; i--)  // start at end of string and go in reverse
        {
            // grab character, get the complement, and put into result
            
            String base = dna.substring(i, i+1);  // single character from the strand

            if(base.equals("G"))
            {
                result += "C";
            }
            else if(base.equals("C"))
            {
                result += "G";
            }
            else if(base.equals("A"))
            {
                result += "T";
            }
            else if(base.equals("T"))
            {
                result += "A";
            }
        }

        return result;
    }
}

