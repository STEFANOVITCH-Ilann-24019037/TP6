
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

    
    
    
    




        
   }


