# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        cur = head
        last = None
        while cur != None:
            node = cur.next
            cur.next = last
            last = cur
            cur = node
        return last