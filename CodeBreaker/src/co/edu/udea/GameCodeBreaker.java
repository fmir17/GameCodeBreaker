package co.edu.udea;

public class GameCodeBreaker {
	
	public String validar(String valor)

	{
		String numeroEscondido ="1357";
		String resultado = "";

		int i = 0;
		int j= 0;
		
		//Buscar Numeros que estan en la posicion exacta.
		while(i<4){
			if(valor.charAt(i)==numeroEscondido.charAt(i)){
				resultado +="X";
			}
	
			
			i++;
		}
		//Refactor final
		//Buscar Numeros que se encuentran pero no estan ubicados.
		i=0;
		while(i<4)
		{
			j=0;
			while(j<4)
			{
				
				if(i!=j){
					
					if(valor.charAt(i)==numeroEscondido.charAt(j))
					{
						resultado += "_";
					}
				}
					j++;
			}
			i++;
		}

		return resultado;
	}
}
