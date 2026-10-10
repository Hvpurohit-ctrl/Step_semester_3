import java.util.*;
abstract class Cab{
double km;
Cab(double k){km=k;}
abstract double rate();
double fare(){return Math.max(km*rate(),100);}
boolean nightService(){return false;}
double total(String time){
double f=fare();
if(time.equals("NIGHT"))f*=1.2;
return f;
}
}
class Mini extends Cab{
Mini(double k){super(k);}
double rate(){return 10;}
}
class Sedan extends Cab{
Sedan(double k){super(k);}
double rate(){return 14;}
boolean nightService(){return true;}
}
class SUV extends Cab{
SUV(double k){super(k);}
double rate(){return 18;}
boolean nightService(){return true;}
}
public class Question4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double total=0;
for(int i=0;i<n;i++){
String type=sc.next();
double km=sc.nextDouble();
String time=sc.next();
Cab c;
if(type.equals("MINI"))c=new Mini(km);
else if(type.equals("SEDAN"))c=new Sedan(km);
else c=new SUV(km);
if(time.equals("NIGHT")&&!c.nightService()){
System.out.println(type+": night service not available");
}else{
double fare=c.total(time);
System.out.printf("%s: %.2f%n",type,fare);
total+=fare;
}
}
System.out.printf("Total: %.2f%n",total);
}
}