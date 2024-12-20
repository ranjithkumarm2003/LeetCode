/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            while(lists[i]!=null){
                li.add(lists[i].val);
                lists[i]=lists[i].next;
            }
        }
        Collections.sort(li);
        ListNode res=new ListNode(0);
        ListNode ans=res;
        for(int i:li){
            res.next=new ListNode(i);
            res=res.next;
        }
        return ans.next;
    }
}