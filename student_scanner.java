import java.util.*;
class Student
{
  String name,univ,branch;
  int roll_no;
  void set(String nm,int r,String u,String b)
  {
    name = nm;
    roll_no = r;
    univ=u;
    branch=b;
  }
  void display()
  {
    System.out.println("Name: "+name);
    System.out.println("Roll no: "+roll_no);
    System.out.println("Branch: "+branch);
    System.out.println("University: "+univ);
  }
public static void main(String args[])
{
    Student obj=new Student();
    Scanner sc= new Scanner(System.in);
   System.out.println("enter your name");
   String name = sc.nextLine();
   System.out.println("enter your roll no");
    int roll_no = sc.nextInt();
    System.out.println("enter your university");
     String university = sc.nextLine();
     System.out.println("enter your branch");
     String branch = sc.nextLine();
     obj.set(name,roll_no,university,branch);
     obj.display();
   }
     
   }
