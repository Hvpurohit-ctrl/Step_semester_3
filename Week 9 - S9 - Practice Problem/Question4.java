import java.util.*;
abstract class Connection{
double units;
Connection(double u){units=u;}
abstract double bill();
}
class Home extends Connection{
Home(double u){super(u);}
double bill(){return units<=100?units*5:100*5+(units-100)*7;}
}
class Shop extends Connection{
Shop(double u){super(u);}
double bill(){return units*8+100;}
}
class Factory extends Connection{
Factory(double u){super(u);}
double bill(){return Math.max(units*6,1000);}
}
public class Question4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double total=0;
for(int i=0;i<n;i++){
String type=sc.next();
double units=sc.nextDouble();
Connection c;
if(type.equals("HOME"))c=new Home(units);
else if(type.equals("SHOP"))c=new Shop(units);
else c=new Factory(units);
System.out.printf("%s: %.2f%n",type,c.bill());
total+=c.bill();
}
System.out.printf("Total: %.2f%n",total);
}
}