class ForEach2{
public static void main(String[] args){
int sum=0;
int num[]={1,3,2,4,5,6,7,8,9,0};
for(int x:num){
System.out.println("value of x is "+x);
sum+=x;
if(x==5) break;}
System.out.println("summation "+sum);
}
}