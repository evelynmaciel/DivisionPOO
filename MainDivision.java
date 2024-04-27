import java.util.Scanner;

public class MainDivision {

public static void main(String[] args) {

 Scanner n1 = new Scanner(System.in);

 System.out.println("Ingresa un numero: ");

 int a = n1.nextInt();

 System.out.println("Ingresa el segundo numero: ");
 int b = n1.nextInt();

int r = a / b;

 Division d1 = new Division();

 d1.a=a;
 d1.b=b;

 d1.dividir(a, b);

 System.out.println("El resultado es :"+ d1.dividir(a, b));

}


}

