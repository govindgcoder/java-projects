import java.util.HashMap;
import java.util.Map;

public class Vault {

	Map<String, PasswordEntry> passwords = new HashMap<String, PasswordEntry>();

	public static void main(String args[]) {
		try {
			Vault myVault = new Vault();

			PasswordEntry google = new PasswordEntry(
				"google.com",
				"myUser",
				"Secret123"
			);

			myVault.add(google);

			System.out.println("Retrieved: " + myVault.getPassword("google.com"));
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public void add(PasswordEntry entry) {
		passwords.put(entry.getSite(), entry);
	}

	public String getPassword(String site) {
		if (!passwords.containsKey(site)) {
            return null;
        }
      return passwords.get(site).getPassword();
	}
}
