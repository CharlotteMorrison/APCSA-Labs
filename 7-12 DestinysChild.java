//------------------------------------------------------------------
// DestinysChild.java
//
// Demonstrates the use of a ArrayList
//------------------------------------------------------------------
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList <String> band = new ArrayList <String> ();
    band.add("Michelle");
    band.add("Kelly");
    band.add(0, "Beyonce");
    band.add("Farrah");
    System.out.println(band);
    
    int loc = band.indexOf("Farrah");
    System.out.println(loc);
    
    System.out.println("At index 1: " + band.get(1));
    
    System.out.println("size of band: " + band.size());
    
    band.remove(band.indexOf("Farrah"));
    System.out.println(band);
    
    band.remove(band.indexOf("Kelly"));
    band.remove(band.indexOf("Michelle"));
    
  String oldItem = band.set(0, "Queen B");
  }
}