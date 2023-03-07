package controller;

public class somaController {
	
	public somaController() {
		
		super();
		
	}
	
	public double soma(int valor) {

		//O primeiro valor da somatória sempre será 1, então quando o valor for
		//subtraído o suficiente ele deverá retornar 1
		if (valor == 1) {
			
			return 1;
			
		} else {
			
			return (1 / (double)valor) + (soma(valor - 1));
			//Seguindo o padrão da somatória, dividimos o 1 pelo valor e somamos
			//com o valor subtraído por 1
			
		}
		
	}
	
}