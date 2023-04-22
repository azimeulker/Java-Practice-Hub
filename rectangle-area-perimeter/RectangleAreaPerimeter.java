 /*
 * Name: Azime Ulker
 *Program: Business Information Technology
 *Course: ADEV-1008 Programming 1
 *Created:2022-11-27
 */

 /**
  *This program prints the area and perimeter of a rectangle.
  *
  *@author Azime Ulker
  *@version 1.0
  */
 public class RectangleAreaPerimeter
{
   public static void main(String[] args)
   {
     double width = 5.5;
     double height= 8.5;

     double areaCal = width * height;
     double perimeter = 2*(width + height);

     System.out.println("Area is: " + areaCal + ".");
     System.out.println("Perimeter is: " + perimeter + ".");
   }
}