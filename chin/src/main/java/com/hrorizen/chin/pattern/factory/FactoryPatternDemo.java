package com.hrorizen.chin.pattern.factory;

import com.hrorizen.chin.pattern.factory.entity.ShapeType;

/**
 * @author chenxin
 *
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();

	      //获取 Circle 的对象，并调用它的 draw 方法
	      Shape shape1 = shapeFactory.getShape( ShapeType.CIRCLE );

	      //调用 Circle 的 draw 方法
	      shape1.draw();

	      //获取 Rectangle 的对象，并调用它的 draw 方法
	      Shape shape2 = shapeFactory.getShape( ShapeType.RECTANGLE );

	      //调用 Rectangle 的 draw 方法
	      shape2.draw();

	      //获取 Square 的对象，并调用它的 draw 方法
	      Shape shape3 = shapeFactory.getShape( ShapeType.SQUARE );

	      //调用 Square 的 draw 方法
	      shape3.draw();
	   }
	
}
