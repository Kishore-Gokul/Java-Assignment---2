class code22
{
public int roll;
public String name;
code22(int roll,String name)
{
this.roll=roll;
this.name=name;
}
 
public static void main(String[]args)
{
code22[]arr;
arr=new code22[5];
arr[0]=new code22(1,"a");
arr[1]=new code22(2,"b");
arr[2]=new code22(3,"c");
arr[3]=new code22(4,"d");
arr[4]=new code22(5,"e");
for (int i=0;i<arr.length;i++)
{
System.out.println(arr[i].roll+" "+arr[i].name);
}
}
}
