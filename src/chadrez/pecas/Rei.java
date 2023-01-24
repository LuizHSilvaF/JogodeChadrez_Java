package chadrez.pecas;

import chadrez.Cor;
import chadrez.PecasChadrez;
import tabuleiro.Tabuleiro;

public class Rei extends PecasChadrez{

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString()
	{
		return "K";
	}
}
