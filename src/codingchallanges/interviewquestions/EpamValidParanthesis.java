package codingchallanges.interviewquestions;

import java.util.Map;
import java.util.Stack;

/**
 * Epam second program
 */
public class EpamValidParanthesis {
    public static void main(String[] args) {
        String test1 = "{[()]}";// TRUE CASE {}[]()
// Below method call should print true
        System.out.println(solution(test1));

        String test2 = "{]]]](";
// Below method call should print false
        System.out.println(solution(test2));
    }


    public static boolean solution(String input) {

        Stack<Character> dataStack = new Stack<>();

        Map<Character, Character> characterMap = Map.of('}', '{', ')', '(', ']', '[');
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '['){
                dataStack.push(input.charAt(i));
            } else {
                Character pop = dataStack.pop();
                if(!pop.equals(characterMap.get(input.charAt(i))))
                {
                    return false;
                }
            }

        }

    return true;
    }
}

