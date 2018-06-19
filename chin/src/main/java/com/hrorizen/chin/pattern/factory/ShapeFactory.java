package com.hrorizen.chin.pattern.factory;

import com.hrorizen.chin.pattern.factory.entity.ShapeType;
import com.hrorizen.chin.pattern.factory.impl.Circle;
import com.hrorizen.chin.pattern.factory.impl.Rectangle;
import com.hrorizen.chin.pattern.factory.impl.Square;

/**
 * 工厂模式
 * @author chenxin
 *
 */
public class ShapeFactory {

	   //使用 getShape 方法获取形状类型的对象
	   public Shape getShape( ShapeType shapeType){
	      if(shapeType == null){
	         return null;
	      }        
	      if(shapeType.equals( ShapeType.CIRCLE )){
	         return new Circle();
	      } else if(shapeType.equals( ShapeType.RECTANGLE )){
	         return new Rectangle();
	      } else if(shapeType.equals( ShapeType.SQUARE )){
	         return new Square();
	      }
	      return null;
	   }
	   
}
