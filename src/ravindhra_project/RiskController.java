/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ravindhra_project;

import com.thoughtworks.xstream.*;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.awt.Point;
import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import sun.util.BuddhistCalendar;

/**
 *
 * @author fmalik24
 */
public class RiskController {

    ArrayList<Continents> ListOfContinents;

    RiskController() {
        ListOfContinents = new ArrayList<Continents>();

    }

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // te.singleCountries = {"a"};
    }

    public void showInfo() {
        InfoSingelton te;
        te = InfoSingelton.getInstance();
        String[] i = te.singleCountries;

        int a = i.length;

        int b = a;
    }

    public void ContinentCreated() {
        InfoSingelton te;
        te = InfoSingelton.getInstance();
        Continents objContinent = new Continents();
        objContinent.setContinentName(te.singleContinentName);
        ListOfContinents.add(objContinent);

    }

    public void CountryCreated() {
        InfoSingelton te;
        te = InfoSingelton.getInstance();
        Countries objCountries = new Countries();
        objCountries.setNameOfCountry(te.singleCountryName);

        for (int i = 0; i < ListOfContinents.size(); i++) {
            Continents dummy = ListOfContinents.get(i);
            if (dummy.getContinentName().equals(te.singleContinentName)) {

                ListOfContinents.get(i).addCountry(objCountries);

            }
            // if(te.singleContinentName == ListOfContinents[i])
        }

    }

    public void StateCreated() {
        InfoSingelton te;
        te = InfoSingelton.getInstance();

        Countries dummyCountry = null;
        States stateObj = new States();

        stateObj.setNameOfState(te.singleStateName);

        if (te.singleNeighbours.size() > 0) {
            stateObj.setNeighbours(te.singleNeighbours);
        }
        // Find the country in the continents

        for (int i = 0; i < ListOfContinents.size(); i++) {
            Continents dummy = ListOfContinents.get(i);

            for (int j = 0; j < dummy.CountryList.size(); j++) {
                dummyCountry = dummy.CountryList.get(j);

                if (te.singleCountryName.equalsIgnoreCase(dummyCountry.getNameOfCountry())) {
                    stateObj.setNameOfCountry(dummyCountry.getNameOfCountry());
                    dummyCountry.StateArray.add(stateObj);
                    break;
                }
            }
        }
        for (int k = 0; k < te.singleNeighbours.size(); k++) {
            for (int l = 0; l < dummyCountry.StateArray.size(); l++) {
                if (te.singleNeighbours.get(k).equalsIgnoreCase(dummyCountry.StateArray.get(l).getNameOfState())) {
                    dummyCountry.StateArray.get(l).Neighbours.add(stateObj.getNameOfState());
                }
            }
        }



    }

    public void CapitalCreated() {
        boolean finish = false;
        InfoSingelton te;
        te = InfoSingelton.getInstance();

        for (int i = 0; i < ListOfContinents.size(); i++) {
            Continents dummy = ListOfContinents.get(i);

            for (int j = 0; j < dummy.CountryList.size(); j++) {
                Countries dummyCountry = dummy.CountryList.get(j);

                for (int k = 0; k < dummyCountry.StateArray.size(); k++) {
                    if (te.singleStateName.equalsIgnoreCase(dummyCountry.StateArray.get(k).getNameOfState())) {
                        dummyCountry.StateArray.get(k).setNameOfCapital(te.singleCapitalName);
                        dummyCountry.StateArray.get(k).setPosition(te.singlePosition);
                        finish = true;
                        break;

                    }
                }
                if (finish) {
                    break;
                }
            }
            if (finish) {
                break;
            }
        }


    }

    public String getInfoTabData() {
        String infoData = "";
        boolean finish = false;
        InfoSingelton te;
        te = InfoSingelton.getInstance();

        for (int i = 0; i < ListOfContinents.size(); i++) {
            Continents dummy = ListOfContinents.get(i);

            for (int j = 0; j < dummy.CountryList.size(); j++) {
                Countries dummyCountry = dummy.CountryList.get(j);

                for (int k = 0; k < dummyCountry.StateArray.size(); k++) {
                    if (te.singleCapitalName.equalsIgnoreCase(dummyCountry.StateArray.get(k).getNameOfCapital())) {
                        infoData = "Continent : " + dummy.getContinentName() + " \n"
                                + "Country : " + dummyCountry.getNameOfCountry() + " \n"
                                + "State : " + dummyCountry.StateArray.get(k).getNameOfState() + " \n"
                                + "Neighbours : " + dummyCountry.StateArray.get(k).getNeighbours().toString();

                        finish = true;
                        break;

                    }
                }
                if (finish) {
                    break;
                }
            }
            if (finish) {
                break;
            }
        }


        return infoData;

    }

    public void SaveIntoXML() {
        // The code that would save in the xml

        // ListOfContinents has every thing! get from this array! 
        XStream xs = new XStream(new DomDriver());
        xs.alias("RiskController", RiskController.class);

        String xml = xs.toXML(ListOfContinents);
        try {
            File f = new File("d:\\continent.xml");
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(xml);
            bw.flush();
            bw.close();
        } catch (Exception e) {
            System.out.println("in exception block of savetoxaml method" + e);
        }

        //System.out.println(xml);


    }

    public void LoadFromXML() {
        XStream xs = new XStream(new DomDriver());
        xs.alias("RiskController", RiskController.class);
        String filePath = "d:\\continent.xml";
        byte[] buffer = new byte[(int) new File(filePath).length()];
        BufferedInputStream f = null;
        try {
            f = new BufferedInputStream(new FileInputStream(filePath));
            f.read(buffer);
        } catch (IOException ignored) {
            System.out.println("File not found or invalid path.");
        }
        String xml = new String(buffer);
        ArrayList<Continents> retList = new ArrayList<Continents>();
        retList = (ArrayList<Continents>) xs.fromXML(xml);
        ArrayList<Countries> conlist;
        ArrayList<States> listOfStates;
        ArrayList<String> neighbours;
        System.out.println("Size is : " + retList.size());
        for (int i = 0; i < retList.size(); i++) {
            System.out.println("\n\n");
            System.out.println("Name of continent is : " + retList.get(i).getContinentName());
            conlist = retList.get(i).CountryList;
            for (int j = 0; j < conlist.size(); j++) {
                System.out.println("Country name is : " + conlist.get(j).getNameOfCountry());
                listOfStates = conlist.get(j).StateArray;
                for (int k = 0; k < listOfStates.size(); k++) {
                   Point p=listOfStates.get(k).getLocationOfState();
                    neighbours = listOfStates.get(k).Neighbours;
                    System.out.println("State name is : " + listOfStates.get(k).getNameOfState());
                    System.out.println("Capital name is : " + listOfStates.get(k).getNameOfCapital());
                    System.out.println("X of capital is"+p.x);
                    System.out.println("Y of capital is"+p.y);
                    for (int l = 0; l < neighbours.size(); l++) {
                        System.out.println("Neighbour is : " + neighbours.get(l));
                    }
                }
            }

        }
    }
}
