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
public class InfoSingelton {
    
    public  String[] singleCountries;
    public  String singleContinentName;
    public  String singleCountryName;
    public  String singleStateName;
    public  String singleCapitalName;
    public  Point  singlePosition = new Point();
    
    public ArrayList <String> singleNeighbours = new ArrayList<>();
    
    private InfoSingelton() {
    }
    
    public static InfoSingelton getInstance() {
        return InfoSingeltonHolder.INSTANCE;
    }
    
    private static class InfoSingeltonHolder {

        private static final InfoSingelton INSTANCE = new InfoSingelton();
    }
}
