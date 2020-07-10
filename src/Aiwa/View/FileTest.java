package Aiwa.View;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import Aiwa.DataBase.ItemTable;
import Aiwa.Entity.Item;

public class FileTest {
	public static void main(String[] args) {
		ItemTable it = new ItemTable();
		ArrayList<Item> items = it.getData();
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("text.html")));
			pw.println("<ul>");
			for (int i = 0; i < items.size(); i++) {

				Item item = items.get(i);
				pw.println("<li>" + item.getName() + "</li>");
			}
			pw.println("</ul>");
			pw.close();
		} catch (Exception e) {
			System.out.println("errol!! 404");
		}

	}

}