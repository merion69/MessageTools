package or.koushik.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import or.koushik.javabrains.messenger.db.DatabaseClass;
import or.koushik.javabrains.messenger.model.Message;
import or.koushik.javabrains.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();

 public ProfileService() {
	 
	 profiles.put("koushik", new Profile(1L, "koushik", "Koushik", "Kathagal"));
		
	}
	
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());

	}

	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfilName(), profile);
		return profile;

	}

	public Profile updateProfile(Profile profile) {
		if (profile.getProfilName().isEmpty() ) {
			return null;
		}
		profiles.put(profile.getProfilName(), profile);
		return profile;
	}

	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);
	}

}
