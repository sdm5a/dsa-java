import java.util.Scanner;
import java.util.Stack;

public class A_balancedBracket{

    public static boolean isBlanced(String string){
         Stack<Character> st=new Stack<>();
        int n=string.length();
        
        for(int i=0;i<n;i++){
            char ch=string.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='('){
                    st.pop();
                }
            }

        }
        if(st.size()>0){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       

        System.out.print("Enter the strings  of brackets: ");
        String string=sc.nextLine();
        
        System.out.println(isBlanced(string));
        sc.close();
        
        

    }
}