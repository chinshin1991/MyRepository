package com.hrorizen.chin.pattern.factory;

import com.hrorizen.chin.pattern.factory.entity.ColorType;
import com.hrorizen.chin.pattern.factory.entity.ShapeType;
import com.hrorizen.chin.pattern.factory.impl.Circle;
import com.hrorizen.chin.pattern.factory.impl.Rectangle;
import com.hrorizen.chin.pattern.factory.impl.Square;

public class ShapeAbstractFactory extends AbstractFactory{

	@Override
	public Color getColor( ColorType color ) {
		return null;
	} 
		

	@Override
	public Shape getShape( ShapeType shape ) {
		
		if( shape == null ) return null;
		
		if( shape.equals( ShapeType.CIRCLE ) ){
			return new Circle();
		}else if( shape.equals( ShapeType.RECTANGLE ) ){
			return new Rectangle();
		}else if( shape.equals( ShapeType.SQUARE ) ){
			return new Square();
		}
		return null;
	}

}
