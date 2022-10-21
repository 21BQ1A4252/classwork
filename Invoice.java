class Invoice{
String part_no, part_desc;
int quan;
double price,total;
Invoice(){

String part_no=part_desc=" ";
int quan=0;
double price=total=0.0;
}
public String getPart_no(){
return part_no;
}
public void setPart_no(String part_no){
this.part_no=part_no;
}
public String getPart_desc(){
return part_desc;
}
public void setPart_desc(String part_desc){
this.part_desc=part_desc;
}
public int getQuantity(){
return quan;
}
public void setQuantity(int quan){
if(quan<0)
  quan=0;
else
   this.quan=quan;
}
public double getPrice(){
return price;
}
public void  setPrice(price){
if(price<0)
   price=0;
else
   this.price=price;
}
double getInvoiceamount(){
 totalprice();
   return total;
}
void totalprice(){
total=total+getQuantity()*getPrice();
}
}


