class TestStack{
public static void main(String[] args){
Stack mystack=new Stack();
for(int i=0;i<10;i++) mystack.push(i);
System.out.println("stack in mystack");
for(int i=0;i<10;i++)
  System.out.println(mystack.pop());
}
}
