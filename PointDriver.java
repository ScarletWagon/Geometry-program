import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
public class PointDriver
{
   public static PointSegment bruh;
   public static Point lmao; //hello
   //idk what to comment so yay!! comment !!
 
      
   public static void main(String args[])
   {  Scanner input = new Scanner(System.in);
      System.out.println("Please enter the x1 point!");
      double x = input.nextDouble();
      System.out.println();
      System.out.println("Please enter the y1 point!");
      double y = input.nextDouble();
      System.out.println();
      System.out.println("Please enter the x2 point!");
      double z = input.nextDouble();
      System.out.println();
      System.out.println("Please enter the y2 point!");
      double c = input.nextDouble();
      System.out.println();
      bruh = new PointSegment(x,y,z,c);
      lmao = new Point(x,y);
      System.out.println(lmao.stringy());
      System.out.println(bruh.stringy());
      System.out.println("The distance between the 2 points are "+bruh.length()+" while it had a slope of "+bruh.slope()+ " ");
      System.out.println();
      if(bruh.Xaxis() && bruh.Yaxis())
      {System.out.println("The line cross at the X axis");
       System.out.println();}
       else 
      if(bruh.Xaxis())
      {System.out.println("The line cross at the X axis");
       System.out.println();}
       else 
       if(bruh.Yaxis())
      {System.out.println("The line cross at the Y axis");
       System.out.println();}
       else System.out.println("The line did not cross at either x or y axis");
        
      


   }
      
                  
      
}
             






