/*
 Write a program to accept two integer numbers from the user and perform the mathematical operations
 on it as per the following menu.
 
 1.Addition of number from number1 to number2.
 2.Find Maximum of two number.
 3.print the multiplication table of number1 and number2.
 */
import java.util.*;

class Ass1_program1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue1=0,iValue2=0,iRet=0,Choice=1;
        
        System.out.println("Enter the First Number : ");
        iValue1=sobj.nextInt();
        System.out.println("Enter the Second Number : ");
        iValue2=sobj.nextInt();
        
        Mathematics mobj = new Mathematics(iValue1,iValue2);

        while(Choice!=0)
        {
         System.out.println("1 For Addition || 2 For Maximum || 3 For Multiplication Table || 0 For exit");
         System.out.println("Enter Your Choice : ");
         Choice=sobj.nextInt();

         switch(Choice)
         {
            case 1:
                   iRet=mobj.Addition();
                   System.out.println("Addition of Two Number is : "+iRet);
                   break;

            case 2:
                   iRet=mobj.Maximum();
                   System.out.println("Maximum of Two Number is : "+iRet);
                   break;

            case 3:
                   mobj.multi_table();
                   break;

            case 0:
                   System.exit(0);
                   break;
         }
        }
    }
}
class Mathematics
{
    public int iNo1;
    public int iNo2;

    public Mathematics(int x,int y)
    {
      iNo1=x;
      iNo2=y;
    }

    public int Addition()
    {
       int iResult=0;
       for(int i=iNo1;i<=iNo2;i++)
       {
           iResult+=i;
       }
       return iResult;
    }

    public int Maximum()
    {
        if(iNo1 > iNo2)
        {
            return iNo1;
        }
        else
        {
            return iNo2;
        }
    }

    void multi_table()
    {
        int i=0;
        System.out.println("Multiplication table of "+iNo1+" is");
        for(i=1;i<=10;i++)
        {
            System.out.println(iNo1+" * " +i+" = " +(iNo1*i));
        }
        
        System.out.println("____________________________________");
        System.out.println("Multiplication table of "+iNo2+" is");
        for(i=1;i<=10;i++)
        {
            System.out.println(iNo2+" * " +i+" = " +(iNo2*i));
        }
    }
}