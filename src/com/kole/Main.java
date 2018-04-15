package com.kole;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("220b", "Dell", "240", dimensions);

	    Monitor monitor = new Monitor("27inch", "Acer", 27, new Resolution(2540, 1440));
	    Motherboard theMotherboard = new Motherboard("lebac","acer",4,4,"somebios");

	    PC thePC = new PC(theCase,monitor,theMotherboard);
		thePC.powerUp();

    }
}
