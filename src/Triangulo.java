import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Triangulo {
    private double hipotenusa;
    private Scanner scan;
    private Set<String> propriedades;
    private double a, b, c;
    
    public Triangulo make() {
        
        this.scan = new Scanner(System.in);
        this.propriedades = new HashSet<>();
        
        System.out.println("Informa o tipo do triangulo");
        System.out.println("Informa o valor do lado a");

        this.a = this.scan.nextDouble();
        System.out.println("Informa o valor do lado b");
        this.b = this.scan.nextDouble();
        System.out.println("Informa o valor do lado c");
        this.c = this.scan.nextDouble();
        
        return this;
    }
    
    public Triangulo make(double a, double b, double c) {
        this.propriedades = new HashSet<>();
        
        this.a = a;
        this.b = b;
        this.c = c;
        
        return this;
    }
    
    public Triangulo setHipotenusa(){
        this.hipotenusa = this.a;
        if (this.hipotenusa < this.b) {
            this.hipotenusa = this.b;
        }
        if (this.hipotenusa < this.c) {
            this.hipotenusa = this.c;
        }
        
        return this;
    }
    
    public Triangulo setResultado() {
        if ((this.a + this.b + this.c - this.hipotenusa) > this.hipotenusa) {
            this.propriedades.add("Válido");
            if (this.a == this.b || this.b == this.c || this.c == this.a) {
                if (this.a == this.b && this.b == this.c) {
                    this.propriedades.add("Equilátero");
                } else {
                    this.propriedades.add("Isósceles");
                }
            }
            if (this.a != this.b && this.b != this.c && this.c != this.a) {
                this.propriedades.add("Escaleno");
            }
        } else {
            this.propriedades.add("Inválido");
        }
        
        return this;
    }
    
    public void printResultado() {
        System.out.println("Propriedades do triangulo ->");
        this.propriedades.forEach((valor) -> {
            System.out.println(valor);
        });
    }
    
    public Set<String> getResultado() {
        return this.propriedades;
    }
}
