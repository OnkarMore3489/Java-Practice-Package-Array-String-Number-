import java.util.*;
class program6
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue=0;
        boolean bRet=false;

        System.out.println("Enter the Number : ");
        iValue=sobj.nextInt();
        
        Marvellous mobj = new Marvellous();

        bRet=mobj.ChkPrime(iValue);
        if(bRet==true)
        {
            System.out.println("It is Prime Number");
        }
        else
        {
            System.out.println("It is Not Prime Number");
        }
    }
}
class Marvellous
{
    public boolean ChkPrime(int iNo)
    {
      int i=0;
      boolean bResult=true;
      for(i=2;i<=iNo/2;i++)
      {
          if((iNo%i)==0)
          {
             bResult=false;
             break;
          }
      }
      return bResult;
    }
}