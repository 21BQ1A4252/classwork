class Box3{
double width, height, depth;
Box3(){
System.out.println("constructing Box");
width=10;
height=10;
depth=10;
}
double volume(){
return width*depth*height;
}
}