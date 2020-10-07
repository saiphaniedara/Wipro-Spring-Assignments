package com.wipro.bean;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment5 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your choice(1 or 2): ");
		int inp = sc.nextInt();
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Map<String, Player> m = ac.getBeansOfType(Player.class);
		switch(inp) {
		case 1:
			System.out.println(m);
			break;
		case 2:
			String cname=sc.next();
			System.out.println("Players who belong to "+cname+" :");
			Set<String> keys = m.keySet();
			Iterator<String> i = keys.iterator();
			while(i.hasNext()) {
				Player p = m.get(i.next());
				if(p.getCountry().getCountryName().equalsIgnoreCase(cname)) {
					System.out.println(p.getPlayerName());
				}
			}
			break;
			default:
				System.out.println("Invalid Choice..");
				break;
		}
	}

}
