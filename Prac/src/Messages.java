
public class Messages {
	private String Subject;
	private String body;
	private Users Sender;
	private Users Receiver;
	
	public Messages(String subject, String body, Users sender, Users receiver) {
		super();
		Subject = subject;
		this.body = body;
		Sender = sender;
		Receiver = receiver;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Users getSender() {
		return Sender;
	}

	public void setSender(Users sender) {
		Sender = sender;
	}

	public Users getReceiver() {
		return Receiver;
	}

	public void setReceiver(Users receiver) {
		Receiver = receiver;
	}
	
	
}
