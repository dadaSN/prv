package com.objis.demostruts;

/**
 * <p>C'est le composant 'Mod�le' qui cotient simplement le nom de la personne � qui on va dire "Hello!".
 * <p>
 *
 * Dans une application plus avanc�e, ce composant mettrait � jour un stockage persistant
 * avec le nom de la personne, l'utiliserai comme argument d'appel � un POJO, un DAO 
 * ou l'enverrait pour traitement dans un syst�me distant (Service web, EJB..).
 *
 * @author Douglas MBIANDOU
 */

public class HelloModel {

    // --------------------------------------------------- Instance Variables

    /**
     * La personne � qui on va dire "Hello!"
     */
    private String _person = null;

    // ----------------------------------------------------------- Properties

    /**
     * Retourne la nouvelle personne � qui on va dire "Hello!"
     *
     * @return String la nouvelle personne � qui on va dire "Hello!"
     */
    public String getPerson() {
        return this._person;
    }

    /**
     * Initialise La personne � qui on va dire "Hello!"
     *
     * @param person La nouvelle personne � qui on va dire "Hello!"
     */
    public void setPerson(String person) {

        this._person = person;

    }

    // --------------------------------------------------------- Methodes publiques

    /**
     * C'est le squelette de la m�thode qu'on utiliserait pour le mod�le pour sauver
     * l'information entr�e dans un stockage persistent. 
     * Dans cette application simple, ce n'est pas utilis�.
     */
    public void saveToPersistentStore() {

        /*
         * Dans une application r�elle, c'est ici qu'il faudrait mettre le code pour la persistance (Ex avec Hibernate).
         *
         * Les op�rations m�tier d�pendentde l'application.
         */
    }



}
