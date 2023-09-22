/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Scanner;

/**
 *
 * @author Intel
 */
public class UtilsES {
    public static Scanner DADES = new Scanner(System.in);
    
    /**
     * Demana per consola una dada a introduir de tipus String
     * @param missatge Missatge que mostrarà per consola a la sol·licitud
     * @param missatgeError Missatge que mostrarà per consola si la dada introduïda és d'un tipus diferent de String
     * @return torna la dada introduïda
     */
    public static String demanarString(String missatge, String missatgeError) {
        System.out.println(missatge);
        String textIntroduit = DADES.nextLine();

        while (textIntroduit.isEmpty()) {
            System.out.println(missatgeError);
            System.out.println(missatge);
            textIntroduit = DADES.nextLine();
        }
        return textIntroduit;
    }
    
    /**
     * Demana per consola una dada a introduir de tipus Enter
     * @param missatge Missatge que mostrarà per consola a la sol·licitud
     * @param missatgeError Missatge que mostrarà per consola si la dada introduïda és d'un tipus diferent de Enter
     * @return torna la dada introduïda
     */
    public static int demanarEnter(String missatge, String missatgeError) {        
        int ret;
        boolean correcte;
        do {
            System.out.println(missatge);
            correcte = DADES.hasNextInt();            
            if (!correcte) {
                DADES.next();
                System.out.println(missatgeError);
            }
        } while (!correcte);
        ret = DADES.nextInt();
        DADES.nextLine();
        return ret;
    }
    
    /**
     * Demana per consola una dada a introduir de tipus double
     * @param missatge Missatge que mostrarà per consola a la sol·licitud
     * @param missatgeError Missatge que mostrarà per consola si la dada introduïda és d'un tipus diferent de double
     * @return torna la dada introduïda
     */
    public static double demanarDouble(String missatge, String missatgeError) {        
        double ret;
        boolean correcte;
        do {
            System.out.println(missatge);
            correcte = DADES.hasNextDouble();            
            if (!correcte) {
                DADES.next();
                System.out.println(missatgeError);
            }
        } while (!correcte);
        ret = DADES.nextDouble();
        DADES.nextLine();
        return ret;
    }
}
