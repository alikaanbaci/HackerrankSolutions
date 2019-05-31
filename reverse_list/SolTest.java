package reverse_list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolTest {
    ListNode head = null;
    @Before
    public void setUp(){
        ListNode tmp = null;
        for (int i = 5; i > 0; i--){
            tmp = new ListNode(i);
            tmp.next = head;
            head = tmp;
        }
    }

    @Test
    public void reverseListTest(){
        Solution solution = new Solution();
        ListNode result = solution.reverseList(head);
        int i = 5;
        while (result != null){
            Assert.assertEquals(i, result.val);
            result = result.next;
            i--;
        }
    }

}
