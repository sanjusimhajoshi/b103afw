package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo11 {
	public static void main(String[] args) throws InterruptedException {
		
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		map.put("Apple",1);
		map.put("mango",2);
		System.out.println(map);
		
		Integer v = map.get("Apple");
		System.out.println(v);//1
		
		map.put("Apple",3);
		System.out.println(map);
		
		System.out.println(map.containsKey("Apple"));//true
		System.out.println(map.containsKey("Grapes"));//false
		for(String key:map.keySet())
		{
			Integer val = map.get(key);
			System.out.println(key+"->"+val);
			
		}
		}

}
