package TrabalhosJava.java;

import java.text.DecimalFormat;
public class MediaNotas {   // Este Calcula a MEDIA de 2 numeros inline do CMD
    public static void main(String[] args) {
        try {              // Declarar as variaveis
            int num1;
            int num2;
            int num3;
            double media=0;
            // Atribuir valores para as variaveis
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            if(args.length == 2){
                media = calcularMedia(num1,num2);
            }
            else if(args.length == 3){
                num3 = Integer.parseInt(args[2]);
                media = calcularMedia(num1,num2,num3);
            }
            else{}
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println("A média " + df.format(media) );
        } catch (Exception e) {
            System.out.println("Erro, verifique os parametros");
        }//testando -->   java Media 5 10
    }

    public static double calcularMedia(double n1, double n2){
        return(n1+n2)/2;
    }

    public static double calcularMedia(double n1, double n2, double n3){
        return(n1+n2+n3)/3;
    }
}