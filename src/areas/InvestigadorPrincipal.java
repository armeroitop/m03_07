/*
* Classe que defineix un Investigador/a Principal d'un Departament. 
* Es defineixen pel seu codi, nom,experiència en anys i sou 
 */
package areas;


/**
 *
 * @author itce
 */
public class InvestigadorPrincipal {

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


    /*
     TODO Heu d'implementar tots els mètodes accessors possibles.  
     */
   

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
   
    }
    

    public void showInvestigadorPrincipal() {
        System.out.println("\nLes dades de l'Investigador/a Principal amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nExperiencia: " + experiencia);
        System.out.print("\nSou: " + sou);
    }
}
