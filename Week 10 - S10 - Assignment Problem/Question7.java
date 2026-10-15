class Question7{
static int secondHighest(int[] scores){
int highest=-1,second=-1;
for(int s:scores){
if(s>highest){
second=highest;
highest=s;
}else if(s<highest&&s>second){
second=s;
}
}
return second;
}
public static void main(String[] args){
int[] a={45,78,92,78,60};
int[] b={50,50,50};
System.out.println(secondHighest(a));
System.out.println(secondHighest(b));
}
}
