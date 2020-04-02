public class Task2 {

    //    2*) Задан отсортированный список который состоит из ListNode.
//    Написать метод deleteDuplicates, который вернет список без дубликатов.
//    /**
//     * public class ListNode {
//     * int val;
//     * ListNode next;
//     * ListNode(int x) { val = x; }
//     * }
//     */
//    public ListNode deleteDuplicates(ListNode head) { ...}
//    Example:
//    Input: 1->1->2->3->3
//    Output: 1->2->3

    public static class ListNode {
        public int value;
        public ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            ListNode tmp = this;
            while (tmp != null) {
                if (tmp.next == null) {
                    System.out.print(tmp.getValue());
                } else {
                    System.out.print(tmp.getValue() + "->");
                }
                tmp = tmp.next;
            }
            return "";
        }
    }

    public static void main(String[] args) {

        ListNode ln = initListOfNodes();
        System.out.print("Input: ");
        System.out.println(ln.toString());
        try {
            ln = deleteDuplicates(ln);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("Output: ");
        System.out.println(ln.toString());
    }

    private static ListNode deleteDuplicates(ListNode ln) throws Exception {
        if (ln == null) {
            throw new Exception("NullObjectException");
        }
        ListNode tmp = ln;
        while (tmp.next != null) {
            if (tmp.getValue() == tmp.next.getValue()) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
        return ln;
    }


    private static ListNode initListOfNodes() {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 5, 7, 8, 9, 9, 10};
        ListNode result = new ListNode(1);
        ListNode tmp = result;
        for (int value : arr) {
            tmp.next = new ListNode(value);
            tmp = tmp.next;
        }
        return result;
    }

}

