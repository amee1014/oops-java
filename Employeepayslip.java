import java.util.*;
class Employee{
String empname,empid,address,mailid,molbileno;
double basicpay;
Scanner sc=new Scanner(system.in);
void readdetails()
{
System.out.println("enter employee name:");
empname=sc.nextLine();
System.out.println("enter employee id:");
empid=sc.nextLine();
System.out.println("enter address:");
address=sc.nextLine();
System.out.println("enter employee mail id :");
mailid=sc.nextLine();
System.out.println("enter employee mobile number:");
mobileno=sc.nextLine(); 
System.out.println("enter employee basic pay:");
basicpay=sc.nextDouble();
}
void Displaydetails()
{
System.out.println("\n---Employee details---");
System.out.println("name:"+empname);
System.out.println("ID:"+empid);
System.out.println("address:"+address);
System.out.println("mail id:"+mailid);
System.out.println("mobile no:"+mobileno);
System.out.println("basic pay:"+basicpay);
}
}
class Programmer extends Employee{
void generatepayslip(){
double da=basic*97/100;
double hra=basicpay*10/100;
double pf=basicpay*10/100;
double staffclub=basicpay*1/100;
double gross=basicpay+da+hra;
doble net=gross-(pf+staffclub);

//displaydetails()
System.out.println("designation:programmer");
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PA:"+pf);
System.out.println("staff club:"+staffclub);
System.out.println("gross pay:"+gross);
System.out.println("net pay:"+net);
}
}
//ASSISTANT PROFESSOR
class Assistantprofessor extends Employee
{
void generatepayslip(){
double da=basic*110/100;
double hra=basicpay*20/100;
double pf=basicpay*12/100;
double staffclub=basicpay*5/100;
double gross=basicpay+da+hra;
doble net=gross-(pf+staffclub);

Displaydetails();
System.out.println("designation:Assistant professor");
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PA:"+pf);
System.out.println("staff club:"+staffclub);
System.out.println("gross pay:"+gross);
System.out.println("net pay:"+net);
}

//ASSOCIATE PROFESSOR

class Associateprofessor extends Employee
{
void generatepayslip(){
double da=basic*130/100;
double hra=basicpay*30/100;
double pf=basicpay*12/100;
double staffclub=basicpay*10/100;
double gross=basicpay+da+hra;
doble net=gross-(pf+staffclub);

Displaydetails();
System.out.println("designation:associate professor");
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PA:"+pf);
System.out.println("staff club:"+staffclub);
System.out.println("gross pay:"+gross);
System.out.println("net pay:"+net);
}

//PROFESSOR

class Professor extends Employee
{
void generatepayslip(){
double da=basic*140/100;
double hra=basicpay*40/100;
double pf=basicpay*12/100;
double staffclub=basicpay*15/100;
double gross=basicpay+da+hra;
doble net=gross-(pf+staffclub);

Displaydetails();
System.out.println("designation: professor");
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PA:"+pf);
System.out.println("staff club:"+staffclub);
System.out.println("gross pay:"+gross);
System.out.println("net pay:"+net);
}
}

//MAIN CLASS

public class Employeepayslip{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter employee designation:\n1.programmer\n2.Assistant professor\n3.Assosciate professor\n4.Professor");
int choice=sc.nextInt();
sc.nextLine();
switch(choice){
case 1:
Programmer p=new Programmer();
p.readdetails();
p.generatepayslip();
break;
case 2:
Assistantprofessor ap=new Assistantprofessor();
p.readdetails();
p.generatepayslip();
break;
case 3:
Assosciateprofessor asp=new Assosciateprofessor();
p.readdetails();
p.generatepayslip();
break;
case 4:
Professor ps=new Professor();
p.readdetails();
p.generatepayslip();
break;
default:
System.out.println("invalid choice!");
}
sc.close();
}
}
}
}