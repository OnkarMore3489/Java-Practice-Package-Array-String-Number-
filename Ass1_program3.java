/*
Write a program to define a class student(Roll no ,name,marks) and perform the operations:

1.Accept student details.
2.Display the student scoring maximum marks.

Define suitablable constructor.
 */
import java.util.*;
class Ass1_program3 
{
    public static void main(String arg[])
    {
     Scanner sobj = new Scanner(System.in);

     int no=0;
     System.out.println("How many student details you want to enter : ");
     no=sobj.nextInt();
    //  sobj.skip(System.lineSeparator());

     Student stud=new Student(no);

     stud.Accept();
     //stud.Display();
     stud.Maximum();
    }
}
class Student
{
    private int rollNo[];
    private String Name[];
    private float marks[];
    private int size;

    public Student(int size)
    {
        this.size=size;
        rollNo=new int[this.size];
        Name=new String[this.size];
        marks=new float[this.size];
    }

    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the details of student : ");
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the Name of "+(i+1)+" student");
            Name[i]=sobj.next();

            System.out.println("Enter the Roll No of "+(i+1)+" student");
            rollNo[i]=sobj.nextInt();

            System.out.println("Enter the marks of "+(i+1)+" student");
            marks[i]=sobj.nextFloat();
            
        }
    }

    // public void Display()
    // {
    //     for(int i=0;i<size;i++)
    //     {
    //         System.out.println("Name of "+i+ " student is : "+Name[i]);
    //         System.out.println("rollNo of "+i+ " student is : "+rollNo[i]);
    //         System.out.println("marks of "+i+ " student is : "+marks[i]);
    //     }
    // }

    public void Maximum()
    {
        int counter=0;
        float iMax=marks[0];

        for(int i=0;i<size;i++)
        {
            if(marks[i] > iMax)
            {
                counter=i;
                iMax=marks[i];
            }
        }
        System.out.println("Maximum marks are : "+iMax);
        System.out.println("Name of Student who got Maximum marks is : "+Name[counter]);
    }
}