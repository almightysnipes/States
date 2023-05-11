import java.util.*;
import java.io.*;

public class States {
   public static void main(String args[])throws FileNotFoundException {
   
    Scanner input = new Scanner(System.in);
      File fyle = new File("USStates.txt");
      Scanner infile = new Scanner(fyle);
      
      int count = 0;
      while(infile.hasNext()){
      count++;
      infile.nextLine();
      }
      System.out.println(count);     
      infile.close();
      infile = new Scanner(fyle);
      String words[] = new String[count];
      int i;
      for(i = 0; i < count; i++)
      words[i] = infile.nextLine();
      
      System.out.println();      
      
      for(i = 0; i < count; i++) {
      String blah = words[i];
      int botindex = 0;
      int topindex = blah.indexOf(',');
      String num = blah.substring(botindex, topindex);
      botindex = topindex + 1;
      topindex = blah.indexOf(',', botindex);
      String name = blah.substring(botindex, topindex);
      String phrase = blah.substring(topindex + 1, blah.length());
      System.out.println();
      System.out.println("State: " + num);
      System.out.println("Abbreviation: " + name);
      System.out.println("Land Area and Population: " + phrase);
      }
      }
      }

