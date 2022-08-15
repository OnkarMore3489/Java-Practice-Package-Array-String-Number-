import java.util.*;
class program17
{
    public static void main(String arg[])
    {
        Marvellous mobj = new Marvellous();
        int iRet=0;

        mobj.Accept();
        mobj.Display();
        iRet=mobj.CountVowel();
        System.out.println("No of Vowels is : "+iRet);
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
    public int CountVowel()
    {
        char Arr[]=str.toCharArray();
        int iCnt=0,i=0;
        while(i<Arr.length)
        {
            if((Arr[i]=='a') || (Arr[i]=='e') || (Arr[i]=='i') || (Arr[i]=='o') || (Arr[i]=='u'))
            {
              iCnt++;
            }
            i++;
        }
        return iCnt;
    }
}