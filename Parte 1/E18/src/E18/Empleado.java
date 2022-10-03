package E18;
public class Empleado {
    
    public static double salarioBruto(double NumHoras, double ValHoras){
        
        double SalBruto;
        SalBruto=NumHoras*ValHoras;
        return SalBruto;
        
    }    
        
    public static double salarioNeto(double SalBruto, double Retefuente){
        
       double SalNeto, Impuesto;
       
       Impuesto = (SalBruto*Retefuente)/100;
       SalNeto=SalBruto-Impuesto;
       return SalNeto;
       
       
       
       
    
    }
   
}
