package TrabalhosJava.java;

public class Calculadoraaa{
    public static void main(String[] args){
    	
    	double num1 =  Double.parseDouble(args[0]);
    	String operador = args[1];
    	double num2 = Double.parseDouble(args[2]);
        
    	System.out.println(Calcular(num1, num2, operador));
    	
    	
    	
    	
    }
    
    public static double Calcular(double num1, double num2, String operador) {
    	double resultado = 0;
    	
    	System.out.println("iniciando calculadora o numero "+ num1 +" esse numero "+ num2 +" essa operação "+ operador);
    	Calculadora calc = new Calculadora();
    	
    	if(operador.equals("*")) {
    		
    		System.out.println("você fez uma multiplicação");
    		resultado = calc.multiplicar(num1, num2);
    		
    	} else if (operador.equals("/")) {
    		
    		System.out.println("você fez uma divisão");
    		resultado = calc.dividir(num1, num2);
    		
    	} else if (operador.equals("+")) {
    		
    		System.out.println("você fez uma adição");
    		resultado = calc.somar(num1, num2);
    		
    	} else if(operador.equals("-")) {
    		
    		System.out.println("você fez uma subtração");
    		resultado = calc.subtrair(num1, num2);
    		
    	} else if(operador.equals("media")) {
    		
    		System.out.println("você fez uma média");
    		resultado = calc.Media(num1, num2);
    		
    	}
    	
    	return resultado;
    	
    }
}

class Calculadora {

	public double somar(double a, double b) { return a + b; }

	public double subtrair(double a, double b) { return a - b; }

	public double multiplicar(double a, double b) { return a * b; }

	public double dividir(double a, double b) { return a / b; }

	public double Media(double a,double b) { return (a + b)/2; }

	public double Media(double a,double b, double c) { return (a + b + c)/3;}

}