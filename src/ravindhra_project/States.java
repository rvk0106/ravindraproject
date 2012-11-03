/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ravindhra_project;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author fmalik24
 */
public class States {
    
    private String NameOfState;
    private String StateOfCountry;
    private String NameOfCapital;
    private Point LocationOfState;
    ArrayList <String> Neighbours;
    
    
    States()
    {
        NameOfState = "";
        StateOfCountry = "";
        Neighbours = new ArrayList<>();
        NameOfCapital = "";
        LocationOfState = new Point();
    }
    
    public void setNameOfState(String stateName)
    {
    this.NameOfState = stateName;    
    }
    public void setNameOfCountry(String countryName)
    {
    this.StateOfCountry = countryName;    
    }
    public void setNeighbours(ArrayList<String> obj)
    {
        Neighbours.addAll(obj);
    }
    public void setNameOfCapital(String capitalName)
    {
        this.NameOfCapital = capitalName;
    }
    public String getNameOfState()
    {
        return NameOfState;
    }
    public void setPosition(Point pos)
    {
     LocationOfState = pos;   
    }

    public Point getLocationOfState() {
        return LocationOfState;
    }
    
    public String getNameOfCapital()
    {
        return NameOfCapital;
    }
    public ArrayList <String> getNeighbours()
    {
        return Neighbours;
    }
}
