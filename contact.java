AMEERA ALIMA U
 24UCS189
 CSE C

import java.util.*;
class contact
{
public static void main(String[]args)
{
ArrayList<String>con=new ArrayList<String>();
con.add("shiva");
con.add("dhanusree");
con.add("vaishu");
con.add("madhu");
con.add("deva");
//contact list
for(String con1:con)
{
System.out.println("contact list:"+ con1);
}
//retrive contact
System.out.println("retrive"+ con.get(3));
//update contact
System.out.println("update"+ con.set(4,"divya"));
//delete contact
System.out.println("delete"+ con.remove(1));
}
}


output

:\>java contact
contact list:shiva
contact list:dhanusree
contact list:vaishu
contact list:madhu
contact list:deva
retrivemadhu
updatedeva
deletedhanusree