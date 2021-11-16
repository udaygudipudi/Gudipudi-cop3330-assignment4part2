package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void newdescription(){

        ToDoList test = new ToDoList();

        test.additem("test", "test", "test");
        test.itemdescription("test", "newtest");


        assertEquals(Item.readdescription(), "newtest");

    }

    @Test
    void newduedate(){

        ToDoList test = new ToDoList();

        test.additem("test", "test", "test");
        test.itemduedate("test", "newtest");


        assertEquals(Item.readduedate(), "newtest");

    }

    @Test
    void newcheck(){

        ToDoList test = new ToDoList();

        test.additem("test", "test", "test");
        test.itemcompletion("test", "complete");


        assertEquals(Item.readcheck(), "complete");

    }

}