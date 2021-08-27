package controller;

public class ThreadVetor extends Thread
{
	private int x;
	private int vet [] = new int [1000];
	
	public ThreadVetor(int x, int vet [])
	{
		this.x = x;
		this.vet = vet;
	}
	
	@Override
	public void run()
	{
		contador();
	}
	
	public boolean ePar(int x)
	{
		if (x % 2 == 0)
		{			
			return true;
		}
		
		return false;
	}
	
	public void contador()
	{
		double tempoInicial, tempoFinal, total;
		String tipo;
		
		tempoInicial = System.nanoTime();
		
		if (ePar(x))
		{
			tipo = "for";
			for (int i = 0 ; i < vet.length; i++)
			{}
		}
		else
		{
			tipo = "foreach";
			for (int j : vet)
			{
				j = j + 0;
			}
		}
		
		tempoFinal = System.nanoTime();
		
		total = tempoFinal - tempoInicial;
		total = total / Math.pow(10, 9);
		
		System.out.println("TID #"+ getId() +" --> tipo usado: " + tipo + ", tempo total: " + total + "s.");
	}
	
}