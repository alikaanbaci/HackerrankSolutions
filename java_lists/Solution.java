package java_lists;

import java.util.List;


abstract class Operation{
    int index;
    Operation(int index){
        this.index = index;
    }
}

class Insert extends Operation{
    int insertedElement;

    public Insert(int index, int insertedElement) {
        super(index);
        this.insertedElement = insertedElement;
    }
}

class Delete extends Operation{
    public Delete(int index) {
        super(index);
    }
}

public class Solution {
    public List query(List queryArray, List<Operation> operations){
        for (Operation operation : operations){
            if(operation.getClass().getSimpleName().equals("Insert")){
                Insert insert = (Insert) operation;
                queryArray.add(insert.index, insert.insertedElement);
                continue;
            }
            if (operation.getClass().getSimpleName().equals("Delete")){
                Delete delete = (Delete) operation;
                queryArray.remove(delete.index);
                continue;
            }
            System.out.println("Error wrong operation type");
        }
        return queryArray;
    }
}
