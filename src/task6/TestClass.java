package task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TestClass {
   public static void readData()
   {
      List<Integer> someNumbers = new ArrayList();
      System.out.println("Enter numbers: ");
      try {
         while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line1 = reader.readLine();
            int x = Integer.parseInt(line1);
            someNumbers.add(x);
         }
      }

      catch (NumberFormatException | IOException e)
      {
         for (Integer numbers: someNumbers) {
            System.out.println(numbers);
         }
      }
   }
}