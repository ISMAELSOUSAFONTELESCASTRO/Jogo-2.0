package jogadores;
import exceptions.IllegalMoneyException;
import jogadores.dado.*;

public abstract class Jogador {
	public int casa;
	protected Dado[] dado = new Dado[2];
	protected String cor = new String();
	protected int moedas = 0;
	protected boolean ispreso = false;
	protected int sentenca = 0;
	protected TipoDeJogador tipo;
	protected int rodadasJogadas = 0;
	protected boolean isBone = false, isMoletom = false, isOculosEscuros = false, debug = false;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean getDebug(){
		return debug;
	}
	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public int getRodadasJogadas() {
		return rodadasJogadas;
	}

	public void setRodadasJogadas(int rodadasJogadas) {
		this.rodadasJogadas = rodadasJogadas;
	}
	
	public int getSentenca() {
		return sentenca;
	}
	
	public void setSentenca(int dias) {
		if(dias >= 0) {
			sentenca = dias;
		}else {
			throw new IllegalArgumentException("A sentença não pode ser negativa.");
		}
	}
	
	public boolean isPreso() {
		return ispreso;
	}
	public void setPreso(boolean preso) {
		ispreso = preso;
	}

	public boolean isBone() {
		return isBone;
	}
	public void setBone(boolean bone) {
		isBone = bone;
	}

	public boolean isMoletom() {
		return isMoletom;
	}
	public void setMoletom(boolean moletom) {
		isMoletom = moletom;
	}

	public boolean isOculosEscuros() {
		return isOculosEscuros;
	}
	public void setOculosEscuros(boolean OculosEscuros) {
		isOculosEscuros = OculosEscuros;
	}
	
	public int getMoedas() {
		return moedas;
	}
	public void setMoedas(int pontuacao) throws IllegalMoneyException {
		if(pontuacao >= 0) {
		this.moedas = pontuacao;
		}else{
			throw new IllegalMoneyException();
		}
	}
	public TipoDeJogador getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeJogador tipo) {
		this.tipo = tipo;
	}

	protected void intanciadoDados(){
		dado[0] = new Dado();
		dado[1] = new Dado();
	}
	public int somaDados(){
		return dado[0].getFace() + dado[1].getFace();
	}
	public abstract void JogarDados();
	public void Andar() {
		casa += dado[0].getFace() + dado[1].getFace();
	}
	
	//para o modo debug
	public void Andar(int nmr) {
		casa += nmr;
	}

}
