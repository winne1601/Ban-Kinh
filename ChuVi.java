import java.util.Scanner;
public class ChuVi {
public static void main(String[]args) {
	try {
	Scanner sc= new Scanner(System.in);
    double r=sc.nextDouble();
    double pi=3.14;
    double bankinh;
   bankinh= Math.pow(pi, 2)*r;
   System.out.println("Bankinhla: "+r);
}
catch(Exception e){
	System.out.println(e.getMessage());
	e.printStackTrace();
	System.out.println("Sai kieu du lieu");
}
}
}
