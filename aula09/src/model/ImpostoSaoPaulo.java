package model;

public class ImpostoSaoPaulo implements ImpostoStrategy {
	
 @Override
 public double calcularImposto(double areaTotal, int numeroComodos) {
     return areaTotal * 10 + numeroComodos * 2;
 }
}
