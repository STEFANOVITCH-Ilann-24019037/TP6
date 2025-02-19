import java.util.Objects;

public class Personne implements Comparable<Personne> {
    private String prenom;
    private String nom;
    private String email;
    private static int compteur = 0;
    private int id;

    public Personne(String prenom, String nom, String email) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.id = ++compteur;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nom + " " + prenom + " (" + email + ")";
    }

    @Override
    public int compareTo(Personne o) {
        int result = this.nom.compareTo(o.nom);
        if (result == 0) {
            result = this.prenom.compareTo(o.prenom);
            if (result == 0) {
                result = this.email.compareTo(o.email);
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return nom.equals(personne.nom) &&
                prenom.equals(personne.prenom) &&
                email.equals(personne.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, email);
    }
}
