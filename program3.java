import java.util.Scanner;
class program3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1=0,iNo2=0,iAns=0;

        System.out.println("Enter the First Number : ");
        iNo1=sobj.nextInt();
        System.out.println("Enter the Second Number : ");
        iNo2=sobj.nextInt();
        
        iAns=Addition(iNo1,iNo2);
        System.out.println("Addition of two Number is : "+iAns);
    }

    public static int Addition(int i,int j)
    {
        return i+j;
    }
    
}
