package chadrez.pecas;

import chadrez.Cor;
import chadrez.PecasChadrez;
import tabuleiro.Tabuleiro;

public class Torre extends PecasChadrez {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	
	@Override
	public String toString()
	{
		return "T";
	}

}
