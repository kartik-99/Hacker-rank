import java.util.*;
class JavaStack{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(check(input));
        }
    }    
    public static boolean check(String s){
        List<Character> open = new ArrayList();
        open.add('(');
        open.add('{');
        open.add('[');


        List<Character> close = new ArrayList();
        close.add(')');
        close.add('}');
        close.add(']');

        Stack<Character> stack = new Stack<Character>();


        char ch, p;
        int l = s.len();
        for(int i=0; i<l; i++){
            ch = s.charAt(i);
            if(open.indexOf(ch)!=-1){
                stack.push(ch);
            }else{
                if(stack.empty()) return false;
                p = stack.pop();
                if(open.indexOf(p)!=close.indexOf(ch)) return false;
            }
        }

        if(stack.empty()) return true;
        else return false;
    }
}
