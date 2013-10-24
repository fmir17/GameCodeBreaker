package co.edu.udea;

public class GameCodeBreaker {
	
	public String validar(String valor)

	{
		String numeroEscondido ="1357";
		String resultado = "";

		int i = 0;
		int j= 0;
		
		//Variable q indica poner X
		boolean bnUbicado =false;
		
		while(i<4)
		{
			//Numeros que se encuentran bien ubicados.
			if(valor.charAt(i)==numeroEscondido.charAt(i)){
				resultado ="X"+resultado;
				bnUbicado=true;
			}
	
			j=0;
			//Si no se puso X se busca para poner _
			while(j<4 & bnUbicado==false)
			{
				
				if(i!=j){
					
					if(valor.charAt(i)==numeroEscondido.charAt(j))
					{
						resultado+= "_";
					}
				}
					j++;
			}
			bnUbicado=false;
			i++;
		}

		return resultado;
	}
}
