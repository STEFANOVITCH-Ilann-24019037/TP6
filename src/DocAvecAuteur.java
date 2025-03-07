
import java.util.Objects;

public class DocAvecAuteur extends Document {
    // Attribut pour l'auteur du document
    private Auteur auteur;

    // Constructeur avec titre et auteur
    public DocAvecAuteur(String titre, Auteur auteur) {
        super(titre);
        this.auteur = auteur;
    }

    // Getter pour l'auteur
    public Auteur getAuteur() {
        return auteur;
    }

    // Setter pour l'auteur
    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    // Redéfinition de toString() pour afficher le titre et l'auteur
    @Override
    public String toString() {
        return super.toString() + " - " + auteur;
    }

    // On utilise Comparable<Document> hérité de Document
    @Override
    public int compareTo(Document o) {
        // Si l'autre document est aussi un DocAvecAuteur, on compare aussi l'auteur
        if (o instanceof DocAvecAuteur) {
            DocAvecAuteur autreDoc = (DocAvecAuteur) o;
            int result = super.compareTo(autreDoc);
            if (result == 0) {
                result = this.auteur.compareTo(autreDoc.auteur);
            }
            return result;
        }
        // Sinon, on utilise le compareTo() de Document
        return super.compareTo(o);
    }

    // Redéfinition de equals() pour vérifier titre + auteur
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DocAvecAuteur)) return false;
        if (!super.equals(o)) return false;
        DocAvecAuteur that = (DocAvecAuteur) o;
        return auteur.equals(that.auteur);
    }

    // Redéfinition de hashCode() pour la cohérence avec equals()
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), auteur);
    }

   
}
