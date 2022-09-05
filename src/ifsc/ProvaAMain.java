package ifsc;

import java.util.Scanner;


public class ProvaAMain {
	public static  float calcularMedia(float soma) {
		float media=soma/10;
		return media;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		float[] numeros=new float[10];
		float soma=0;
		float retorno;
		for(int i=0 ;i<numeros.length ;i++) {
			System.out.println("Digite o numero da posição " + i);
			numeros[i]= sc.nextFloat();
			soma=soma+numeros[i];
		}
		System.out.println("Soma " +soma);
		
	    retorno=calcularMedia(soma);
		
        System.out.println("Média dos numeros:"+ retorno);
        
        sc.close();
	}

}

