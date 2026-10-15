
import java.util.*;
class Question8{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>=90) System.out.println("Grade A");
else if(n>=75) System.out.println("Grade B");
else if(n>=60) System.out.println("Grade C");
else if(n>=40) System.out.println("Grade D");
else System.out.println("Grade F");
}
}
