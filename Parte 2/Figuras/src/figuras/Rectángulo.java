package figuras;
/**
 *
 * @author Jessica Vega
 */
public class Rectángulo {
    // métodos para área yperímetro 
    public static double calcularArea(double base, double altura) {
        return base * altura;
        }

    public static double calcularPerímetro(double base, double altura) {
        return (2 * base) + (2 * altura);
        }
}
