/*
* Classe que defineix un Investigador/a Associat d'un Departament. 
* Es defineixen pel seu codi, nom,experiència en anys i sou 
 */
package areas;


/**
 *
 * @author itc
 */
public class InvestigadorAssociat {

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
       Investigador/a Associat. Les dades a demanar són les que necessita 
       el constructor.
     - Heu de tenir en compte que el sou anual ha de ser un num positiu superior a
       20000 euros però igual o inferior a 30000
     - Si tingués un sou diferent no seria Investigador Associat
     
     Retorn: Objecte Investigador/a Associat creat.
     */
    public static InvestigadorAssociat addInvestigadorAssociat() {
        
    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'Investigador Associat actual i
       modificar els atributs corresponents d'aquest Investigador Associat.
     - Heu de tenir en compte que el sou anual ha de ser un num positiu superior a
       20000 euros però igual o inferior a 30000
     - Si tingués un sou diferent no seria Investigador Associat
     
     Retorn: cap
     */
    public void updateInvestigadorAssociat() {
   
    }
    

    public void showInvestigadorAssociat() {
        System.out.println("\nLes dades de l'Investigador/a Associat amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nExperiencia: " + experiencia);
        System.out.print("\nSou: " + sou);
    }
}
