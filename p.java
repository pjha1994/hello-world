import java.io.*;
class GCD
{
public long gcd(long a,long b)
 {return(a%b==0?b:gcd(b,a%b));}
}
class p
{
public static void main(String []args)throws IOException
{GCD g=new GCD();
 DataInputStream wow=new DataInputStream(System.in);
 String s=wow.readLine();String a=wow.readLine(); 
long m,n;
 m=Integer.parseInt(s);n=Integer.parseInt(a);
 if(m<n) {long t=m;m=n;n=t;}
 System.out.println("GCD IS : "+g.gcd(m,n));
 long r=m%n;
 while(r>=0&&r<n)
  {
  if(r==0)
    {System.out.println("GCD IS : "+n);break;}
  else
   {m=n;n=r;}
   r=m%n;
  }
}
}
