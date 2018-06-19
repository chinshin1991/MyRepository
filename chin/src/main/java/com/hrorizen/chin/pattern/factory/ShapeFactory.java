package com.hrorizen.chin.pattern.factory;

import com.hrorizen.chin.pattern.factory.impl.Circle;
import com.hrorizen.chin.pattern.factory.impl.Rectangle;
import com.hrorizen.chin.pattern.factory.impl.Square;

public class ShapeFactory {

	   //使用 getShape 方法获取形状类型的对象
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }        
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      return null;
	   }
	   
}
