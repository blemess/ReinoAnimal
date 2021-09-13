
	

public class main {

	public static void main (String args[])
	{
		mamiferos m = new mamiferos();
		peixe p = new peixe();
		aves a = new aves();
		
		m.setEspecie("Tigre");
		System.out.println("Animal:" + m.getEspecie());
		System.out.print("\nComo se locomove:");
		m.locomover();
		System.out.print("\nComo se alimenta:");
		m.alimento();
		System.out.print("\nRuido: ");
		m.ruido();
		m.setCobertura("Pelo");
		System.out.println("\nPossui:" + m.getCobertura() );
		System.out.print("\n");
		
		p.setEspecie("Betta");
		System.out.println("Animal:" +p.getEspecie());
		System.out.print("\nComo se locomove:");
		p.locomover();
		System.out.print("\nComo se alimenta:");
		p.alimento();
		p.setEstrutura("Cartilagem");
		System.out.printf("\nPossui:" + p.getEstrutura());
		System.out.print("\nRuido: ");
		p.ruido();
		System.out.print("\n");
		
		
		a.setEspecie("Harpia");
		System.out.println("Animal:" +a.getEspecie());
		System.out.print("\nComo se locomove:");
		a.locomover();
		System.out.print("\nComo se Alimenta: ");
		a.alimento();
		a.setPenugem("Cinza e Branca");
		System.out.printf("\nPossui penugem "+ a.getPenugem());
		System.out.print("\nRuido: ");
		a.ruido();
	}


	
}
