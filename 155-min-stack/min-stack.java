class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> s = new Stack<>();
    TreeSet<Integer> set = new TreeSet<>();

    public MinStack() {

    }

    public void push(int val) {
        set.add(val);
        st.push(val);
    }

    public void pop() {
        int ele = st.pop();
        int c = 0;
        while (!st.isEmpty()) {
            if (st.peek() == ele)
                c++;
            s.push(st.pop());
        }
        while (!s.isEmpty()) {
            st.push(s.pop());
        }
        if(c==0) set.remove(ele);
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