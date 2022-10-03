package e10;
/**
 *
 * @author Jessica Vega
 */
public class Matricula {
    
    public static double Matricula(double Patrimonio, double eSocial){
        
        double Matricula;
        
        if ((Patrimonio > 2000000) && (eSocial> 3)){
            Matricula = (Patrimonio*0.03)+50000;
            return Matricula;
        } else{
            Matricula = 50000;
            return Matricula;
        }    
    }
}
