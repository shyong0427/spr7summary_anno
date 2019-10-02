package pack.model;

import java.util.Calendar;

import org.springframework.stereotype.Component;

@Component
public class HelloModel {
	public String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if(hour >= 6 && hour <= 10) return "좋은 아침!";
		else if(hour >= 12 && hour <= 15) return "점심 시간!";
		else if(hour >= 18 && hour <= 22) return "굿 나잇!";
		else return "Bye~";
	}
}