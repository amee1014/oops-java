import java.util.*;
interface Stack{
void push(String item);
String pop();
String peek();
boolean isEmpty();
}
class ArrayStack implements Stack{
private String[]elements=newString[10];
private int top=-1;
public void push(String item){
if (top==elements.length-1){
System.out.println("stack is full!cannot push");
return;
}
elements[++top]=item;
}
}
public String pop(){
if(isEmpty()){
System.out.println("string is empty!nothing to undo");
return null;
}
return elements[top--];
}
public String peek(){
if(isEmpty())return null;
 return elements[top];
}
public boolean isEmpty(){
 return top==-1;
}
}
public Texteditorundo{
public static void main(String[]args){
Scanner sc=newScanner(System.in);
ArrayStack undostack=new ArrayStack();
while(true){
System.out.println("\n---Text editor---");
System.out.println("1.type text");
System.out.println("2.undo");
System.out.println("3.view current text:");
System.out.println("4.exit:");
System.out.println("enter choice:");
sc.nextLine();
switch(choice){
case 1:
System.out.println("enter text:");
String text=sc.nextLine();
undostack.push(text);
break;
case 2:
String undone=undoStack.pop();
if(undone!=null){
System.out.println("undo:"+undone);
}
break;
case 3:
String current=undoStack.pop();
System.out.println("current text:"+current!=null?current:"no text");
break;
case 4:
System.out.println("exiting...");
sc.close();
return;
default:
System.out.println("invalid choice!try again");
}
}
}
}
