package VLGt08;

public class Figura2D {
   public double ancho;
   public double alto;

   public void verDim(){
       System.out.printf("ancho: %.2f, alto: %.2f",ancho, alto);
   }
}

class Triangulo extends Figura2D{
    public String estilo;

    public void verEstilo(){
        System.out.println(" Estilo: "+estilo);
    }

   public void area(){
        System.out.println("Area: "+(ancho*alto)/2);
    }
}

