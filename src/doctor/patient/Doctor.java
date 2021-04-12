/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor.patient;

import java.util.Random;

/**
 *
 * @author vazeer
 */
public class Doctor {

    String docname;
    
    public Doctor(String name) {
        docname = name;
    }

   synchronized void visit(Patients use) {
        
        System.out.println("Patient "+ use.id + " Visit Doc "  + docname);
        try{
            Thread.sleep(new Random().nextInt(5)*1000);
        } catch(Exception e) {}
        
        System.out.println("Patient " + use.id+ " left ");
        
    }
}
