
public class mamiferos extends reinoAnimal{

	private String cobertura;
	public void locomover()
	{
		System.out.println("Anda");
	}
	public void alimento()
	{
		System.out.println("Alimenta-se mamando enquanto jovem, frutas/gramineas/carne quando adulto");
	}
	public void ruido()
	{
		System.out.println("GRWL GRWL");
	}
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura= cobertura;
	}
	
}
