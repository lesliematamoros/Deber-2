
public class Rectangulo {
    
    private  double ancho;
    private double altura;
     
    public Rectangulo (){
           this.ancho = 1;
           this.altura = 1;
    }
    public Rectangulo (double anc, double alt){
        this.ancho = anc;
        this.altura = alt;
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho (double ancho){
          this.ancho = 1;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura (double altura){
          this.altura = 1;
    }
    public double getArea(){
          return ancho = altura;
    }
    
    public double getPerimetro(){
          return 2 * ancho + 2 * altura;
    }
    public static void main (String [] args){
        Rectangulo rect =new Rectangulo (4, 40);
        Rectangulo rect1 =new Rectangulo (3.5, 35.9);
        System.out.println ("El ancho del rectangulo es : " + rect.getAncho());
        System.out.println ("La altura del rectangulo es : " + rect.getAltura());
        System.out.println ("El area del rectangulo es : " + rect.getArea());
        System.out.println ("El perimetro del rectangulo es : " + rect.getPerimetro());
    }
}
