package application;

import chadrez.PartidaChadrez;

public class Program {

	public static void main(String[] args) {

		PartidaChadrez partidachadrez = new PartidaChadrez();
		UI.printboard(partidachadrez.pecas());
		
	}

}
