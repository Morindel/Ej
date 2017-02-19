package com.example.model;

import java.util.ArrayList;
import java.util.List;
public class EkspertPiwny {

	public static List getMarki(String kolor)
	{
		List marki = new ArrayList<>();
		if(kolor.equals("bursztynowy")){
			marki.add("Jack Amber");
			marki.add("Red Moose");
		}
		else {
			marki.add("Jail Pail Ale");
			marki.add("Gout Scout");
			
		}
		return marki;
	}
}
