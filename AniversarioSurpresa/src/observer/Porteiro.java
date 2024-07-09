package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread {

	private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();

	public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void run() {
		Scanner input = new Scanner(System.in);

		try {
			while (true) {
				int valor = input.nextInt();

				if (valor == 1) {
					ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());

					for (ChegadaAniversarianteObserver observer : this.observers) {
						observer.chegou(event);
					}
				} else {
					System.out.println("Vamos, vamos, se escondam de novo, foi um alarme falso!!");
				}
			}
		} finally {
			input.close();
		}
	}

}