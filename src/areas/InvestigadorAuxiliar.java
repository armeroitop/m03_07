/*
* Classe que defineix un Investigador/a Auxiliar d'un Departament. 
* Es defineixen pel seu codi, nom,experiència en anys i sou 
 */
package areas;

import biblioteca.UtilsES;

/**
 *
 * @author itca
 */
public class InvestigadorAuxiliar {

    static final String MISSATGE_ERROR_DADES = "La selecció no és valida. Torneu-ho a intentar";
    static final String MISSATGE_DEMANAR_CODI = "Introdueix el codi del nou investigador principal";
    static final String MISSATGE_DEMANAR_NOM = "Introdueix el nom del nou investigador principal";
    static final String MISSATGE_DEMANAR_EXPERIENCIA = "Introdueix el nombre d'anys d'experiència del nou investigador  principal";
    static final String MISSATGE_DEMANAR_SOU = "Introdueix el salari del nou investigador principal";

    private String codi;
    private String nom;
    private int experiencia;
    private double sou;

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe.   
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres.
     */
    public InvestigadorAuxiliar(String codi, String nom, int experiencia, double sou) {
        this.codi = codi;
        this.nom = nom;
        this.experiencia = experiencia;
        this.sou = sou;
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
    Investigador/a Auxiliar. Les dades a demanar són les que necessita
    el constructor.
    - Heu de tenir en compte que el sou anual ha de ser un num positiu superior a
    12000 euros però igual o inferior a 20000
    - Si tingués un sou diferent no seria Investigador Auxiliar
    Retorn: Objecte Investigador/a Auxiliar creat.
     */
    public static InvestigadorAuxiliar addInvestigadorAuxiliar() {
        //Solicitamos los datos
        String _codi = UtilsES.demanarString(MISSATGE_DEMANAR_CODI, MISSATGE_ERROR_DADES);
        String _nom = UtilsES.demanarString(MISSATGE_DEMANAR_NOM, MISSATGE_ERROR_DADES);
        int _experiencia = UtilsES.demanarEnter(MISSATGE_DEMANAR_EXPERIENCIA, MISSATGE_ERROR_DADES);
        double _sou = UtilsES.demanarDouble(MISSATGE_DEMANAR_SOU, MISSATGE_ERROR_DADES);
        
        //Hacemos la comprobación de rango de salario
        while ((_sou <= 12000) || (_sou >= 20000)) {
            System.out.println("\nAmb aquest salari no pot ser Investigador Auxiliar.");
            _sou = UtilsES.demanarDouble(MISSATGE_DEMANAR_SOU, MISSATGE_ERROR_DADES);
        }
        
        //Devolvemos el objeto creado
        return new InvestigadorAuxiliar(_codi, _nom, _experiencia, _sou);
    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'Investigador Auxiliar actual i
       modificar els atributs corresponents d'aquest Investigador Auxiliar.
     - Heu de tenir en compte que el sou anual ha de ser un num positiu superior a
       12000 euros però igual o inferior a 20000
     - Si tingués un sou diferent no seria Investigador Auxiliar
     
     Retorn: cap
     */
    public void updateInvestigadorAuxiliar() {
        //Solicitamos los datos
        String _codi = UtilsES.demanarString(MISSATGE_DEMANAR_CODI, MISSATGE_ERROR_DADES);
        String _nom = UtilsES.demanarString(MISSATGE_DEMANAR_NOM, MISSATGE_ERROR_DADES);
        int _experiencia = UtilsES.demanarEnter(MISSATGE_DEMANAR_EXPERIENCIA, MISSATGE_ERROR_DADES);
        double _sou = UtilsES.demanarDouble(MISSATGE_DEMANAR_SOU, MISSATGE_ERROR_DADES);

        while ((_sou <= 12000) || (_sou >= 20000)) {
            System.out.println("\nAmb aquest salari no pot ser Investigador Auxiliar.");
            _sou = UtilsES.demanarDouble(MISSATGE_DEMANAR_SOU, MISSATGE_ERROR_DADES);
        }
        //Actualizamos el objeto de la clase 
        this.setCodi(_codi);
        this.setNom(_nom);
        this.setExperiencia(_experiencia);
        this.setSou(_sou);
    }

    public void showInvestigadorAuxiliar() {
        System.out.println("\nLes dades de l'Investigador/a Auxiliar amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nExperiencia: " + experiencia);
        System.out.print("\nSou: " + sou);
    }
}
