package figuras;
/*
 *
 * @author Jessica Vega
 */
public class TriánguloRectángulo {
    public static double calcularArea(double base, double altura){

        return (base * altura / 2);
    }
    public static double calcularHipotenusa(double base, double altura) {
        double sumando;
        sumando=Math.pow(base*base + altura*altura, 0.5);
        return sumando;
    } 
    public static double calcularPerímetro(double base, double altura){
        return (base + altura + calcularHipotenusa(base,altura)); /* Invoca al
    método calcular hipotenusa */
    }
}
/*
 *
    public void determinarTipoTriángulo(){
        
        if ((base == altura) && (base == calcularHipotenusa()) && (altura== calcularHipotenusa())){

            return "Es un triángulo equilátero"; 
        } 
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){

            return "Es un triángulo escaleno";
        }
        else{
            return "Es un triángulo isósceles"; /* De otra
        manera, es isósceles */
