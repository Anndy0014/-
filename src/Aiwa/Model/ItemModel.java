package Aiwa.Model;

import java.util.ArrayList;

import Aiwa.*;
import Aiwa.DataBase.ItemTable;
import Aiwa.Entity.Item;
public class ItemModel {
    public ArrayList<Item> findByID(int keyword){
        ItemTable it = new ItemTable();
        ArrayList<Item> data = it.getData();
        ArrayList<Item> result = new ArrayList<>();

        for(int i = 0; i < data.size();i++){
            Item s = data.get(i);
            int id = s.getId();
            if(id== keyword){
                result.add(s);
            }
            
        }
        for(int i = 0;i<result.size();i++){
            Item s = result.get(i);
            System.out.println(s.getId());
        }
        return result;
    }
    public ArrayList<Item> findByName(String keyword){
        ItemTable it = new ItemTable();
        ArrayList<Item> data = it.getData();
        ArrayList<Item> result = new ArrayList<>();

        for(int i = 0; i < data.size();i++){
            Item s = data.get(i);
            String name = s.getName();
            if(name.contains(keyword)){
                result.add(s);
            }
            
        }
        for(int i = 0;i<result.size();i++){
            Item s = result.get(i);
            System.out.println(s.getName());
        }
        return result;
    }
    public ArrayList<Item> findByPrice(int min,int max){
        ItemTable it = new ItemTable();
        ArrayList<Item> data = it.getData();
        ArrayList<Item> result = new ArrayList<>();

        for(int i = 0; i< data.size();i++){
            Item s = data.get(i);
            int price = s.getPrice();
            if(price>min && price <= max ){
                result.add(s);
            }
        }
        return result;
    }
    public ArrayList<Item> findByImage(String keyword){
        ItemTable it = new ItemTable();
        ArrayList<Item> data = it.getData();
        ArrayList<Item> result = new ArrayList<>();

        for(int i = 0; i < data.size();i++){
            Item s = data.get(i);
            String image = s.getImage();
            if(image.contains(keyword)){
                result.add(s);
            }
            
        }
        for(int i = 0;i<result.size();i++){
            Item s = result.get(i);
            System.out.println(s.getImage());
        }
        return result;
    }

}