/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeKSortedLists;

import java.util.ArrayList;
import java.util.Collections;


public class Solution {
    
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        else
        {
            ArrayList<Integer> tmpOutput = new ArrayList();
            for (int i=0; i< lists.length; i++)
            {
                ListNode cur = lists[i];
                while (cur != null)
                {
                    tmpOutput.add(cur.val);
                    cur = cur.next;
                }
            }
            
            if (tmpOutput.size() == 0)
                return null;
            
            Collections.sort(tmpOutput);
            
            ListNode output = new ListNode(tmpOutput.get(0));
            ListNode cur = output;
            for (int i=1;i<tmpOutput.size();i++)
            {
                ListNode tmp = new ListNode(tmpOutput.get(i));
                cur.next = tmp;
                cur = cur.next;
            }
            
            return output;
        }
        
    }
    
    
    /*
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode output = new ListNode(0);
        if (lists.length == 0)
            return null;
        else
        {
            output = lists[0];
            
            for (int i=1; i<lists.length; i++)
            {
                ListNode cur1 = output;
                ListNode cur1Next = cur1.next;
                ListNode cur2 = lists[i];
                ListNode cur2Next = cur2.next;
                
                while (cur1 != null || cur2 != null)
                {
                    if (cur1 != null && cur2 != null)
                    {
                        
                    }
                    else if (cur1 == null && cur2 != null)
                    {
                        
                    }
                    else //cur1 != null && cur2 == null 
                    {
                        
                    }
                }
                
            }
            
            return output;
        }
    }
    */

}
