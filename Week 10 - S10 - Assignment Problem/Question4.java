
import java.util.*;
class Question4{
static int lowerBound(int[] a,int x){
int l=0,r=a.length;
while(l<r){
int m=(l+r)/2;
if(a[m]<x) l=m+1;
else r=m;
}
return l;
}
static int countInBand(int[] scores,int low,int high){
return lowerBound(scores,high+1)-lowerBound(scores,low);
}
public static void main(String[] args){
int[] scores={35,42,42,50,58,58,58,63,71,88};
System.out.println(countInBand(scores,42,58));
System.out.println(countInBand(scores,90,100));
}
}
