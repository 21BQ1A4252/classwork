class Promote{
public static void main(String[] args){
byte b=42;
char c='a';
short s=1024;
int i=50000;
float f=5.67f;
double d=.1234;
double res=(f*b)+(i/c)-(d*s);
System.out.println((f*d)+" + "+(i/c)+" - "+(d*s));
System.out.println(res);
}
}