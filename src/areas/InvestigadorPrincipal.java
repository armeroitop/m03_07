/*
* Classe que defineix un Investigador/a Principal d'un Departament. 
* Es defineixen pel seu codi, nom,experiència en anys i sou 
 */
package areas;

import java.util.Scanner;
import biblioteca.UtilsES;

/**
 *
 * @author itce
 */
public class InvestigadorPrincipal {

    static final String MISSATGE_ERROR_DADES = "La selecció no és valida. Torneu-ho a intentar";
    static final String MISSATGE_DEMANAR_CODI = "Introdueix el codi del nou investigador principal";
    static final String MISSATGE_DEMANAR_NOM = "Introdueix el nom del nou investigador principal";
    static final String MISSATGE_DEMANAR_EXPERIENCIA = "Introdueix el nombre d'anys d'experiència del nou investigador  principal";
    static final String MISSATGE_DEMANAR_SOU = "Introdueix el salari del nou investigador principal";

    private String codi;
    private String nom;
    private int experiencia;
    private double sou;

    private static Scanner DADES = new Scanner(System.in);

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe.
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres.
     */
    public InvestigadorPrincipal(String _codi, String _nom, int _experiencia, double _sou) {
        this.codi = _codi;
        this.nom = _nom;
        this.experiencia = _experiencia;
        this.sou = _sou;
    }


    /*
     TODO Heu d'implementar tots els mètodes accessors possibles.  
     */
    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear un nou 
       Investigador/a Principal. Les dades a demanar són les que necessita 
       el constructor.
     - Heu de tenir en compte que el sou anual ha de ser un num positiu superior a
       30000 euros
     - Si tingués un sou inferior no seria Investigador Principal
     
     Retorn: Objecte Investigador/a Principal creat.
     */
    public static InvestigadorPrincipal addInvestigadorPrincipal() {
        //Solicitamos los datos
        String _codi = UtilsES.demanarString(MISSATGE_DEMANAR_CODI, MISSATGE_ERROR_DADES);
        String _nom = UtilsES.demanarString(MISSATGE_DEMANAR_NOM, MISSATGE_ERROR_DADES);
        int _experiencia = UtilsES.demanarEnter(MISSATGE_DEMANAR_EXPERIENCIA, MISSATGE_ERROR_DADES);
        double _sou = UtilsES.demanarDouble(MISSATGE_DEMANAR_SOU, MISSATGE_ERROR_DADES);

        //Hacemos la comprobación de rango de salario
        while (_sou < 30000) {
            System.out.println("\nAmb aquest salari no pot ser Investigador Principal.");
            _sou = UtilsES.demanarDouble(MISSATGE_DEMANAR_SOU, MISSATGE_ERROR_DADES);
        }
        return new InvestigadorPrincipal(_codi, _nom, _experiencia, _sou);
    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'Investigador Principal actual i
       modificar els atributs corresponents d'aquest Investigador Principal.
     - Heu de tenir en compte que el sou anual ha de ser un num positiu superior a
       30000 euros
     - Si tingués un sou inferior no seria Investigador Principal
     
     Retorn: cap
     */
    public void updateInvestigadorPrincipal() {
        //Solicitamos los datos
        String _codi = UtilsES.demanarString(MISSATGE_DEMANAR_CODI, MISSATGE_ERROR_DADES);
        String _nom = UtilsES.demanarString(MISSATGE_DEMANAR_NOM, MISSATGE_ERROR_DADES);
        int _experiencia = UtilsES.demanarEnter(MISSATGE_DEMANAR_EXPERIENCIA, MISSATGE_ERROR_DADES);
        double _sou = UtilsES.demanarDouble(MISSATGE_DEMANAR_SOU, MISSATGE_ERROR_DADES);

        //Hacemos la comprobación de rango de salario
        while (_sou < 30000) {
            System.out.println("\nAmb aquest salari no pot ser Investigador Principal.");
            _sou = UtilsES.demanarDouble(MISSATGE_DEMANAR_SOU, MISSATGE_ERROR_DADES);
        }
        //Actualizamos el objeto de la clase 
            this.setCodi(_codi);
            this.setNom(_nom);
            this.setExperiencia(_experiencia);
            this.setSou(_sou);        
    }

    public void showInvestigadorPrincipal() {
        System.out.println("\nLes dades de l'Investigador/a Principal amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nExperiencia: " + experiencia);
        System.out.print("\nSou: " + sou);
    }
}
