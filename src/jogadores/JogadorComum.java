package jogadores;

public class JogadorComum extends Jogador{
	
	public JogadorComum(String cor) {
		this.cor = cor;
		this.casa = 0;
	}

	public void JogarDados() {
		dado[0].JogarDado();
		dado[1].JogarDado();
	}
	
	
	

}
