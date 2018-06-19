package com.hrorizen.chin.pattern.factory;

import com.hrorizen.chin.pattern.factory.entity.FactoryType;

public class AbstractFactoryProducer {

	public static AbstractFactory getFactory( FactoryType type ){
      if( type.equals( FactoryType.SHAPE )){
         return new ShapeAbstractFactory();
      } else if( type.equals( FactoryType.COLOR )){
         return new ColorAbstractFactory();
      }
      return null;
   }
}
