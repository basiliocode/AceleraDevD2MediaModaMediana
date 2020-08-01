package br.com.codenation;

public class StatisticUtil {

	public static int average(int[] elements) {
		int soma = 0;
		for (int i = 0; i < elements.length; i++){
			soma += elements[i];
		}
		return soma / elements.length;
	}

	public static int mode(int[] elements) {
		int moda = elements[0];
		int contAtual = 0;
		int contAnterior = 0;

		for (int i = 0; i < elements.length - 1 ; i++){

			if (elements[i] == elements[i + 1])
				contAtual++;
			else {
				contAnterior = contAtual;
				contAtual = 0;
			}
			moda = contAtual > contAnterior ? elements[i] : moda;
		}
		return moda;
	}

	public static int median(int[] elements) {
		int meio = elements.length / 2;
		if (elements.length % 2 == 0)
			return (elements[meio] + elements[meio - 1]) / 2;

		return elements[meio];
	}
}