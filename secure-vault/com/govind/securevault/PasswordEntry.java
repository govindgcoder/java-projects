import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordEntry {
	private final String site;
	private final String username;
	private final String password;
	
	//basic encoding of the string by converting it to base64 and then reversing it.
	private String encode(String password){
		Encoder encoder = Base64.getEncoder();
		String str = new String(encoder.encode(password.getBytes()));
		StringBuilder strBuilder = new StringBuilder(str);
		String result = strBuilder.reverse().toString();
		return result;
	}
	//constructor:
	public PasswordEntry(String site, String username, String password){
		if (site == null || username == null || password == null){
			throw new IllegalArgumentException("null values");
		}
		if(site.isEmpty()) throw new IllegalArgumentException("site field is empty");
		this.site=site;
		if(username.isEmpty()) throw new IllegalArgumentException("username is empty");
		this.username=username;
		if(password.isEmpty()) throw new IllegalArgumentException("password is empty");
		this.password=encode(password);
	}
	//getter methods:
	public String toString(){
		 String info = String.format("||Password entry for site: %s, username: %s||", this.site, this.username);
		 return info;
	}
	
	public String getSite(){
		return this.site;
	}
	
	public String getUsername(){
		return this.username;
	}
	
	public String getPassword(){
		return this.password;
	}
}