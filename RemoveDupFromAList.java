package LinkedLists;

/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

	For example,
	Given 1->1->2, return 1->2.
	Given 1->1->2->3->3, return 1->2->3.
 */

public class RemoveDupFromAList {
		/*public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;

         while(list != null) {
        	 if (list.next == null) {
        		 break;
        	 }
        	 if (list.val == list.next.val) {
        		 list.next = list.next.next;
        	 } else {
        		 list = list.next;
        	 }
         }

         return head;
    }
	*/

}

/*
 * public ListNode deleteDuplicates(ListNode head) {
    if(head==null||head.next==null) return head;
    ListNode dummy=head;
    while(dummy.next!=null){
        if(dummy.next.val==dummy.val){
            dummy.next=dummy.next.next;
        }else dummy=dummy.next;
    }
    return head;
}
 */


