package Aiwa.DataBase;

import java.util.ArrayList;

import Aiwa.Entity.Item;

public class ItemTable {

	public ArrayList<Item> getData() {
		Item i1 = new Item();
		i1.setId(1);
		i1.setName("doraemon");
		i1.setPrice(858);
		i1.setImage("https://images-na.ssl-images-amazon.com/images/I/51C25EWK73L._SX312_BO1,204,203,200_.jpg");

		Item i2 = new Item();
		i2.setId(2);
		i2.setName("songoku");
		i2.setPrice(935);
		i2.setImage("https://m.media-amazon.com/images/I/51sPhb+d8vL._SY346_.jpg");

		Item i3 = new Item();
		i3.setId(3);
		i3.setName("one piece");
		i3.setPrice(460);
		i3.setImage("https://m.media-amazon.com/images/I/61ChpMuiHEL._SY346_.jpg");

		Item i4 = new Item();
		i4.setId(4);
		i4.setName("Decective Conan");
		i4.setPrice(1128);
		i4.setImage("https://images-na.ssl-images-amazon.com/images/I/51xa9+6O1cL._SX385_BO1,204,203,200_.jpg");

		Item i5 = new Item();
		i5.setId(5);
		i5.setName("Kimetsu no Yaiba");
		i5.setPrice(1211);
		i5.setImage("https://images-na.ssl-images-amazon.com/images/I/51Y5UXaQ9CL._SX331_BO1,204,203,200_.jpg");

		ArrayList<Item> data = new ArrayList<>();
		data.add(i1);
		data.add(i2);
		data.add(i3);
		data.add(i4);
		data.add(i5);
		return data;
	}

}