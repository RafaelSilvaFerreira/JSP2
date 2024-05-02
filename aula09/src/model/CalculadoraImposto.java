package model;


public class CalculadoraImposto {
 private ImpostoStrategy strategy;

 public CalculadoraImposto(ImpostoStrategy strategy) {
     this.strategy = strategy;
 }

 public double calcularImposto(double areaTotal, int parametroExtra) {
     return strategy.calcularImposto(areaTotal, parametroExtra);
 }
}