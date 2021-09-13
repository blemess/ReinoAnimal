
public class aves extends reinoAnimal {
	
	private String penugem;
	public void locomover()
	{
		System.out.println("Voando");
	}
	public void alimento() {
		System.out.println("Frutas/Insetos/Carne dependendo da espécie");
	}
	public void ruido()
	{
		System.out.println("Chirp Chirp");
	}
	public String getPenugem() {
		return penugem;
	}
	public void setPenugem(String penugem) {
		this.penugem = penugem;
	}
	

}
