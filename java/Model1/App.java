import java.util.*;
public class App{



	public static void main(String[] args) {
		Cours c = new Cours();
		Administrateur a = new Administrateur("dupont","jean","99 av d'occitanie","jean.dupont@umontpellier.fr");
		Etudiants e1 = new Etudiants(1234, "D","J", "rue de la loge","JD@etu.umontpellier.fr");
		Etudiants e2 = new Etudiants(5678, "R","H", "en haut de l'arbre","RH@etu.umontpellier.fr");
		Enseignants p1 = new Enseignants("sghet","dfb","ted","li", "2eme etage de la tour eiffel","ted.li@etu.umontpellier.fr");
		Enseignants p2 = new Enseignants("trh","dfv","jp","mas", "chez tom and jerry","jp.mas@etu.umontpellier.fr");
		Devoir d1 = new Devoir("maths", "exercice", 25/12/21,10, e1);
		Devoir d2 = new Devoir("Algo", "récursivité, diviser pour reignier", 27/9/21,15, e2);

	}

}	