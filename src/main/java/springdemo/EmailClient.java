package springdemo;

public class EmailClient {
	private SpellChecker spellChecker;
	public EmailClient(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public void sendEmail(String email) throws InterruptedException {
		spellChecker.spellCheck(email);
	}
}
