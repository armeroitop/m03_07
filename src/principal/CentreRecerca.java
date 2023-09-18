/*
 * Classe que defineix un Centre Recerca. Un Centre de Recerca es defineix pel seu nom,
 * el nom de la seva ubicació i un array de departaments.
 */
package principal;

import areas.Departament;

/**
 *
 * @author itc
 */
public class CentreRecerca {

    private String nom;
    private String ubicacio;
    private Departament[] departaments = new Departament[5];
    private int pDepartaments = 0; //Primera posició buida de l'array de Departaments

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe menys els arrays.
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres..
     */


    /*
     TODO Heu d'implementar tots els mètodes accessors possibles.
     */
    

    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear un nou Centre Recerca.
       Les dades a demanar són les que necessita el constructor.
     
     Retorn: El nou Centre Recerca creat.
     */
    public static CentreRecerca addCentreRecerca() {

    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades del Centre Recerca i
       modificar els atributs corresponents d'aquest Centre Recerca. 
       Els únics atributs que modificarem
       són els que hem inicialitzat en el constructor amb els paràmetres passats.
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
     
    Retorn: cap
     */
    public void updateCentreRecerca() {

    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Calcular la despesa total en sous del Centre Recerca a partir de les despeses
       dels departaments.
     
     Retorn: Despesa total
     */
    public double calcularTotalDespesa() {

    }

    public void showCentreRecerca() {
        System.out.println("\nLes dades del Centre Recerca " + nom + " són:");
        System.out.println("\nUbicació: " + ubicacio);
        System.out.println("\nDespesa Total: " + calcularTotalDespesa());
    }

    /*
     Departament
     */
 /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Afegeix un nou Departament a l'array de Departaments del Centre Recerca
       si aquest no existeix. 
       Per afegir-lo heu de fer servir el mètode de la classe Departament escaient
       i per comprovar la seva existència el mètode d'aquesta classe que ens
       ajuda en aquesta tasca.
     - Actualitza la posició de l'array de Departaments si s'afegeix el Departament.
     - Mostra el missatge "El Departament ja existeix" si no s'ha afegit.
    
     Retorn: cap
     */
    public void addDepartament() {

    }

    public int selectDepartament(String nom) {

        if (nom == null) {
            System.out.println("\nNom del Departament?:");
            nom = DADES.nextLine();
        }

        for (int i = 0; i < pDepartaments; i++) {
            if (departaments[i].getNom().equals(nom)) {
                return i;
            }
        }

        return -1;
    }
    

    public void addInvestigadorPrincipalDepartament() {

        int index = selectDepartament(null);

        if (index != -1) {

            departaments[index].addInvestigadorPrincipal();

        } else {

            System.out.println("\nEl Departament no existeix");

        }

    }

    public void updateInvestigadorPrincipalDepartament() {

        int indexDepartament = selectDepartament(null);

        if (indexDepartament != -1) {

            int indexInvestigadorPrincipal = departaments[indexDepartament].selectInvestigadorPrincipal(null);

            if (indexInvestigadorPrincipal != -1) {

                departaments[indexDepartament].getInvestigadorsPrincipals()[indexInvestigadorPrincipal].updateInvestigadorPrincipal();

            } else {

                System.out.println("\nL'Investigador/a Principal no existeix");

            }

        } else {

            System.out.println("\nEl Departament no existeix");

        }

    }

    public void addInvestigadorAssociatDepartament() {

        int index = selectDepartament(null);

        if (index != -1) {

            departaments[index].addInvestigadorAssociat();

        } else {

            System.out.println("\nEl Departament no existeix");

        }

    }

    public void updateInvestigadorAssociatDepartament() {

        int indexDepartament = selectDepartament(null);

        if (indexDepartament != -1) {

            int indexInvestigadorAssociat = departaments[indexDepartament].selectInvestigadorAssociat(null);

            if (indexInvestigadorAssociat != -1) {

                departaments[indexDepartament].getInvestigadorsAssociats()[indexInvestigadorAssociat].updateInvestigadorAssociat();

            } else {

                System.out.println("\nL'Investigador/a Associat no existeix");

            }

        } else {

            System.out.println("\nEl Departament no existeix");

        }

    }

    public void addInvestigadorAuxiliarDepartament() {

        int index = selectDepartament(null);

        if (index != -1) {

            departaments[index].addInvestigadorAuxiliar();

        } else {

            System.out.println("\nEl Departament no existeix");

        }

    }

    public void updateInvestigadorAuxiliarDepartament() {

        int indexDepartament = selectDepartament(null);

        if (indexDepartament != -1) {

            int indexInvestigadorAuxiliar = departaments[indexDepartament].selectInvestigadorAuxiliar(null);

            if (indexInvestigadorAuxiliar != -1) {

                departaments[indexDepartament].getInvestigadorsAuxiliars()[indexInvestigadorAuxiliar].updateInvestigadorAuxiliar();

            } else {

                System.out.println("\nL'Investigador/a Auxiliar no existeix");

            }

        } else {

            System.out.println("\nEl Departament no existeix");

        }

    }

}
