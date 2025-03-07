

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class main {
	
	public static void main(String[] args) {
    	
        Document doc1 = new Document("1984");
        Document doc2 = new Document("Le Petit Prince");
        Document doc3 = new Document("La Peste");
        Document doc4 = new Document("L'Étranger");
        Document doc41 = new Document("L'Etranger");


        List<Document> docsList = Arrays.asList(doc1,doc41, doc2, doc3, doc4);
        Collection<Document> docs = new ArrayList<>(docsList);

        
        System.out.println(docs);
        
        System.out.println("Type dynamique de docs : " + docs.getClass().getName());

        for (Document doc : docs) {
            System.out.println(doc);
        }

        System.out.println(" ");// pour avoir un espace

     // Création de l'objet Mediatheque avec la collection de documents
        Mediatheque mediatheque = new Mediatheque(docs);

        // Affichage du contenu de la médiathèque
        for (Document doc : mediatheque.getDocuments()) {
            System.out.println(doc);
        }
        System.out.println(" ");
        System.out.println(mediatheque);

     // Création de 2 nouveaux documents
        Document doc5 = new Document("Harry Potter");
        Document doc6 = new Document("Le Seigneur des Anneaux");

        // Ajout des nouveaux documents à la médiathèque
        mediatheque.getDocuments().add(doc5);
        mediatheque.getDocuments().add(doc6);
        System.out.println("Après ajout : " + mediatheque);

     // Création de 3 nouveaux documents
        Document doc7 = new Document("La Divine Comédie");
        Document doc8 = new Document("Don Quichotte");
        Document doc9 = new Document("Les Misérables");

        // On les range dans une nouvelle ArrayList
        Collection<Document> newDocs = new ArrayList<>(Arrays.asList(doc7, doc8, doc9));

        // Ajout en masse à la médiathèque
        mediatheque.getDocuments().addAll(newDocs);

        // Vérification du contenu de la médiathèque
        System.out.println("Après ajout de masse : " + mediatheque);

        System.out.println("Avant tri : " + mediatheque);
        
        mediatheque.trierDocuments();
        
        System.out.println("Après tri : " + mediatheque);

        Document doc12 = new Document ( " 1984 " ) , doc22 = new Document ( " La Peste " ) ,
                doc32 = new Document ( " 1984 " ) , doc42 = new Document ( " Green patterns " );

        System . out . printf ( " Coherence x . compareTo ( y ) et x . equalsy () " +
                        " pour doc1 \"%s\" et doc3 \"%s\" : %d et %b\n" , doc12 . getTitre () ,
                doc32 . getTitre () , doc12 . compareTo ( doc32 ) , doc12.equals ( doc32 ));
        
        
        Auteur auteur1 = new Auteur("Jean" ,"Stean","EmailDeJean");
        Auteur auteur2 = new Auteur("Piere" ,"Stean","EmailDePiere");

        System.out.println(auteur1.compareTo(auteur2));
        System.out.println(auteur1.equals(auteur2));
        System.out.println(auteur1 +" et sont frére "+auteur2);

        DocAvecAuteur doc1333 = new DocAvecAuteur("JeanEtCaVie",auteur1);
        DocAvecAuteur doc122 = new DocAvecAuteur("JeSuisPlusFortQueJean",auteur2);
        System.out.println(doc1333.compareTo(doc122));
        System.out.println(doc1333.equals(doc122));
        System.out.println(doc1333);
        System.out.println(doc122);

       
    }	
}
