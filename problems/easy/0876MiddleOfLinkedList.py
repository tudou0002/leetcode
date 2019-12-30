# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def middleNode(self, head: ListNode) -> ListNode:
        """
        version 1
        improvement: change line 15 to
        l.append(cur)
        thus no need to traverse the second time
        l = []
        cur = head
        while(cur != None):
            l.append(int(cur.val))
            cur = cur.next
        index = 0
        if(len(l)%2 == 0):
            index = int(len(l)/2 )
        else:
            index = int(len(l)//2)
        while(index != 0):
            head = head.next
            index -= 1
        return head
        """
        # a O(1) RT and O(n) memory solution, soo cool!!
        
        slow = head
        fast = head
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
        return slow