package doggo;

import java.util.ArrayList;

public class DoggoCompetition {

	public ArrayList<String> finishingPlace(int x) {

		ArrayList<String> finishingPlaces = new ArrayList<String>();

		for (int i = 1; i <= 100; i++) {
			if (i == x) {
				continue;
			}
			if (i % 10 == 1) {
				finishingPlaces.add(i + "st");
				System.out.println(i + "st");

			} else if (i % 10 == 2) {
				finishingPlaces.add(i + "nd");
				System.out.println(i + "nd");

			} else if (i % 10 == 3) {
				finishingPlaces.add(i + "rd");
				System.out.println(i + "rd");

			} else if (i == 100) {
				finishingPlaces.add(i + "th");
				System.out.println(i + "th");

			} else {
				System.out.println(i + "th");
				finishingPlaces.add(i + "th");
			}
		}
		return finishingPlaces;
	}
}
