
public class Painting extends Art {
	
	private String paintType;

	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType =paintType;
	}

	@Override
	void viewArt() {
		System.out.println(getTitle() + " by " + getAuthor() + " (" + paintType + "): " + getDescription());
	}

}
