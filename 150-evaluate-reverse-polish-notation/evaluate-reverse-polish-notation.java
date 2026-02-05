class Solution {
    public int evalRPN(String[] tokens) {

        Stack<String> st = new Stack<>();

        for(String e : tokens){
            if(e.equals("+") || e.equals("-") || e.equals("*") || e.equals("/")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());

                st.push(Integer.toString(evaluate(a, b, e)));
            }else{
                st.push(e);
            }
        }

        return Integer.parseInt(st.pop());
        
    }

    private int evaluate(int b, int a, String e){
        if(e.equals("+")){

            return a + b;



        }else if(e.equals("-")){

            return a - b;



    
        }else if(e.equals("*")){

            return a * b;



        }else{

            return a/b;



        }
    }
}