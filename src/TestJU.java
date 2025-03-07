

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestJU {

	    private Document document;

	    @BeforeEach
	    void setUp() {
	        document = new Document("Titre Initial");
	    }

	    @Test
	    void testGetTitre() {
	        assertEquals("Titre Initial", document.getTitre(), "Le titre doit être 'Titre Initial'");
	    }

	    @Test
	    void testSetTitre() {
	        document.setTitre("Nouveau Titre");
	        assertEquals("Nouveau Titre", document.getTitre(), "Le titre doit être mis à jour à 'Nouveau Titre'");
	    }

	    @Test
	    void testToString() {
	        assertEquals("Titre Initial", document.toString(), "La méthode toString() ne renvoie pas le bon format");
	    }
	
}
