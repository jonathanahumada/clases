/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoriotelefonico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jaumaf
 */
public class DirectorioTelefonico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Object,ArrayList<String>> dir = new HashMap<>();
        
        ArrayList<String> arlesphones = new ArrayList();
        arlesphones.add("313 3731086");
        arlesphones.add("3442521");
        arlesphones.add("3118672084");
        
           ArrayList<String> nelsonphones = new ArrayList();
           
           nelsonphones.add("3312333 ext 221");
             nelsonphones.add( "250348938");
             
        dir.put("Arles Rodriguez",arlesphones);
        dir.put( "Nelson", nelsonphones);
        System.out.println(dir);
        
        
    
    }
    
}
