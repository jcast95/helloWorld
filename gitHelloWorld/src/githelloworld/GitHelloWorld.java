/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githelloworld;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jgcastillo0
 */
public class GitHelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ArrayList<String> lines = new ArrayList<String>();
       System.out.println("Hello World");
       
       try{
       FileReader fr = new FileReader(args[0]);
       BufferedReader br = new BufferedReader(fr);
       String line = ""; 
       while((line = br.readLine()) != null)
       {
           lines.add(line);
       }
       for(String s: lines)
       {
           System.out.printf("  -->%S%n", s);
       }
       }
       
       catch(FileNotFoundException e)
       {
           System.out.println("File not found");
       }
       catch(IOException c)
       {
           System.out.println("IO exception");
       }
    }
    
}
