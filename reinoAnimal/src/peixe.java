
public class peixe extends reinoAnimal {
	
	private String estrutura;
	
	public void locomover() {
		System.out.println("Nada");
	}
	
	public void alimento() {
		System.out.println("Podem ser carnívoros/herbívoros/onívoros/planctógafos/detritívoros");
	}
	
	public void ruido()
	{
		System.out.println("Glub Glub");
	}
	
	public String getEstrutura() {
		return estrutura;
	}

	public void setEstrutura(String estrutura) {
		this.estrutura= estrutura;
	}
	
}
