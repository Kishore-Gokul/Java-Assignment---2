import java.util.StringTokenizer;
class code18{
public static void main(String[]args){
StringTokenizer st=new StringTokenizer("What would meek do how do you respond","");
while(st.hasMoreElements()){
System.out.println("Next token is:"+st.nextToken(","));
}
}
}
