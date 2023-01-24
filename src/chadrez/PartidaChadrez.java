package chadrez;

import chadrez.pecas.Rei;
import chadrez.pecas.Torre;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class PartidaChadrez {

	private Tabuleiro tabuleiro;

	public PartidaChadrez()
	{
		tabuleiro = new Tabuleiro(8,8);
		iniciarPartida();
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
	
	private void iniciarPartida()
	{
		tabuleiro.lugarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2,1));
		tabuleiro.lugarPeca(new Rei (tabuleiro, Cor.PRETO), new Posicao(2,1));
	}
}
