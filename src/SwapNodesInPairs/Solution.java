/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwapNodesInPairs;

import java.util.ArrayList;


public class Solution {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode swapPairs(ListNode head) {
        
        if (head == null || head.next == null)
            return head;
        
        ArrayList<Integer> tmpArray = new ArrayList<Integer>();
        while (head !=null)
        {
            tmpArray.add(head.val);
            head = head.next;
        }
        
        for (int i=0; i<tmpArray.size();i = i + 2)
        {
            if (i+1 < tmpArray.size())
            {
               int tmp = tmpArray.get(i+1);
                tmpArray.set(i+1, tmpArray.get(i)) ;
                tmpArray.set(i, tmp); 
            }
            
        }
        
        ListNode output = new ListNode(tmpArray.get(0));
        ListNode cur = output;
        for (int i=1; i< tmpArray.size();i++)
        {
            
            ListNode tmp = new ListNode(tmpArray.get(i));
            cur.next = tmp;
            cur= cur.next;
        }
        
        return output;
    }
}
