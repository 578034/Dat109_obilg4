/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package no.hvl.dat109;
import java.util.*;

/**
 * Klasse som definerer en kopp for å holde på (2) terninger
 * @author Viet Uy Huynh
 */
// line 32 "../../../main.ump"
public class Kopp
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Kopp Attributes
  private int sum;

  //Kopp Associations
  private List<Terning> terninger;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Kopp(Terning... allTerninger)
  {
    sum = 0;
    terninger = new ArrayList<Terning>();
    boolean didAddTerninger = setTerninger(allTerninger);
    if (!didAddTerninger)
    {
      throw new RuntimeException("Unable to create Kopp, must have 2 terninger");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSum(int aSum)
  {
    boolean wasSet = false;
    sum = aSum;
    wasSet = true;
    return wasSet;
  }

  /**
   * Variabel som hold på summen til terningene i koppen
   */
  public int getSum()
  {
    return sum;
  }
  /* Code from template association_GetMany */
  public Terning getTerninger(int index)
  {
    Terning aTerninger = terninger.get(index);
    return aTerninger;
  }

  public List<Terning> getTerninger()
  {
    List<Terning> newTerninger = Collections.unmodifiableList(terninger);
    return newTerninger;
  }

  public int numberOfTerninger()
  {
    int number = terninger.size();
    return number;
  }

  public boolean hasTerninger()
  {
    boolean has = terninger.size() > 0;
    return has;
  }

  public int indexOfTerninger(Terning aTerninger)
  {
    int index = terninger.indexOf(aTerninger);
    return index;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfTerninger()
  {
    return 2;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfTerninger()
  {
    return 2;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfTerninger()
  {
    return 2;
  }
  /* Code from template association_SetUnidirectionalN */
  public boolean setTerninger(Terning... newTerninger)
  {
    boolean wasSet = false;
    ArrayList<Terning> verifiedTerninger = new ArrayList<Terning>();
    for (Terning aTerninger : newTerninger)
    {
      if (verifiedTerninger.contains(aTerninger))
      {
        continue;
      }
      verifiedTerninger.add(aTerninger);
    }

    if (verifiedTerninger.size() != newTerninger.length || verifiedTerninger.size() != requiredNumberOfTerninger())
    {
      return wasSet;
    }

    terninger.clear();
    terninger.addAll(verifiedTerninger);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    terninger.clear();
  }


  /**
   * Triller alle terningene i koppen og set summen av verdiane som sum
   */
  // line 40 "../../../main.ump"
  public void trillTerninger(){
    int s = 0;
    
    for (Terning t : getTerninger()) {
      t.trill();
      s = s + t.getVerdi();
    }
    
    setSum(s);
  }


  public String toString()
  {
    return super.toString() + "["+
            "sum" + ":" + getSum()+ "]";
  }
}