
public class Sculpture extends Art {
	
	private String material;

	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}

	@Override
	void viewArt() {
		System.out.println(getTitle() + " by " + getAuthor() +  " (" + material + "): " + getDescription());

	}

}
