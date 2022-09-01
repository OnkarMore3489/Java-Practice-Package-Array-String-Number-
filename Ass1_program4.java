/*
 write a program to define class Item(item_code,price,quentity).Define default & parameterized constructors.
 Accpt the details from user. Calculate total price of all items & display details of item entered by user as well as as
 sort all the items on the basis of cost. 
 */
import java.util.*;

class Ass1_program4 
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int no=0;
        System.out.println("How many items you want to enter : ");
        no=sobj.nextInt();

        Item iobj=new Item(no);

        iobj.Accept();
        iobj.Display();
        float fRet=iobj.CalcPrice();
        System.out.println("Total Price of all items is : "+fRet);
        iobj.sort();
    }   
}
class Item
{
    private int item_code[];
    private String Name[];
    private float price[];
    private int quantity[];
    int size;

    public Item(int size)
    {
        this.size=size;
        item_code=new int[size];
        Name=new String[size];
        price=new float[size];
        quantity=new int[size];
    }

    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the details of items : ");
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the item_code of "+(i+1)+" item");
            item_code[i]=sobj.nextInt();

            System.out.println("Enter the Name of "+(i+1)+" item");
            Name[i]=sobj.next();

            System.out.println("Enter the price of "+(i+1)+" item");
            price[i]=sobj.nextFloat();

            System.out.println("Enter the quantity of "+(i+1)+" item");
            quantity[i]=sobj.nextInt();
        }
    }

    public void Display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println("item_code of "+(i+1)+ " item is : "+item_code[i]);
            System.out.println("Name of "+(i+1)+ " item is : "+Name[i]);
            System.out.println("price of "+(i+1)+ " item is : "+price[i]);
            System.out.println("quantity of "+(i+1)+ " item is : "+quantity[i]);
            System.out.println("___________________________________________________________");
        }
    }

    public float CalcPrice()
    {
        float iSum=0;

        for(int i=0;i<size;i++)
        {
            iSum+=quantity[i]*price[i];
        }
        return iSum;
    }

    public void sort()
    {
     System.out.println("****************************************************************************");
     System.out.println("Items After sorting : ");
     
      for(int i=0;i<size;i++)
      {
          for(int j=i+1;j<size;j++)
          {
              if(price[i]>price[j])
              {
                  int code=item_code[i];
                  String newName=Name[i];
                  float temp=price[i];
                  int quant=quantity[i];

                  item_code[i]=item_code[j];
                  Name[i]=Name[j];
                  price[i]=price[j];
                  quantity[i]=quantity[j];

                  item_code[j]=code;
                  Name[j]=newName;
                  price[j]=temp;
                  quantity[j]=quant;
              }
          }
      }
      Display();
    }
}
