package com.enes.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		List<String> fortuneList = new ArrayList<String>();
		int index = 0;
		fortuneList.add("You can do your best today!");
		fortuneList.add("Don't believe me :) ");
		fortuneList.add("Lies lies lies bla bla .. ");
		
		Random rnd =  new Random();
		index = rnd.nextInt(3);
		System.out.println(index);
		
		return fortuneList.get(index);
		
	}

}
