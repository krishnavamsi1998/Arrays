//O(n),O(n)
class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            Character cur=s.charAt(i);
            if(cur=='[' || cur=='(' || cur=='{')
            st.push(cur);
            else
            {
                if(st.empty())
                    return false;
                Character ch=st.pop();
                if(ch=='('&& cur==')' || ch=='['&&cur==']' || ch=='{'&&cur=='}')
                    continue;
                else
                    return false;               

            }
        }

        if(!st.empty())
        return false;
        else
        return true; 
    }
}
