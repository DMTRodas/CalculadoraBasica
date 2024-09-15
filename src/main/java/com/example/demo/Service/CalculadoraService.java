package com.example.demo.Service;
import org.springframework.stereotype.Service;

@Service

public class CalculadoraService {
  
    public double checkNumber(double total){

        char operacion=' ';
        double num1=0.0;
        double num2=0.0;

        if (operacion == '+'){
          total=  (num1+num2); return total;}
       
          //System.out.println ("La suma de"+num1+"+"+num2+"es: "+num1+num2);}
          if (operacion == '-'){
            total=  (num1-num2); return total;}
            
            //System.out.println("La resta de"+num1+"-"+num2+"es: "+(num1-num2));}
            if (operacion == '*'){
              total=  (num1*num2); return total;}
              
               // System.out.println("La multiplicacion de"+num1+"x"+num2+"es: "+(num1*num2));}
                if (operacion== '/'){
                    total=  (num2/num1); return total;}
                    //System.out.println("La division de"+num2+"/"+num1+"es: "+(num2/num1));}
                
     return checkNumber(total);
}
}

 /* 

    public class CalculadoraService {
    double n1;
    double n2;
    double total;
    char operacion;

    public CalculadoraService(double n1, double n2, char operacion){
       
        this.n1=n1;
        this.n2=n2;
        this.operacion = operacion;

    }

   /*  public void mostrarResultado() {
        
        System.out.println(this.n1+" "+this.operacion+" "+this.n2+"="+this.res);
        

    }
}


     class Suma extends CalculadoraService{
        double suma;

        public Suma(double n1, double n2){
            super(n1, n2, '+');
            this.suma= n1+n2;
            this.setRes(this.suma);
        }

    }

     class Resta extends CalculadoraService{
        double resta;

        public Resta(double n1, double n2){
            super(n1, n2, '-');
            this.resta= n1-n2;
            this.setRes(this.resta);
        }

    }

     class Multiplicacion extends CalculadoraService{
        double multi;

        public Multiplicacion(double n1, double n2){
            super(n1, n2, '*');
            this.multi= n1*n2;
            this.setRes(this.multi);
        }

    }

     class Division extends CalculadoraService{
        double div=0;

        public Division(double n1, double n2){
            super(n1, n2, '/');
            this.div= n2/n1;
            this.setRes(this.div);
        }

    }

    double n1 =10;
    double n2 = 5;

    //suma
    Suma sum = new Suma(n1,n2);
    sum.mostrarResultado();
            
    //resta
    Resta res = new Resta(n1,n2);
    res.mostrarResultado();
            
    //multiplicacion
    Multiplicacion mul = new Multiplicacion(n1,n2);
    mul.mostrarResultado();
            
    //division
    Division div = new Division(n1,n2);
    div.mostrarResultado();*/


   /*  public class CalculadoraService {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();
            
            scanner.close();
        }
    
    
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    public static double restar(double a, double b) {
        return a - b;
    }
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
    }

    
    
        System.out.println("Selecciona una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int opcion = scanner.nextInt();
        double resultado = 0;
        
        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }
        
        System.out.println("El resultado es: " + resultado);
    
    }*/

  /*  public class CalculadoraService {
        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            boolean continuar = true;
    
            while (continuar) {
                System.out.print("Ingrese la operacion a realizar (S = suma, R = resta, M = multiplicacion, D = division): ");
                char operacion = lector.next().charAt(0);
                
                // Validar que la operación sea válida
                if (operacion == 'S' || operacion == 's' || operacion == 'R' || operacion == 'r' ||
                    operacion == 'M' || operacion == 'm' || operacion == 'D' || operacion == 'd') {
    
                    System.out.print("Ingrese el primer numero: ");
                    double num1 = lector.nextDouble();
    
                    System.out.print("Ingrese el segundo numero: ");
                    double num2 = lector.nextDouble();
    
                    switch (operacion) {
                        case 'S':
                        case 's':
                            System.out.println("El resultado es: " + (num1 + num2));
                            break;
                        case 'R':
                        case 'r':
                            System.out.println("El resultado es: " + (num1 - num2));
                            break;
                        case 'M':
                        case 'm':
                            System.out.println("El resultado es: " + (num1 * num2));
                            break;
                        case 'D':
                        case 'd':
                            if (num2 != 0) {
                                System.out.println("El resultado es: " + (num1 / num2));
                            } else {
                                System.out.println("No se puede dividir por cero.");
                            }
                            break;
                        default:
                            System.out.println("Operacion no valida.");
                    }
                } else {
                    System.out.println("Este no es una opcion valida. Por favor, coloque una que este en las opciones.");
                }
    
                System.out.print("Desea continuar? (S/N): ");
                char respuesta = lector.next().charAt(0);
                if (respuesta != 'S' && respuesta != 's') {
                    continuar = false;
                }
            }
    
            lector.close();
            System.out.println("Gracias por usar la calculadora.");
        }

        
    }*/ 





