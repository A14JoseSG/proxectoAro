package aro;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Jose Angel Santoveña Gomez
 */
public class Aro {

    /**
     *Clase aro con métodos para calcular superficie, diametro,adio o 
     * modificar el centro del aro
     */
    public static final double MINIMO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;
  
    
    /**
     *Constructor sin parametros
     */
    public Aro() {
    }

    /**
     *
     * @param valorX se guarda en la coordenadaX
     * @param valorY se guarda en la coordenadaY
     * @param valorRadio se guarda el radio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     *
     * @return devuelve el diametro del aro
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     *
     * @return devuelve la circunferencia del aro
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     *
     * @return devuelve la superficie del aro
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     *
     * @return devuelve y muestra el centro y el radio
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     *
     * @param trasladarX coordenadaX para modificar el centro
     * @param trasladarY coordenadaY para modificar el centro
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }

    /**
     * @return devuelve la  coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX establece la coordenadaX
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return devuelve la coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY establece el valor de la coordenadaY
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return devuelve el radio del aro
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio valor del radio para establecer su valor
     */
    public void setRadio(double radio) {
        this.radio = radio < MINIMO ? MINIMO : radio;
    }
}