package principal;

import areas.*;
import biblioteca.UtilsES;
import java.util.Scanner;

/**
 *
 * @author itc
 */
public class Application {

    static final String MISSATGE_ERROR_DADES = "La selecció no és valida. Torneu-ho a intentar";

    private static CentreRecerca[] centresRecerca = new CentreRecerca[10];
    private static int pCentresRecerca = 0; //Primera posició buida del vector centresRecerca
    private static CentreRecerca centreRecercaActual = null;

    private static Scanner DADES = new Scanner(System.in);

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        int opcio = 0;

        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Gestió Centres Recerca");
            System.out.println("\n2. Gestió Departaments");
            System.out.println("\n3. Gestió Investigadors/es Principals");
            System.out.println("\n4. Gestió Investigadors/es Associats");
            System.out.println("\n5. Gestió Investigadors/es Auxiliars");
            opcio = DADES.nextInt();

            switch (opcio) {
                case 0:
                    break;
                case 1:
                    menuCentresRecerca();
                    break;
                case 2:
                    if (centreRecercaActual != null) {
                        menuDepartaments();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                case 3:
                    if (centreRecercaActual != null) {
                        menuInvestigadorsPrincipals();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                case 4:
                    if (centreRecercaActual != null) {
                        menuInvestigadorsAssociats();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                case 5:
                    if (centreRecercaActual != null) {
                        menuInvestigadorsAuxiliars();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    public static void menuCentresRecerca() {
        int opcio;

        do {
            int indexSel;
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Seleccionar");
            System.out.println("\n3. Modificar");
            System.out.println("\n4. Llista Centres Recerca");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    CentreRecerca nouCentreRecerca = CentreRecerca.addCentreRecerca();

                    indexSel = selectCentreRecerca(nouCentreRecerca);

                    if (indexSel == -1) {
                        centresRecerca[pCentresRecerca] = nouCentreRecerca;
                        pCentresRecerca++;
                    } else {
                        System.out.println("\nEl Centre Recerca ja existeix");
                    }

                    break;
                case 2:
                    indexSel = selectCentreRecerca(null);
                    if (indexSel >= 0) {
                        centreRecercaActual = centresRecerca[indexSel];
                    } else {
                        System.out.println("\nNo existeix aquest Centre Recerca");
                    }
                    break;
                case 3:
                    indexSel = selectCentreRecerca(null);
                    if (indexSel >= 0) {
                        centresRecerca[indexSel].updateCentreRecerca();
                    } else {
                        System.out.println("\nNo existeix aquest Centre Recerca");
                    }
                    break;
                case 4:
                    for (int i = 0; i < pCentresRecerca; i++) {
                        centresRecerca[i].showCentreRecerca();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    /*
     TODO Heu de desenvolupar el menuDepartaments amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, l'atribut centreRecercaActual no és null
       
     Opció 0. Sortir -->       Surt del menú i retorna al menú principal
     Opció 1. Alta -->         Crea un Departament del Centre Recerca actual. Penseu que CentreRecerca sap crear Departaments        
     Opció 2. Modificar -->    Permet modificar un Departament del Centre Recerca actual.
     (per comprovar l'existència del Departament tenim un mètode en la classe CentreRecerca que ens ajuda)
     Opció 3. Llista Departaments --> Imprimeix les dades dels Departaments del Centre Recerca actual
        
     A més, heu de fer una estructura iterativa per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     Recomanacions:
     - estructura de control switch-case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge
     "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable opcio de tipus enter
     */
    public static void menuDepartaments() {
        int opcio;
        do {
            int indexSel;
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llista Departaments");
            opcio = UtilsES.demanarEnter("", MISSATGE_ERROR_DADES);
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    if (centreRecercaActual != null) {
                        centreRecercaActual.addDepartament();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                case 2:
                    System.out.println("\nImplementa el MODIFICAR.");
                    if (centreRecercaActual != null) {
                        indexSel = centreRecercaActual.selectDepartament(null);
                        if (indexSel >= 0) {
                            Departament[] tmpDepartaments = centreRecercaActual.getDepartaments();
                            tmpDepartaments[indexSel].updateDepartament();
                        } else {
                            System.out.println("\nNo existeix aquest Centre Recerca");
                        }
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                case 3:
                    System.out.println("\nImplementa el LLISTAR.");
                    if (centreRecercaActual != null) {
                        Departament[] tmpDepartaments = centreRecercaActual.getDepartaments();
                        for (Departament tmpDepartament : tmpDepartaments) {
                            if (tmpDepartament != null) {
                                tmpDepartament.showDepartament();
                            }
                        }
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;

                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    /*
     TODO Heu de desenvolupar el menuInvestigadorsPrincipals amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, l'atribut centreRecercaActual no és null
       
     Opció 0. Sortir -->       Surt del menú i retorna al menú principal
     Opció 1. Alta -->         Crea un/a Investigador/a Principal del Centre Recerca actual afegint-lo/a a un Departament. 
                               Penseu que CentreRecerca sap afegir un/a Investigador/a Principal a un Departament seleccionat.       
     Opció 2. Modificar -->    Permet modificar un/a Investigador/a Principal del Centre Recerca actual. Penseu que tots/es els/les 
                               Investigadors/es Principals d'un Centre Recerca pertanyen a un departament d'aquest Centre Recerca i que 
                               CentreRecerca sap modificar un/a Investigador/a Principal que pertany a un dels seus Departaments.
     Opció 3. Llista Investigadors Principals --> Imprimeix les dades de tots/es Investigadors/es Principals del Centre Recerca actual.
        
     A més, heu de fer una estructura iterativa per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     
     Recomanacions:
     - estructura de control switch-case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable opcio de tipus enter
     */
    public static void menuInvestigadorsPrincipals() {
        int opcio;
        do {
            int indexSel;
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llista Investigadors Principals");
            opcio = UtilsES.demanarEnter("", MISSATGE_ERROR_DADES);
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    if (centreRecercaActual != null) {
                        try {
                            centreRecercaActual.addInvestigadorPrincipalDepartament();
                        } catch (Exception e) {
                            System.out.println("\n exception " + e);
                        }
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                case 2:
                    if (centreRecercaActual != null) {
                        //Solicitamos departamento
                        int tmpIndexDepartament = centreRecercaActual.selectDepartament(null);
                        //Del departamento solicitado nos traemos al array de investigadores principales y solicitamos al usuario el codigo del que quiere actualizar
                        Departament[] tmpDepartaments = centreRecercaActual.getDepartaments();
                        InvestigadorPrincipal[] tmpInvestigadorsPrincipals = tmpDepartaments[tmpIndexDepartament].getInvestigadorsPrincipals();
                        int tmpIndexInvestigadorPrincipal = tmpDepartaments[tmpIndexDepartament].selectInvestigadorPrincipal(null);
                        //Actualizamos al seleccionado
                        tmpInvestigadorsPrincipals[tmpIndexInvestigadorPrincipal].updateInvestigadorPrincipal();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                case 3:
                    if (centreRecercaActual != null) {
                        //Solicitamos departamento
                        int tmpIndexDepartament = centreRecercaActual.selectDepartament(null);
                        //Del departamento solicitado nos traemos al array de investigadores principales
                        Departament[] tmpDepartaments = centreRecercaActual.getDepartaments();
                        InvestigadorPrincipal[] tmpInvestigadorsPrincipals = tmpDepartaments[tmpIndexDepartament].getInvestigadorsPrincipals();
                        //Recorremos el array/tabla mostrando los datos de cada uno
                        for (InvestigadorPrincipal investigadorsPrincipal : tmpInvestigadorsPrincipals) {
                            if (investigadorsPrincipal != null) {
                                investigadorsPrincipal.showInvestigadorPrincipal();
                            }
                        }
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    /*
     TODO Heu de desenvolupar el menuInvestigadorsAssociats amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, l'atribut centreRecercaActual no és null
       
     Opció 0. Sortir -->       Surt del menú i retorna al menú principal
     Opció 1. Alta -->         Crea un/a Investigador/a Associat del Centre Recerca actual afegint-lo/a a un Departament. 
                               Penseu que CentreRecerca sap afegir un/a Investigador/a Associat a un Departament seleccionat.       
     Opció 2. Modificar -->    Permet modificar un/a Investigador/a Associat del Centre Recerca actual. Penseu que tots/es els/les 
                               Investigadors/es Associats d'un Centre Recerca pertanyen a un departament d'aquest Centre Recerca i que 
                               CentreRecerca sap modificar un/a Investigador/a Associat que pertany a un dels seus Departaments.
     Opció 3. Llista Investigadors Associats --> Imprimeix les dades de tots/es Investigadors/es Associats del Centre Recerca actual.
        
     A més, heu de fer una estructura iterativa per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     
     Recomanacions:
     - estructura de control switch-case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable opcio de tipus enter
     */
    public static void menuInvestigadorsAssociats() {
        int opcio;
        do {
            int indexSel;
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llista Investigadors Principals");
            opcio = UtilsES.demanarEnter("", MISSATGE_ERROR_DADES);
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    if (centreRecercaActual != null) {
                        try {
                            centreRecercaActual.addInvestigadorAssociatDepartament();
                        } catch (Exception e) {
                            System.out.println("\n exception " + e);
                        }
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                case 2:                    
                    if (centreRecercaActual != null) {
                        //Solicitamos departamento
                        int tmpIndexDepartament = centreRecercaActual.selectDepartament(null);
                        //Del departamento solicitado nos traemos al array de investigadores Associat y solicitamos al usuario el codigo del que quiere actualizar
                        Departament[] tmpDepartaments = centreRecercaActual.getDepartaments();
                        InvestigadorAssociat[] tmpInvestigadorsAssociats = tmpDepartaments[tmpIndexDepartament].getInvestigadorsAssociats();
                        int tmpIndexInvestigadorAssociat = tmpDepartaments[tmpIndexDepartament].selectInvestigadorAssociat(null);
                        //Actualizamos al seleccionado
                        tmpInvestigadorsAssociats[tmpIndexInvestigadorAssociat].updateInvestigadorAssociat();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                case 3:
                    if (centreRecercaActual != null) {
                        //Solicitamos departamento
                        int tmpIndexDepartament = centreRecercaActual.selectDepartament(null);
                        //Del departamento solicitado nos traemos al array de investigadores principales
                        Departament[] tmpDepartaments = centreRecercaActual.getDepartaments();
                        InvestigadorAssociat[] tmpInvestigadorsAssociats = tmpDepartaments[tmpIndexDepartament].getInvestigadorsAssociats();
                        //Recorremos el array/tabla mostrando los datos de cada uno
                        for (InvestigadorAssociat investigadorsAssociat : tmpInvestigadorsAssociats) {
                            if (investigadorsAssociat != null) {
                                investigadorsAssociat.showInvestigadorAssociat();
                            }
                        }
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    /*
     TODO Heu de desenvolupar el menuInvestigadorsAuxiliars amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, l'atribut centreRecercaActual no és null
       
     Opció 0. Sortir -->       Surt del menú i retorna al menú principal
     Opció 1. Alta -->         Crea un/a Investigador/a Auxiliar del Centre Recerca actual afegint-lo/a a un Departament. 
                               Penseu que CentreRecerca sap afegir un/a Investigador/a Auxiliar a un Departament seleccionat.       
     Opció 2. Modificar -->    Permet modificar un/a Investigador/a Auxiliar del Centre Recerca actual. Penseu que tots/es els/les 
                               Investigadors/es Auxiliars d'un Centre Recerca pertanyen a un departament d'aquest Centre Recerca i que 
                               CentreRecerca sap modificar un/a Investigador/a Auxiliar que pertany a un dels seus Departaments.
     Opció 3. Llista Investigadors Auxiliars --> Imprimeix les dades de tots/es Investigadors/es Auxiliars del Centre Recerca actual.
        
     A més, heu de fer una estructura iterativa per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     
     Recomanacions:
     - estructura de control switch-case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable opcio de tipus enter
     */
    public static void menuInvestigadorsAuxiliars() {
        int opcio;
        do {
            int indexSel;
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llista Investigadors Principals");
            opcio = UtilsES.demanarEnter("", MISSATGE_ERROR_DADES);
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    if (centreRecercaActual != null) {
                        try {
                            centreRecercaActual.addInvestigadorAuxiliarDepartament();
                        } catch (Exception e) {
                            System.out.println("\n exception " + e);
                        }
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                case 2:                    
                    if (centreRecercaActual != null) {
                        //Solicitamos departamento
                        int tmpIndexDepartament = centreRecercaActual.selectDepartament(null);
                        //Del departamento solicitado nos traemos al array de investigadores Auxiliar y solicitamos al usuario el codigo del que quiere actualizar
                        Departament[] tmpDepartaments = centreRecercaActual.getDepartaments();
                        InvestigadorAuxiliar[] tmpInvestigadorsAuxiliars = tmpDepartaments[tmpIndexDepartament].getInvestigadorsAuxiliars();
                        int tmpIndexInvestigadorAuxiliar = tmpDepartaments[tmpIndexDepartament].selectInvestigadorAssociat(null);
                        //Actualizamos al seleccionado
                        tmpInvestigadorsAuxiliars[tmpIndexInvestigadorAuxiliar].updateInvestigadorAuxiliar();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                case 3:
                    if (centreRecercaActual != null) {
                        //Solicitamos departamento
                        int tmpIndexDepartament = centreRecercaActual.selectDepartament(null);
                        //Del departamento solicitado nos traemos al array de investigadores Auxiliar
                        Departament[] tmpDepartaments = centreRecercaActual.getDepartaments();
                        InvestigadorAuxiliar[] tmpInvestigadorsAuxiliars = tmpDepartaments[tmpIndexDepartament].getInvestigadorsAuxiliars();
                        //Recorremos el array/tabla mostrando los datos de cada uno
                        for (InvestigadorAuxiliar investigadorsAuxiliar : tmpInvestigadorsAuxiliars) {
                            if (investigadorsAuxiliar != null) {
                                investigadorsAuxiliar.showInvestigadorAuxiliar();
                            }
                        }
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);

    }

    public static Integer selectCentreRecerca(CentreRecerca centreRecerca) {

        String nom;

        if (centreRecerca == null) {
            System.out.println("\nNom del Centre Recerca?:");
            DADES.nextLine(); //Neteja buffer
            nom = DADES.nextLine();
        } else {

            nom = centreRecerca.getNom();
        }

        for (int i = 0; i < pCentresRecerca; i++) {
            if (centresRecerca[i].getNom().equals(nom)) {
                return i;
            }
        }

        return -1;
    }
}
