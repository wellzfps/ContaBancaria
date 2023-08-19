package Aplication;

//Desenvolvedor:João Wellington Nunes da Rocha 
//Github: https://github.com/wellzfps/ContaBancaria

import java.util.Scanner;

import Entities.ContaBancaria;

public class Start_ContaBancaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria banco = new ContaBancaria(null, 0);
	
		banco.startApp(sc);
		
		sc.close();

	}

}
