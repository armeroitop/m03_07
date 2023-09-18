/*
 * Classe que defineix un Departament. Un departament es defineix pel seu nom,
   el nom de l’àrea d’especialització, un array d’investigadors/es principals,
   un array d’investigadors/es associats i un array d’investigadors/es auxiliars
 */
package areas;


/**
 *
 * @author itcq
 */
public class Departament {

    private String nom;
    private String area;
    private InvestigadorAssociat[] investigadorsAssociats = new InvestigadorAssociat[100];
    private int pInvestigadorsAssociats = 0; //Primera posició buida de l'array d'investigadors associats
    private InvestigadorPrincipal[] investigadorsPrincipals = new InvestigadorPrincipal[100];
    private int pInvestigadorsPrincipals = 0; //Primera posició buida de l'array d'investigadors principals
    private InvestigadorAuxiliar[] investigadorsAuxiliars = new InvestigadorAuxiliar[100];
    private int pInvestigadorsAuxiliars = 0; //Primera posició buida de l'array d'investigadors auxiliars

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe, menys els arrays
    
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.    
     */


    /*
     TODO Heu d'implementar tots els mètodes accessors possibles.  
     */


    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear un nou Departament. 
       Les dades a demanar són les que necessita el constructor.
     
     Retorn: El nou Departament creat.
     */
    public static Departament addDepartament() {

    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades del Departament i
       modificar els atributs corresponents d'aquest Departament. Els únics
       atributs que modificarem són els que hem inicialitzat en el constructor
       amb els paràmetres passats.
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
     
    Retorn: cap
     */
    public void updateDepartament() {

    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Calcular la despesa total en sous del departament a partir dels sous
       dels investigadors del departament.
     
     Retorn: despesa total
     */
    public int calcularTotalDespesa() {

    }
    
    
    public void showDepartament() {
        System.out.println("\nLes dades del Departament " + nom + " són:");
        System.out.println("\nArea: " + area);
        System.out.println("\nDespesa Total: " + calcularTotalDespesa());
    }
    
    
    /*
     InvestigadorPrincipal
     */
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Afegeix un nou Investigador/a Principal a l'array d'investigadors principals
       del Departament actual si aquest/a no existeix. 
       Per afegir-lo heu de fer servir el mètode de la classe InvestigadorPrincipal
       escaient i per comprovar la seva existència el mètode d'aquesta classe
       que ens ajuda en aquesta tasca.
     - Actualitza la posició de l'array d'investigadors principals si s'afegeix.
     - Mostra el missatge "L'Investigador/a Principal ja existeix" si 
       no s'ha afegit.
    
     Retorn: cap
     */
    public void addInvestigadorPrincipal() {

    }

    public int selectInvestigadorPrincipal(String codi) {

        if (codi == null) {
            System.out.println("\nCodi de l'Investigador/a Principal?:");
            codi = DADES.next();
        }

        for (int i = 0; i < pInvestigadorsPrincipals; i++) {
            if (investigadorsPrincipals[i].getCodi().equals(codi)) {
                return i;
            }
        }

        return -1;
    }
    

   /*
     InvestigadorAssociat
     */
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Afegeix un nou Investigador/a Associat a l'array d'investigadors associats
       del Departament actual si aquest/a no existeix. 
       Per afegir-lo heu de fer servir el mètode de la classe InvestigadorAssociat
       escaient i per comprovar la seva existència el mètode d'aquesta classe
       que ens ajuda en aquesta tasca.
     - Actualitza la posició de l'array d'investigadors associats si s'afegeix.
     - Mostra el missatge "L'Investigador/a Associat ja existeix" si 
       no s'ha afegit.
    
     Retorn: cap
     */
    public void addInvestigadorAssociat() {

    }

    public int selectInvestigadorAssociat(String codi) {

        if (codi == null) {
            System.out.println("\nCodi de l'Investigador/a Associat?:");
            codi = DADES.next();
        }

        for (int i = 0; i < pInvestigadorsAssociats; i++) {
            if (investigadorsAssociats[i].getCodi().equals(codi)) {
                return i;
            }
        }

        return -1;
    }
    
    
    /*
     InvestigadorAuxiliar
     */
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Afegeix un nou Investigador/a Auxiliar a l'array d'investigadors auxiliars
       del Departament actual si aquest/a no existeix. 
       Per afegir-lo heu de fer servir el mètode de la classe InvestigadorAuxiliar
       escaient i per comprovar la seva existència el mètode d'aquesta classe
       que ens ajuda en aquesta tasca.
     - Actualitza la posició de l'array d'investigadors auxiliars si s'afegeix.
     - Mostra el missatge "L'Investigador/a Auxiliar ja existeix" si 
       no s'ha afegit.
    
     Retorn: cap
     */
    public void addInvestigadorAuxiliar() {

    }

    public int selectInvestigadorAuxiliar(String codi) {

        if (codi == null) {
            System.out.println("\nCodi de l'Investigador/a Auxiliar?:");
            codi = DADES.next();
        }

        for (int i = 0; i < pInvestigadorsAuxiliars; i++) {
            if (investigadorsAuxiliars[i].getCodi().equals(codi)) {
                return i;
            }
        }

        return -1;
    }

}
