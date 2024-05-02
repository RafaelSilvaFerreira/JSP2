package model;


public class ImpostoPortoAlegre implements ImpostoStrategy {
	
 @Override
 public double calcularImposto(double areaTotal, int areaGaragem) {
     if (areaGaragem > 0) {
         return areaTotal * 7.5 + areaGaragem * 2.5;
     } else {
         return areaTotal * 8;
     }
 }
}
