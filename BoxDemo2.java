class BoxDemo2{
public static void main(String[] args){
Box mybox1=new Box();
Box mybox2=new Box();
double vol;
mybox1.height=10;
mybox1.width=15;
mybox1.depth=20;
// second box dimensions
mybox2.width=3;
mybox2.depth=6;
mybox2.height=9;
vol=mybox1.height*mybox1.width*mybox1.depth;
System.out.println("volume : "+vol);
vol=mybox2.width*mybox2.height*mybox2.depth;
System.out.println("volume : "+vol);
}
}
