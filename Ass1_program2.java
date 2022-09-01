/*
Write the program to accept string from the user and perform the operation on it as
per following menu.

1.print the Reverse of the string.
2.Find the length of the string.
3.print the alternate character of the string.
 */
import java.util.*;

class Ass1_program2 
{
    public static void main(String args[])
    {
        Reverse robj = new Reverse();

        robj.Accept();

        robj.Reverse();

        int iRet=robj.StrlenX();
        System.out.println("length of string is : "+iRet);

        robj.AltChar();
    }    
}
class Reverse
{
    public String str;

    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the string : ");
        str=sobj.nextLine();
    }

    public void Reverse()
    {
        for(int i=str.length()-1;i>=0;i--)
        {
           char c=str.charAt(i);
           System.out.print(c);;
        }
        System.out.println();
    }

    public int StrlenX()
    {
        return str.length();
    }

    public void AltChar()
    {
        for(int i=0;i<str.length();i=i+2)
        {
             System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}