import java.util.*;
class program7
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue=0;
        boolean bRet=false;

        System.out.println("Enter the Number : ");
        iValue=sobj.nextInt();
        
        Marvellous mobj = new Marvellous();

        bRet=mobj.ChkArmstrong(iValue);
        if(bRet==true)
        {
            System.out.println("It is Armstrong Number");
        }
        else
        {
            System.out.println("It is Not Armstrong Number");
        }
    }
}
class Marvellous
{
    public boolean ChkArmstrong(int iNo)
    {
        int idigit=0,iDigCnt=0,iPower=1,iCnt=0,iSum=0;
        if(iNo<0)
        {
            iNo=-iNo;
        }

        int iTemp=iNo;

        while(iTemp!=0)
        {
         iDigCnt++;
         iTemp=iTemp/10;
        }
        
        iTemp=iNo;

        while(iTemp!=0)
        {
            idigit=iTemp%10;
            for(iCnt=1;iCnt<=iDigCnt;iCnt++)
            {
              iPower*=idigit;
            }
            iSum+=iPower;
            iPower=1;
            iTemp=iTemp/10;
        }
        
        if(iSum==iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}