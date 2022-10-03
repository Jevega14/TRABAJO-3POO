package e23;
/**
 *
 * @author Jessica Vega
 */
public class Ecuacion {
    public static double SolucionX1(double A, double B, double C){
        double X1;
        
        X1=((-(B)+(Math.sqrt((B*B)-4*A*C)))/(2*A));
        
        return X1;  
    }
    public static double SolucionX2(double A, double B, double C){
        double X2;
        
        X2=((-(B)-(Math.sqrt((B*B)-4*A*C)))/(2*A));
        return X2;
    }       
}
