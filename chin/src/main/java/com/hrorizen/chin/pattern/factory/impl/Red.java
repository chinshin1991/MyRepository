package com.hrorizen.chin.pattern.factory.impl;

import com.hrorizen.chin.pattern.factory.Color;

public class Red implements Color {

	   @Override
	   public void fill() {
		  System.out.println("Inside Red::fill() method.");
	   }

}
