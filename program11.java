import java.util.Scanner;
import MarvellousNumbers.ArrayX;

class program11
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iLength=0,iRet=0;

        System.out.println("Enter the No Of Elements : ");
        iLength=sobj.nextInt();

        Marvellous mobj = new Marvellous(iLength);
        mobj.Accept();
        mobj.Display();
        iRet=mobj.Addition();
        System.out.println("Addition of Entered Element is : "+iRet);
    }
}
class Marvellous extends ArrayX
{
    public Marvellous(int iValue)
    {
        super(iValue);
    }

    public int Addition()
    {
        int iSum=0,iCnt=0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            iSum+=Arr[iCnt];
        }
        return iSum;
    }
}