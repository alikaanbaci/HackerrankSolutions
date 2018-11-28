package java_lists;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolTest {
    Solution solution = new Solution();
    List<Operation> operations = new ArrayList<Operation>();
    Operation insert = new Insert(5,23);
    Operation delete = new Delete(0);
    List<Integer> queryArray = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    @Test
    public void queryTest(){
        operations.add(insert);
        operations.add(delete);
        queryArray.add(12);
        queryArray.add(0);
        queryArray.add(1);
        queryArray.add(78);
        queryArray.add(12);
        result.add(0);
        result.add(1);
        result.add(78);
        result.add(12);
        result.add(23);

        Assert.assertEquals(result, solution.query(queryArray, operations));
    }
}

















