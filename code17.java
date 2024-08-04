import java.util.StringTokenizer;
class code17{
public static void main(String[]args){
StringTokenizer st=new StringTokenizer("all this money on the floor lemme drop more","");
while(st.hasMoreTokens())
{
System.out.println("Next token is:"+st.nextToken(","));
}
}
}
