package or.koushik.javabrains.messenger.db;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import or.koushik.javabrains.messenger.model.Message;
import or.koushik.javabrains.messenger.model.Profile;

public class DatabaseClass {
	
	
	private static Map<Long, Message> messages = new HashMap<Long, Message>();
	private static Map<String, Profile> profiles = new HashMap<String, Profile>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
	
	
	

}
