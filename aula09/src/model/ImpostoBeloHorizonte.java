package model;



public class ImpostoBeloHorizonte implements ImpostoStrategy {
 @Override
 public double calcularImposto(double areaTotal, int numeroQuartos) {
     return areaTotal * 7 + numeroQuartos * 4;
 }
}
