
import java.util.*;
class Question10{
String name;
int[] marks;
Question10(String name,int[] marks){
this.name=name;
this.marks=marks;
}
double average(){
return (marks[0]+marks[1]+marks[2])/3.0;
}
char grade(){
double a=average();
if(a>=75) return 'B';
else if(a>=60) return 'C';
else if(a>=40) return 'D';
else return 'F';
}
void display(){
System.out.printf("%s: Average %.1f, Grade %c%n",name.toUpperCase(),average(),grade());
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
for(int i=0;i<2;i++){
String name=sc.next();
int[] marks=new int[3];
for(int j=0;j<3;j++) marks[j]=sc.nextInt();
new Question10(name,marks).display();
}
}
}
