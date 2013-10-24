package co.edu.udea;

public class GameCodeBreaker {
	
	public String validar(String valor)

	{
		String numeroEscondido ="1357";
		String resultado = "";
		/*
		 * Refactor!!
		 * Hecho para validar las dos primeras pruebas
		 
		if(valor.charAt(0)=='1'){
			resultado +="X";
		}
		if(valor.charAt(1)=='3'){
			resultado +="X";
		}
		if(valor.charAt(2)=='5'){
			resultado +="X";
		}
		if(valor.charAt(3)=='7'){
			resultado +="X";
		}		
		*/

		 
		/*Refactor
		if(valor.charAt(0)==numeroEscondido.charAt(0)){
			resultado +="X";
		}
		if(valor.charAt(1)==numeroEscondido.charAt(1)){
			resultado +="X";
		}
		if(valor.charAt(2)==numeroEscondido.charAt(2)){
			resultado +="X";
		}
		if(valor.charAt(3)==numeroEscondido.charAt(3)){
			resultado +="X";
		}
		*/
		
		//Refactor
		int i = 0;
		int j= 0;
		
		
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
		//Refactor para la 4 prueba
		//Buscar el numero 1 desubicado
		/*i=0;
		while (i<4)
		{
			if(valor.charAt(i)=='1'){
				
				if(i!=0){
					resultado += "_";
				}
											
			}
			i++;
		}*/
		return resultado;
	}
}
