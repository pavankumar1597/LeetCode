import java.util.HashMap;
import java.util.Stack;

public class validparenthisis {
    public boolean isValid(String s) {

        HashMap<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');


        Stack<Character> stack = new Stack();

        for(char charrr : s.toCharArray() ){
            if(map.containsKey(charrr) ){

                Character ele = stack.empty()?'#':stack.pop();

                if(!ele.equals(map.get(charrr))){
                    return false;
                }
            }else{
                stack.push(charrr);
            }
        }

        return (stack.size() > 0)? false   : true ;


    }
}
