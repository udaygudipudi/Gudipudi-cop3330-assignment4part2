package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void additem() {

        ToDoList test = new ToDoList();

        test.additem("test", "test", "test");

        assertEquals(ToDoList.numofitems(), 1);

    }


    @Test
    void removeitem(){

        ToDoList test = new ToDoList();

        test.additem("test", "test", "test");
        test.removeitem("test");

        assertEquals(ToDoList.numofitems(), 0);

    }

    @Test
    public void removeallitems () {

        ToDoList test = new ToDoList();

        test.additem("test", "test", "test");
        test.additem("test2", "test2", "test2");
        test.additem("test3", "test3", "test3");
        test.removeallitems();

        assertEquals(ToDoList.numofitems(), 0);

    }

    @Test
    void itemdescription(){

        ToDoList test = new ToDoList();

        test.additem("test", "test", "test");
        test.itemdescription("test", "newtest");


        assertEquals(Item.readdescription(), "newtest");

    }

    @Test
    void itemduedate(){

        ToDoList test = new ToDoList();

        test.additem("test", "test", "test");
        test.itemduedate("test", "newtest");


        assertEquals(Item.readduedate(), "newtest");

    }

    @Test
    void itemcompletion(){

        ToDoList test = new ToDoList();

        test.additem("test", "test", "test");
        test.itemcompletion("test", "complete");


        assertEquals(Item.readcheck(), "complete");

    }

}