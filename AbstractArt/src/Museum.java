public class Museum {

	public static void main(String[] args) {
		Painting paint1 = new Painting("Starry Night", "Van Gogh", "A swirling night sky", "Oil");
		Painting paint2 = new Painting("Mona Lisa", "Da Vinci", "A famous portrait smile", "Oil");
		Painting paint3 = new Painting("The Scream", "Munch", "A figure screaming on a bridge", "Tempera");

		Sculpture s = new Sculpture("David", "Michelangelo", "A hero standing ready", "Marble");
		Sculpture s1 = new Sculpture("The Thinker", "Rodin", "A man deep in thought", "Bronze");

		
		paint1.viewArt();
		paint2.viewArt();
		paint3.viewArt();
		
		s.viewArt();
		s1.viewArt();

	}

}