package observer;

public class Namorada implements ChegadaAniversarianteObserver {

	@Override
	public void chegou(ChegadaAniversarianteEvent event) {
		System.out.println("APAGUEM AS LUZES SE NÃO ELE VAI VER!");
		System.out.println("SHHHH!! FIQUEM EM SILÊNCIO!!");
		System.out.println("PARABÉNS!! FELIZ ANIVERSÁRIOOOOOOOO!!!");
	}
}