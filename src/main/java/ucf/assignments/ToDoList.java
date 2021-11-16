package ucf.assignments;

import java.io.*;
import java.util.ArrayList;

public class ToDoList<string > {


    private static String title;
    private static int numofitems;
    private static ArrayList<Item> itemlist;


    public ToDoList(){

        this.title = "OnlyList";

        this.numofitems = 0;

        this.itemlist = new ArrayList<>();
    }

    public static int numofitems(){

        return numofitems;

    }

    public void additem(String description, String duedate, String check) {

        Item newitem = new Item();

        newitem.newdescription(description);
        newitem.newduedate(duedate);
        newitem.newcheck(check);

        itemlist.add(newitem);

        numofitems++;

    }

    public void removeitem (String description) {

        for(int i = 0; i < numofitems; i++){

            if (itemlist.get(i).readdescription() == description) {

                itemlist.remove(i);

            }
        }

        numofitems--;

    }

    public void removeallitems () {

        for(int i = 0; i < numofitems; i++){

            itemlist.remove(i);

        }

        numofitems = 0;

    }

    public void itemdescription (String olddescription, String newdescription) {

        for(int i = 0; i < numofitems; i++){

            if (itemlist.get(i).readdescription() == olddescription) {

                itemlist.get(i).newdescription(newdescription);

            }
        }

    }

    public void itemduedate (String description, String duedate) {

        for(int i = 0; i < numofitems; i++){

            if (itemlist.get(i).readdescription() == description) {

                itemlist.get(i).newduedate(duedate);

            }
        }

    }

    public void itemcompletion (String description, String completion) {

        for(int i = 0; i < numofitems; i++){

            if (itemlist.get(i).readdescription() == description) {

                itemlist.get(i).newcheck(completion);

            }
        }

    }

    public void displayallitems () {

        for(int i = 0; i < numofitems; i++){

            System.out.printf("%s %n",itemlist.get(i).readdescription());
            System.out.printf("%s %n",itemlist.get(i).readduedate());
            System.out.printf("%s %n",itemlist.get(i).readcheck());

        }

    }

    public void displayallcompleteitems () {

        for(int i = 0; i < numofitems; i++){

            if(itemlist.get(i).readcheck() == "complete"){

                System.out.printf("%s %n",itemlist.get(i).readdescription());
                System.out.printf("%s %n",itemlist.get(i).readduedate());
                System.out.printf("%s %n",itemlist.get(i).readcheck());

            }

        }

    }

    public void displayallincompleteitems () {

        for(int i = 0; i < numofitems; i++){

            if(itemlist.get(i).readcheck() == "incomplete"){

                System.out.printf("%s %n",itemlist.get(i).readdescription());
                System.out.printf("%s %n",itemlist.get(i).readduedate());
                System.out.printf("%s %n",itemlist.get(i).readcheck());

            }

        }

    }

    public void savelist () throws IOException {

        FileOutputStream saveFile = new FileOutputStream("SaveList.sav");

        ObjectOutputStream save = new ObjectOutputStream(saveFile);

        save.writeObject(itemlist);

        save.close();

    }

}
