import java.util.Collection;
import java.util.*;

public class Mediatheque {
	

    private Collection<Document> documents;

    public Mediatheque(Collection<Document> documents) {
        this.documents = documents;
    }


    public Collection<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(Collection<Document> documents) {
        this.documents = documents;
    }

    @Override
    public String toString() {
    	
        StringBuilder sb = new StringBuilder();
        sb.append("Mediatheque : [");

        Iterator<Document> iterator = documents.iterator();
        
        while (iterator.hasNext()) {
            sb.append(iterator.next().getTitre());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
    public void trierDocuments() {
        // Vérification du type avant transtypage
        if (documents instanceof List) {
            Collections.sort((List<Document>) documents);
        } else {
            System.out.println("Impossible de trier : documents n'est pas une liste.");
        }
    }

    
    
    
    




        public static void main(String[] args) {
        	
            Document doc1 = new Document("1984");
            Document doc2 = new Document("Le Petit Prince");
            Document doc3 = new Document("La Peste");
            Document doc4 = new Document("L'Étranger");


            List<Document> docsList = Arrays.asList(doc1, doc2, doc3, doc4);

            
            Collection<Document> docs = new ArrayList<>(docsList);

            for (Document doc : docs) {
                System.out.println(doc);//meme chause que doc.toString
            }
            
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


        }
   }


