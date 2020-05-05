/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package no.hvl.dat109;
import java.util.Random;

/**
 * Klasse for en terning
 * @author Viet Uy Huynh
 */
// line 11 "../../../main.ump"
public class Terning
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Terning Attributes
  private int verdi;
  private Random r;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Terning()
  {
    verdi = 0;
    resetR();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setVerdi(int aVerdi)
  {
    boolean wasSet = false;
    verdi = aVerdi;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetDefaulted */
  public boolean setR(Random aR)
  {
    boolean wasSet = false;
    r = aR;
    wasSet = true;
    return wasSet;
  }

  public boolean resetR()
  {
    boolean wasReset = false;
    r = getDefaultR();
    wasReset = true;
    return wasReset;
  }

  /**
   * Variabel som hold p� verdien til terningen
   */
  public int getVerdi()
  {
    return verdi;
  }

  /**
   * Lager en ny random som blir brukt for � generere tilfeldige tall
   */
  public Random getR()
  {
    return r;
  }
  /* Code from template attribute_GetDefaulted */
  public Random getDefaultR()
  {
    return new Random();
  }

  public void delete()
  {}


  /**
   * Metoden set et tilfeldig tall fra 1 til 6 p� verdi-variabelen ved hjelp av Random-klassen
   */
  // line 24 "../../../main.ump"
  public void trill(){
    setVerdi(r.nextInt(6) + 1);
  }


  public String toString()
  {
    return super.toString() + "["+
            "verdi" + ":" + getVerdi()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "r" + "=" + (getR() != null ? !getR().equals(this)  ? getR().toString().replaceAll("  ","    ") : "this" : "null");
  }
}