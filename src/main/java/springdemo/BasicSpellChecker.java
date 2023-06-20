package springdemo;

import java.util.concurrent.TimeUnit;

public class BasicSpellChecker implements SpellChecker{

	@Override
	public void spellCheck(String message) throws InterruptedException {
		// TODO Auto-generated method stub
		if(!message.isBlank()) {
			System.out.println("spelling check under process ->"+getClass().getSimpleName());
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
