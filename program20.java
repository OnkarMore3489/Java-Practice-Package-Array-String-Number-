import java.util.*;
class program20
{
    public static void main(String arg[])
    {
        Marvellous mobj = new Marvellous();
        int iRet=0;
        String s;
        boolean bRet=false;

        mobj.Accept();
        mobj.Display();
        bRet=mobj.CheckPalindrome();
        if(bRet==true)
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }
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
    public boolean CheckPalindrome()
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
        String newstr = new String(Arr);
        boolean bResult = newstr.equals(str);
        return bResult;
    }
}