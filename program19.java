import java.util.*;
class program19
{
    public static void main(String arg[])
    {
        Marvellous mobj = new Marvellous();
        int iRet=0;
        String s;

        mobj.Accept();
        mobj.Display();
        s=mobj.ReverseX();
        System.out.println("Reverse string is : "+s);
    }
}
class StringX
{
    public String str;
    
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String : ");
        str=sobj.nextLine();
    }
    public void Display()
    {
        System.out.println("String is : "+str);
    }
}
class Marvellous extends StringX
{
    public String ReverseX()
    {
        char Arr[]=str.toCharArray();
        int iCnt=0,iStart=0;
        int iEnd=Arr.length-1;
        char temp='\0';
        while(iStart<iEnd)
        {
            temp=Arr[iStart];
            Arr[iStart]=Arr[iEnd];
            Arr[iEnd]=temp;

            iStart++;
            iEnd--;
        }
        return String.valueOf(Arr);
    }
}