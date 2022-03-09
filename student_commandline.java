class Student
{
  String name,univ,branch;
  int roll_no;
  void set(int r,String nm,String u,String b)
  {
    roll_no = r;
    name = nm;
    branch=b;    
    univ=u;
  }
  void display()
  {
    System.out.println("Name: "+name);
    System.out.println("Roll no: "+roll_no);
    System.out.println("Branch: "+branch);
    System.out.println("University: "+univ);
  }
public static void main(String args[ ])
{
    Student obj=new Student();
    int roll_no=Integer.parseInt(args[0]);
    obj.set(roll_no,args[1],args[2],args[3]);
    obj.display();
}
}
