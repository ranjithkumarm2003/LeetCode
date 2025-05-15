class MinStack {
    Stack<Integer> st = new Stack<>();
    TreeSet<Integer> set = new TreeSet<>();
    HashMap<Integer, Integer> map=new HashMap<>();

    public MinStack() {

    }

    public void push(int val) {
        set.add(val);
        st.push(val);
        if(!map.containsKey(val)){
            map.put(val,1);
        }
        else{
            map.put(val,map.get(val)+1);
        }
    }

    public void pop() {
        int ele = st.pop();
        
        if(map.get(ele)==1) {
            set.remove(ele);
            map.remove(ele);
        }
        else{
            map.put(ele,map.get(ele)-1);
        }
        
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        int min = set.iterator().next();
       
        return min;

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */