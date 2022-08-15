import java.util.Scanner;
class program4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1=0,iNo2=0,iAns=0;

        System.out.println("Enter the First Number : ");
        iNo1=sobj.nextInt();
        System.out.println("Enter the Second Number : ");
        iNo2=sobj.nextInt();
        
        Marvellous mobj = new Marvellous();

        iAns=mobj.Addition(iNo1,iNo2);
        System.out.println("Addition of two Number is : "+iAns);
    }
}
class Marvellous
{
    public int Addition(int i,int j)
    {
        return i+j;
    }
}
