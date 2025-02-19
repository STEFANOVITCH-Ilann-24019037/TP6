
public class Document implements Comparable<Document> {
    private String titre;

    public Document(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return titre;
    }

    @Override
    public int compareTo(Document o) {
        return this.titre.compareTo(o.titre);
    }


	
	public static void main(String[] args) {
		Document doc1 = new Document("LeChat");
		Document doc2 = new Document("LeChien");
		Document doc3 = new Document("simples");
		Document doc4 = new Document("PasSimples");
		
		System.out.println(doc1.getTitre());
		doc1.setTitre("Voiala");
		System.out.println(doc1.getTitre());
		System.out.println(doc2.toString());
		System.out.println(doc3.toString());
		System.out.println(doc4.toString());
	}
	
	

}
