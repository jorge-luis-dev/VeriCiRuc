/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexe;


import com.documento.*;
/**
 *
 * @author jorgequiguango
 */
public class JavaExe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String version = Runtime.class.getPackage().getImplementationVersion();
        System.out.println("Versión de Java: " + version);
        
        Ci ci = new Ci("1002456877");
                
        System.out.println("Ci: " + ci.getCi());
        System.out.println("Ci: " + ci.validar());
        System.out.println("Ci: " + ci.getError());
                
        Ruc ruc = new Ruc("1002456879001");
        
        System.out.println("Ruc: " + ruc.getRuc());
        System.out.println("Ruc: " + ruc.validar());
        System.out.println("Ruc: " + ruc.getError());
        
    }
    
}
