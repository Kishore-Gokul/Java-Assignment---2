import java.util.StringTokenizer;
class code16{
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("my,name,is,kishore");
        while(st.hasMoreTokens()){
            System.out.println("Next Token is:"+st.nextToken(","));
        }
    }
}