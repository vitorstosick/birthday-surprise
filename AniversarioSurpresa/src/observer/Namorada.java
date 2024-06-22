package observer;

public class Namorada implements ChegadaAniversarianteObserver {

	@Override
	public void chegou(ChegadaAniversarianteEvent event) {
		System.out.println("Apaga a luz ai rapazi!");
		System.out.println("Façam silêncio!!);
		System.out.println("FELIZ ANIVERSÁRIO MEU MANO PEDRO!!!");
	}
}