package tasks.grocery;


import java.util.ArrayList;

//2. printGroceryList
//3. removeGroceryItem
//4.modifyGroceryItem
//5. searchItem
public class GroceryList {

    //Field
    private ArrayList<String> groceryList = new ArrayList<>();

    //Methods

    //Adding new item to the list
    public void  addGroceryItem (String item){
        groceryList.add(item);
    }

    //Print all list iteam
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in you grocery list");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //emove Grocery item
    public void removeGroceryItem(String item){

    }
    //Returning intems index


}
