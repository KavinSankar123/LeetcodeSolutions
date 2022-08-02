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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null;
        
    
        while (slow != null) {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        

        
        while (prev != null) {
            if (head.val != prev.val)
                return false;
            
            head = head.next;
            prev = prev.next;
        }
            
        return true;
        

//         ArrayList<Integer> values = new ArrayList<>();
        
//         ListNode curr = head;
        
//         while (curr != null) {
//             values.add(curr.val);
//             curr = curr.next;
//         }
        
//         curr = head;
//         int counter = 0;
        
//         for (int i = values.size() - 1; i >= 0; i--) {
//             if (values.get(i) != values.get(counter)) {
//                 return false;
//             }
//             if (counter == i)
//                 break;
            
//             counter++;
//         }

//         return true;
    }

}
