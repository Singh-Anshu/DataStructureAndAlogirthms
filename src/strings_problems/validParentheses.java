package strings_problems;

import java.util.Stack;

public class validParentheses {
    public static boolean check(String s)
    {
        Stack st= new Stack();
        for(char c:s.toCharArray())
        {
            if(c=='('||c=='['||c=='{')
                st.push(c);
            else {
                if(st.isEmpty())
                    return false;
                {
                    char top=(char)st.peek();
                    if(c==')'&&'('==top||c=='}'&&'{'==top||c==']'&&'['==top)
                    {
                        st.pop();
                    }
                    else
                        return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static boolean isValid(String s) {
        boolean ans=check(s);
        System.out.println("Answer is: "+ans);
        return ans;
    }

    public static void main (String args[] ){
        System.out.println(isValid("([{}])"));
    }

}
