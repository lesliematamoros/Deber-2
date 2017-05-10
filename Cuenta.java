
import java.util.Date;
import java.util.GregorianCalendar;


public class Cuenta {
     private int id = 0;
     private double saldo;
     private double interesAnual;
     private Date fechaCreacion;
     
    public Cuenta (){}
     
    public Cuenta( int id, double sald,double intAnu,Date fechCrea){
       this.id = id;
       this.saldo = sald;
       this.interesAnual = intAnu;
       this.fechaCreacion = fechCrea;
    }

    public int getId() {
        return id;
    }
    public void setId (int id){
          this.id = id;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo (double saldo){
          this.saldo = saldo;
    }
    
     public double getInteresAnual() {
        return interesAnual;
    }
    public void setInteresAnual (double interesAnual){
          this.interesAnual = interesAnual;
    }
    
     public Date getFechaCreacion() {
        return fechaCreacion ;
    }
    public void setFechaCreacion (Date fechaCreacion){
          this.fechaCreacion = fechaCreacion;
    }
    public double getInteresMensual (){
       return saldo * id * 12 / 100 * 365;
    } 
    
    public void retiro(double retiro){
       saldo -= retiro;
    }
    
    public void deposito(double deposito){
       saldo += deposito;
    }
    
    public static void main (String [] args){
        
    Cuenta cuen = new Cuenta (1122, 2000, 4.5, new GregorianCalendar(1993, 31, 03).getTime());
    cuen.retiro (2500);
    cuen.deposito (3000);
    System.out.println ("El balance es :" +cuen.getSaldo());
    System.out.println ("El interes mensual es: " +cuen.getInteresMensual());
    System.out.println ("La fecha de creacion es : " +cuen.getFechaCreacion());
    }
}

