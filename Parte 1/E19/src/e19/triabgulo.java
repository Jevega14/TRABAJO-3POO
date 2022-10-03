package e19;
/**
 *
 * @author Jessica Vega
 */
public class triabgulo {
    public static double Perimetro (double lado){
        
        double Perimetro;
        Perimetro= lado*3;
        return Perimetro;
    }
    public static double Altura (double lado){
        
        double Altura;
        Altura= (Math.sqrt(3)*lado)/2;
        return Altura;
    }
    public static double Area (double lado, double Altura){
        
        double Area;
        Area= (lado*Altura)/2;
        return Area;
    }
    
}
