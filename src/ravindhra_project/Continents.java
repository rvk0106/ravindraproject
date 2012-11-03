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
public class Continents 
{
    ArrayList <Countries> CountryList;
    private String ContinentName;
    
    Continents()
    {
        ContinentName = "";
        CountryList = new ArrayList<>();
    }
    
    public void setContinentName(String name)
    {
        ContinentName = name;
    }
    public void addCountry(Countries obj)
    {
        CountryList.add(obj);
    }
    public String getContinentName()
    {
        return ContinentName;
    }
    
    
}
