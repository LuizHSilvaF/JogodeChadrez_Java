package chadrez;

import tabuleiro.Tabuleiro;

public class PartidaChadrez {

	private Tabuleiro tabuleiro;

	public PartidaChadrez()
	{
		tabuleiro = new Tabuleiro(8,8);
	}
	
	public PecasChadrez[][] pecas()
	{
		PecasChadrez[][] mat = new PecasChadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int c=0; c<tabuleiro.getLinhas(); c++)
		{
			for(int j=0; j<tabuleiro.getColunas();j++)
			{
				mat [c][j] = (PecasChadrez)tabuleiro.peca(c,j);
			}
		}
		return mat;
	}
}
