
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Challenge
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");
        int numberOfParts = Integer.parseInt(values[0]);
        int numberOfDays = Integer.parseInt(values[1]);

        HashSet<String> set = new HashSet<String>();
        int day = 0;
        while (numberOfDays > day)
        {
            String part = br.readLine();
            set.add(part);
            day++;
            if (set.size() == numberOfParts)
            {
                System.out.println(day);
                return;
            }
        }

        System.out.println("paradox avoided");
    }
}