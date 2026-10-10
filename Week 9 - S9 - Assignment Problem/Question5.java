import java.util.*;
abstract class Appliance{
double hours;
Appliance(double h){hours=h;}
abstract double power();
double units(){return power()*hours/1000;}
boolean saver(){return false;}
double units(boolean s){return s?units()*0.75:units();}
double cost(boolean s){return units(s)*8;}
}
class Fridge extends Appliance{
Fridge(double h){super(h);}
double power(){return 150;}
}
class AC extends Appliance{
AC(double h){super(h);}
double power(){return 1500;}
boolean saver(){return true;}
}
class TV extends Appliance{
TV(double h){super(h);}
double power(){return 100;}
}
class Washer extends Appliance{
Washer(double h){super(h);}
double power(){return 500;}
boolean saver(){return true;}
}
public class Question5{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double total=0;
for(int i=0;i<n;i++){
String type=sc.next();
double hours=sc.nextDouble();
boolean s=false;
if(sc.hasNext()){
String x=sc.nextLine().trim();
if(x.equals("SAVER"))s=true;
}
Appliance a;
if(type.equals("FRIDGE"))a=new Fridge(hours);
else if(type.equals("AC"))a=new AC(hours);
else if(type.equals("TV"))a=new TV(hours);
else a=new Washer(hours);
if(s&&!a.saver()){
System.out.println(type+": saver mode not supported");
}else{
double units=a.units(s);
double cost=a.cost(s);
System.out.printf("%s: Units=%.2f Cost=%.2f%n",type,units,cost);
total+=cost;
}
}
System.out.printf("Total Cost: %.2f%n",total);
}
}