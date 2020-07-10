package Aiwa.View;

import java.util.ArrayList;

import Aiwa.Entity.Item;

public class ItemView {
    public void showList(ArrayList<Item> items){
        for(int i = 0;i<items.size();i++){
            Item item = items.get(i);
        }
    }
}