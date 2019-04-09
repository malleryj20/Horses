package com.horse;

public class Main {

    public static void main(String[] args) {
	Horse [] g = {new Horse("Timmy"), new Horse("Barbie"), null, new Horse("Jimmy")};
	HorseBarn a = new HorseBarn(g);
	HorseBarn b = a;
	b.setHorse(0, "Ron").setHorse(3, "Sammy");
	Horse [] f = {null, null, null, new Horse("Harold"), null};
	HorseBarn c = new HorseBarn(f);
	HorseBarn [] allBarns = {a, b, c};
	if (allBarns[0].getNumHorses() > allBarns[1].getNumHorses() && allBarns[0].getNumHorses() > allBarns[2].getNumHorses()){
	    System.out.println("A is biggest.");
    }
    else if (allBarns[1].getNumHorses() > allBarns[2].getNumHorses()){
        System.out.println("B is biggest.");
    }
    else
        System.out.println("C is biggest.");

    }
}
