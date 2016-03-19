package or.koushik.javabrains.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	
	private long id;
	private  String profilName;
	private  String firstName;
	private String lastName;
	
	public Profile() {
		
	}
    
	
	
	public Profile(long id, String profilName, String firstName, String lastName) {
	
		this.id = id;
		this.profilName = profilName;
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfilName() {
		return profilName;
	}

	public void setProfilName(String profilName) {
		this.profilName = profilName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
