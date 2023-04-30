package sudo.core.altmanager;

public class Alt {
	private String email;
	private String username;
	private String password;
	private boolean microsoft = false;
	private boolean isCracked = false;

	public Alt(String email, String password, boolean microsoft) {
		this.email = email;
		this.password = password;
		this.microsoft = microsoft;
		// If no password is entered, assume the account is a cracked account.
		if(this.password.isEmpty()) {
			this.isCracked = true;
		}
	}

	public Alt(String email, String password, String username, boolean microsoft) {
		this.email = email;
		this.password = password;
		this.username = username;
		this.microsoft = microsoft;
		// If no password is entered, assume the account is a cracked account.
		if(this.password.isEmpty()) {
			this.isCracked = true;
		}
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		if(this.username == null) {
			return "";
		}
		return this.username;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

	public boolean isCracked() {
		return this.isCracked;
	}

	public boolean isMicrosoft() {
		return this.microsoft;
	}
}
