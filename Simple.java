import java.util.Scanner;
class Simple
{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        String s3="";
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        int s=s1.length()-s2.length();
        for(int i=0,j=0;i<s1.length();i++)
        {
            if(i<s)
            {
                s3+=c1[i];
            }
            else
            {
                if(c1[i]==c2[j])
                {
                    s3+=c1[i];
                    j++;
                }
                else{
                int k=(int)c1[i];
                int a=(int)c2[j++];
                char c;
                if(k-a>0)
                {
                    c=(char)((k-a)+96);
                }
                else
                {
                    c=(char)(123+(k-a));
                }
                s3+=c;
            }
            }
        }
        System.out.println(s3);
    }
}