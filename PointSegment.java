import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.lang.Math;
public class PointSegment
{
public static Point lmao;
  private  double end1;
 private double end2;
 private double wa;
 private double waa;
    //hello
   //idk what to comment so yay!! comment !!
   
     public PointSegment(double x, double y, double z, double c)
   {
  lmao = new Point(x,y); // x1 y1
    //end1 = x; 
    wa = z;  //x2
    //end2 = y;
    waa = c;  //y2
   }
   public String stringy()
{ return "The X values are "+lmao.getX()+ ","+wa+ " and the Y values are "+lmao.getY()+","+waa+ " ";}

public double length()
{
double x;
double y;
double z;
double finalii;
x = (wa - lmao.getX()) * (wa - lmao.getX());
y = (waa - lmao.getY()) * (waa - lmao.getY());
finalii = Math.sqrt(x + y);
return finalii;
}

public double slope() // y2 - y1 / x2- x1
{
double x;
double y;
double finalii;
x = (wa - lmao.getX());
y = (waa - lmao.getY());
finalii = y / x;
//System.out.println(z);
return finalii;

}

public boolean Yaxis()
{
if((wa > 0 && lmao.getX() < 0) || (lmao.getX() > 0 && wa < 0))
return true;
else return false;
}

public boolean Xaxis()
{
if((lmao.getY() > 0 && waa < 0) || (waa > 0 && lmao.getY() < 0))
return true;
else return false;
}
}



 
  





