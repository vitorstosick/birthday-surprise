package observer;

public class Namorada implements ChegadaAniversarianteObserver {

	@Override
	public void chegou(ChegadaAniversarianteEvent event) {
		System.out.println("Desliguem as luzes!");
		System.out.println("Todo mundo em silêncio...");
		System.out.println("SURPRESA...FELIZ ANIVERSÁRIO!!!");
	}
}