package entities;

public class Student {
	
	private int id;
	private String lastName;
	private String firstName;
	private String mail;
	private String githubURL;
	private String pathPhoto;
	
	public Student(int id, String lastName, String firstName, String mail, String githubURL, String pathPhoto) {
		this.id =id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.mail = mail;
		this.githubURL = githubURL;
		this.pathPhoto = pathPhoto;
	}
	
	public int getId() {
		return id;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getMail() {
		return mail;
	}
	
	public String getGithubURL() {
		return githubURL;
	}
	
	public String getPathPhoto() {
		return pathPhoto;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public void setGithubURL(String githubURL) {
		this.githubURL = githubURL;
	}
	
	public void setPathPhoto(String pathPhoto) {
		this.pathPhoto = pathPhoto;
	}
}