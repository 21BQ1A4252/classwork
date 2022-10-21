class Box5{
double width,height,depth;
Box5(){
width=height=depth=-1;
}
Box5(double len){
width=height=depth=len;
}
Box5(double w, double h,double d){
width=w;
height=h; 
depth=d;
}
double volume(){
return width*depth*height;
}
}