package com.hrorizen.chin.pattern.factory;

import com.hrorizen.chin.pattern.factory.entity.ColorType;
import com.hrorizen.chin.pattern.factory.entity.ShapeType;
import com.hrorizen.chin.pattern.factory.impl.Blue;
import com.hrorizen.chin.pattern.factory.impl.Green;
import com.hrorizen.chin.pattern.factory.impl.Red;

public class ColorAbstractFactory extends AbstractFactory{

	@Override
	public Color getColor( ColorType color ) {
		
		if( color == null ) return null;
		
		if( color.equals( ColorType.RED ) ){
			return new Red();
		}else if( color.equals( ColorType.GREEN ) ){
			return new Green();
		}else if( color.equals( ColorType.BLUE ) ){
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape( ShapeType shape ) {
		
		return null;
	}

}
