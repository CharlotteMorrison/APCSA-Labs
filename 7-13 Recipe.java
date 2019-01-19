//********************************************************************
//  Recipe.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a ListIterator to iterate through the
//  elements of an ArrayList.
//
//  Update 2007: As of Java 5.0 (1.5.0) 
//  The book example on pg 341 must be updated to use Generics. 
//  (http://teachers.edenpr.org/~bridgetj/java2/ch5/Generics.html)
//  See the java API on the ArrayList<T> class.
//********************************************************************

import java.util.ArrayList;
import java.util.ListIterator;

public class Recipe
{
   //-----------------------------------------------------------------
   //  Stores and then prints a list of ingredients for a recipe.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      ArrayList ingredients = new ArrayList();  //Old code without generics
      //ArrayList<String> ingredients = new ArrayList<String>();

      ingredients.add ("flour");
      ingredients.add ("sugar");
      ingredients.add ("cocoa");
      ingredients.add ("oil");
      ingredients.add ("butter");
      ingredients.add ("eggs");
      ingredients.add ("baking soda");

      System.out.println ("To make a chocolate cake, use the following " +
         ingredients.size() + " ingredients:");

      ListIterator iterator = ingredients.listIterator();
      while (iterator.hasNext())
         System.out.println(iterator.next());
   }
}
