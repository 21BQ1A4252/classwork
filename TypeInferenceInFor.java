class TypeInferenceInFor{
public static void main(String[] args){
System.out.print("value of X: ");
for(var x=2.5;x<100.0;x=x*2)
   System.out.print(x+" ");
System.out.println();
int[] num={1,2,3,4,5,6,7};
System.out.print("values in num are : ");
for(var v:num)
 System.out.print(v+" ");
System.out.println();
}
}
