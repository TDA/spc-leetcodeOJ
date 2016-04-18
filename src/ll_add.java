/**
 * Created by schandramouli on 4/17/16.
 */
public class ll_add {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String s1 = "";
        while (l1 != null) {
            s1 += l1.val;
            l1 = l1.next;
        }
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        s1 = sb.toString();
        System.out.println(s1);

        String s2 = "";
        while (l2 != null) {
            s2 += l2.val;
            l2 = l2.next;
        }
        sb = new StringBuilder(s2);
        sb.reverse();
        s2 = sb.toString();
        System.out.println(s2);
        long sum = Long.parseLong(s1) + Long.parseLong(s2);

        String sumString = sum + "";
        System.out.println(sumString);
        ListNode n = new ListNode(Character.getNumericValue(sumString.charAt(sumString.length() - 1)));
        ListNode soln = n;
        System.out.println(n);
        for (int i = sumString.length() - 2; i >= 0; i--) {
            ListNode x = new ListNode(Character.getNumericValue(sumString.charAt(i)));
            n.next = x;
            n = n.next;
        }
        return soln;
    }

    public ListNode addTwoNumbersLL(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null? l2 : l1;
        }
        ListNode n = new ListNode(l1.val + l2.val);
        ListNode soln = n;
        l1 = l1.next;
        l2 = l2.next;
        int carry = 0;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                l1 = new ListNode(0);
            }
            if (l2 == null) {
                l2 = new ListNode(0);
            }
            System.out.println(l1.val);
            System.out.println(l2.val);

            int sum = l1.val + l2.val + carry;
            if (sum >= 10 ) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            n.next = new ListNode(sum);
            l1 = l1.next;
            l2 = l2.next;
            n = n.next;
        }

        return soln;
    }


    public static void main(String[] args) {
        ll_add llAdd = new ll_add();
        ListNode x = new ListNode(2);
        x.next = new ListNode(4);
        x.next.next = new ListNode(3);

        ListNode y = new ListNode(5);
        y.next = new ListNode(6);
        //y.next.next = new ListNode(4);
        System.out.println(llAdd.addTwoNumbersLL(x,y));

    }
}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
