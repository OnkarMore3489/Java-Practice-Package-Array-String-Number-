import java.util.Scanner;
class program10
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
class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr=new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in); 
        int iCnt=0;
        System.out.println("Enter the Element : ");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt=0;
        System.out.println("Elements are : ");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
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