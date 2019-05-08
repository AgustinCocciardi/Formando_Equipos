package equipos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Equipo {
	
	private int afinidadMaxima;
	private Integrante []integrantes;
	private int cantIntegrantes;
	private int cantPreguntas;
	
	public Equipo(Scanner sc){
		this.cantPreguntas = sc.nextInt();
		this.cantIntegrantes = sc.nextInt();
		this.integrantes = new Integrante[cantIntegrantes];
		for(int i=0; i<this.cantIntegrantes; i++){
			this.integrantes[i] = new Integrante(sc.nextLine());
		}
		this.afinidadMaxima=-1;
	}
	
	public void calcularAfinidadMaximaYFormarEquipo(PrintWriter pw){
		this.afinidadMaxima = calcularAfinidadMaxima();
		String equipo = formarEquipo(this.afinidadMaxima);
		pw.println(this.afinidadMaxima);
		pw.println(equipo);
	}
	
	
	
	private String formarEquipo(int afinidadMaxima2) {
		// TODO Auto-generated method stub
		return null;
	}

	private int calcularAfinidadMaxima() {
		int afinidadCalculada = 0;
		int integrantes= 0;
		//boolean []evaluados = new boolean[this.cantIntegrantes];
		String []comb;
		for(int i=1; i<this.cantPreguntas; i++){
			for(int k= 0; k<this.cantIntegrantes; k++){
				//evaluados[k]=false;
			}
			int j=0;
			int integrantesFalsos=this.cantIntegrantes;
			int primerFalso=0;
			while(integrantesFalsos > 0){
				
			}
			
		}
		
		
		for (int i=0; i<this.cantPreguntas; i++){
			for 
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(new FileReader("equipo.in"));
		PrintWriter salida = new PrintWriter(new FileWriter("equipo.out"));
		
		Equipo equipo1 = new Equipo(entrada);
		equipo1.calcularAfinidadMaximaYFormarEquipo(salida);
		
		entrada.close();
		salida.close();
	}
	
}
