class Box6{
double width,height,depth;
Box6(Box6 ob){
width=ob.width;
height=ob.height;
depth=ob.depth;
}
Box6(double w, double h, double d){
width=w;
height=h;
depth=d;
}
Box6(){
width=depth=height=-1;
}
Box6(double len){
width=height=depth=len;
}
double volume(){
return width*depth*height;
}
}