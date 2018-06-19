package com.hrorizen.chin.pattern.factory;

import com.hrorizen.chin.pattern.factory.entity.ColorType;
import com.hrorizen.chin.pattern.factory.entity.ShapeType;

/**
 * 抽象工厂类
 * @author chenxin
 */
public abstract class AbstractFactory {

	public abstract Color getColor( ColorType color );
	
	public abstract Shape getShape( ShapeType shape );
	
}
