package coetura;

import java.util.ArrayList;
import java.util.List;

public class Mob {

	// BASE STATS
	int str = 15; // 0 - 300
	int end = 15;
	int cha = 15;
	int itl = 15;
	int agi = 15;
	int luk = 15;

	int sen = 15;
	int lib = 15;

	int hp = 100;
	int lust = 0;

	int coin = 0;
	int karma = 0;

	// APPEARANCE
	// General
	String name = "Default";
	Enum<Gender> gender = Gender.MALE;
	Enum<Race> race = Race.HUMAN;

	int height;
	int weight;
	int muscle;
	int hips;
	int butt;

	String skinColour = "White";

	String hairType = "Bald";
	String hairColour = "None";

	String tailType = "None";
	String tailColour = "None";

	String furType =  "None";
	String furColour = "None";

	// Sexual - Male
	List<Penis> penis = new ArrayList<Penis>();

	public enum Race {
		HUMAN, EQUUS, FELINAE, CANNIDAE, REPTILA, MONSTER
	}

	public enum Gender {
		MALE, FEMALE, HERM, OTHER
	}

}
