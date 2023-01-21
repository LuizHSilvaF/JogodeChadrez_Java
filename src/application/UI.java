package application;

import chadrez.PecasChadrez;

public class UI {

	public static void printboard(PecasChadrez[][] pecas)
	{
		for (int c=0; c<pecas.length; c++)
		{
			System.out.print((8 - c) + " ");
			for (int j=0; j<pecas.length;j++)
			{
				printPiece(pecas[c][j]);
			}
			System.out.println();
		}
		System.out.println(" a b c d e f g h");
	}
	
	private static void printPiece(PecasChadrez peca)
	{
		if (peca == null)
		{
			System.out.print("-");
		}
		else
		{
			System.out.print(peca);
		}
		System.out.print(" ");
	}
}
