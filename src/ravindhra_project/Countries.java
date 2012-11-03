/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ravindhra_project;

import java.util.ArrayList;

/**
 *
 * @author fmalik24
 */
public class Countries 
{
   private String NameOfCountry;
   ArrayList <States> StateArray;
   Countries()
   {
       NameOfCountry = "";
       StateArray = new ArrayList<>();
   }
   public void setNameOfCountry(String Name)
   {
       NameOfCountry = Name;
   }
   public String getNameOfCountry()
   {
       return NameOfCountry;
   }
           
    
}
