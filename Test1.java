package Tarea8;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombreProducto, nombreAlumno = "", carneAlumno;
        int idProducto, edadAlumno, op = 0, edadAlumno2;
        double precioProducto, precioComparacion;

        Comparador comparador = new Comparador();

        do{
            System.out.println("1: Ingresar un producto");
            System.out.println("2: Ingresar un alumno");
            System.out.println("3: Salir del programa");
            System.out.print("Opcion a realizar: ");
            op = entrada.nextInt();

            switch(op){
                case 1:
                    System.out.print("Ingrese el ID del producto: ");
                    idProducto = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Ingrese el nombre del producto: ");
                    nombreProducto = entrada.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    precioProducto = entrada.nextDouble();
                    System.out.print("Ingrese el precio de comparacion: ");
                    precioComparacion = entrada.nextDouble();

                    Producto producto = new Producto(idProducto, nombreProducto, precioProducto);

                    comparador.setPrecio(precioComparacion);

                    if(comparador.igualQueP(producto) == true){
                        System.out.println("=");
                    }

                    if(comparador.menorQueP(producto) == true){
                        System.out.println("<");
                    }

                    if(comparador.mayorQueP(producto) == true){
                        System.out.println(">");
                    }

                    if(comparador.mayorIgualQueP(producto) == true){
                        System.out.println(">=");
                    }

                    if (comparador.menorIgualQueP(producto) == true){
                        System.out.println("<=");
                    }
                    break;
                case 2:

                    entrada.nextLine();
                    System.out.print("Ingrese el carne: ");
                    carneAlumno = entrada.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    nombreAlumno = entrada.nextLine();
                    System.out.print("Ingrese la edad: ");
                    edadAlumno = entrada.nextInt();
                    System.out.print("Ingrese la edad de comparacion: ");
                    edadAlumno2 = entrada.nextInt();

                    Alumno alumno = new Alumno(carneAlumno, nombreAlumno, edadAlumno);

                    comparador.setEdad(edadAlumno2);

                    if(comparador.igualQueA(alumno) == true){
                        System.out.println("=");
                    }

                    if(comparador.menorQueA(alumno) == true){
                        System.out.println("<");
                    }

                    if(comparador.mayorQueA(alumno) == true){
                        System.out.println(">");
                    }

                    if(comparador.mayorIgualQueA(alumno) == true){
                        System.out.println(">=");
                    }

                    if (comparador.menorIgualQueA(alumno) == true){
                        System.out.println("<=");
                    }

                    break;
                case 3:
                    System.out.print("I’ll be back");
                    break;
            }

        }while(op !=3);

    }
}