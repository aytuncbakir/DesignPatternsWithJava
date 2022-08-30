package behavioral.visitor.populationoffice;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Citizen {

	private int id;
    private String name;
    private int age;
	private String gender;
	public Citizen(int id, String name, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	
}
