package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	private static char[] livro;

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livro);
		
		int a = 2;
		int b = 3;
		System.out.println(("Hello World!") + (a+b));

	}

}
 class Livros {
	 private String nome;
	 private String npag;
	 
 }