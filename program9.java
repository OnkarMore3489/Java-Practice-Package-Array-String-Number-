import java.util.Scanner;
class program9
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize=0,iCnt=0,iRet=0;
        System.out.println("Enter Number of Elements : ");
        iSize=sobj.nextInt();

        int Arr[]=new int[iSize];

        System.out.println("Enter Numbers : ");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }

        Marvellous mobj = new Marvellous();
        iRet=mobj.Addition(Arr);
        System.out.println("Addition of Entered Numbers is : "+iRet);
    }    
}
class Marvellous
{
    public int Addition(int Brr[])
    {
        int iSum=0,iCnt=0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
            iSum+=Brr[iCnt];
        }
        return iSum;
    }
}

