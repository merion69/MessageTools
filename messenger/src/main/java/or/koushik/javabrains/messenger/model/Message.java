package or.koushik.javabrains.messenger.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Message {
	private long id;
	private String messge;
	private String author;
	private Date created;
	
	private Map<Long, Comment> comments = new HashMap<>();
	
	public Message() {
		
	}
	
	
	public Message(long id, String messge, String author) {
		super();
		this.id = id;
		this.messge = messge;
		this.author = author;
		this.created = new Date();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessge() {
		return messge;
	}
	public void setMessge(String messge) {
		this.messge = messge;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}


	public Map<Long, Comment> getComments() {
		return comments;
	}


	public void setComments(Map<Long, Comment> comments) {
		this.comments = comments;
	}
	
	

}
