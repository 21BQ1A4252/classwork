class Overloadc2{
public static void main(String[] args){
Box6 mybox1=new Box6(10,20,15);
Box6 mybox2=new Box6();
Box6 mybox3=new Box6(7);
Box6 mybox4=new Box6(mybox1);
double vol;
vol=mybox1.volume();
System.out.println("volume : "+vol);
vol=mybox2.volume();
System.out.println("volume : "+vol);
vol=mybox3.volume();
System.out.println("volume : "+vol);
vol=mybox4.volume();
System.out.println("volume : "+vol);
}
}