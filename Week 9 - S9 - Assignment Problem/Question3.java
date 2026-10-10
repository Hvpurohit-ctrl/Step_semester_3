import java.util.*;
abstract class Student{
String name;
static final double BUS=12000;
Student(String n){name=n;}
abstract double fee();
abstract boolean usesBus();
double total(){return fee()+(usesBus()?BUS:0);}
}
class DayScholar extends Student{
DayScholar(String n){super(n);}
double fee(){return 40000;}
boolean usesBus(){return true;}
}
class Hosteller extends Student{
Hosteller(String n){super(n);}
double fee(){return 40000+60000;}
boolean usesBus(){return false;}
}
class Scholar extends Student{
Scholar(String n){super(n);}
double fee(){return 20000;}
boolean usesBus(){return true;}
}
public class Question3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double total=0;
for(int i=0;i<n;i++){
String type=sc.next();
String name=sc.next();
Student s;
if(type.equals("DAY_SCHOLAR"))s=new DayScholar(name);
else if(type.equals("HOSTELLER"))s=new Hosteller(name);
else s=new Scholar(name);
System.out.printf("%s: %.2f%n",s.name,s.total());
total+=s.total();
}
System.out.printf("Total Collected: %.2f%n",total);
}
}