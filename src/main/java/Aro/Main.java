package Aro;

import java.text.DecimalFormat;

/**
 * Pruebas de refactorización en NetBeans con la clase Aro
 * @author Jose Angel SAntoveña Gomez
 */
public class Main {
    public static void main(String[] args) {
        Aro Aro = new Aro(37,43,2.5);
        String saida =
                "A coordenada X é "+Aro.obterX()+
                "\nA coordenada Y é "+Aro.obterY()+
                "\nO radio é "+Aro.obterRadio();
        Aro.establecerX(35);
        Aro.establecerY(20);
        Aro.establecerRadio(4.2);
        DecimalFormat dousDixitos = new DecimalFormat("0.00");
        saida+="\nO diámetro é "+dousDixitos.format(Aro.obterDiametro());
        saida+="\nA circunferencia é "+dousDixitos.format(Aro.obterCircunferencia());
        saida+="\nA área é "+dousDixitos.format(Aro.obterArea());
        System.out.println(saida);
        
        System.out.println(saida);
        System.exit(0);
    }

}