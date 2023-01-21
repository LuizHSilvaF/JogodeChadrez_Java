package chadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecasChadrez extends Peca {

	private Cor cor;

	public PecasChadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
	
}
