import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Invoice in=new Invoice();
System.out.println("enter number:");
in.setPart_no(sc.nextLine());
System.out.println("enter description:");
in.setPart_desc(sc.nextLine());
System.out.println("enter quantity:");
in.setQuantity(sc.nextInt());
System.out.println("enter price:");
in.setPrice(sc.nextDouble());
System.out.println("part number:"+in.getPart_no());
System.out.println("part description:"+in.getPart_desc());
System.out.println("total amount:"+in.getInvoiceamount());
}
}
