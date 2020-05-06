public class 两个链表的共同节点 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null && pHead2 == null){
            return null;
        }
        int listLingth1 = 0;
        int listLingth2 = 0;
        ListNode pHead1index = pHead1;
        ListNode pHead2index = pHead2;
        while (pHead1index.next != null) {
            listLingth1++;
            pHead1index = pHead1index.next;
        }
        while (pHead2index.next != null) {
            listLingth2++;
            pHead2index = pHead2index.next;
        }
        pHead1index = pHead1;
        pHead2index = pHead2;
        if (listLingth1 >= listLingth2) {
            int list1index = listLingth1 - listLingth2;
            while (list1index > 0) {
                pHead1index = pHead1index.next;
                list1index--;
            }
        } else {
            int list2index = listLingth2 - listLingth1;
            while (list2index > 0) {
                pHead2index = pHead2index.next;
                list2index--;
            }
        }
        while (pHead2index.next !=null && pHead1index.next != null && pHead1index.val != pHead2index.val) {
            pHead1index = pHead1index.next;
            pHead2index = pHead2index.next;
        }
        if (pHead1index.val == pHead2index.val) {
            return pHead1index;
        } else {
            return null;
        }
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }



    public static void main(String[] args) {
        两个链表的共同节点 a = new 两个链表的共同节点();
        ListNode pHead1 = new ListNode(1);
        ListNode pHead11 = new ListNode(2);
        ListNode pHead12 = new ListNode(3);
        ListNode pHead13 = new ListNode(4);
        ListNode pHead14 = new ListNode(5);
        pHead1.next = pHead11;
        pHead11.next = pHead12;
        pHead12.next = pHead13;
        pHead13.next = pHead14;
        ListNode pHead2 = new ListNode(6);
        ListNode pHead21 = new ListNode(7);
        ListNode pHead22 = new ListNode(8);
        ListNode pHead23 = new ListNode(9);
        ListNode pHead24 = new ListNode(10);
        pHead2.next = pHead21;
        pHead21.next = pHead22;
        pHead22.next = pHead23;
        pHead23.next = pHead24;
        System.out.println(a.FindFirstCommonNode(pHead1,null));





    }
}

