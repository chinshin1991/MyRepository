package com.hrorizen.chin.pattern.factory;

import com.hrorizen.chin.pattern.factory.entity.ColorType;
import com.hrorizen.chin.pattern.factory.entity.FactoryType;
import com.hrorizen.chin.pattern.factory.entity.ShapeType;

public class AbstractFactoryPatternDemo {

	   public static void main(String[] args) {

      //获取形状工厂
      AbstractFactory shapeFactory = AbstractFactoryProducer.getFactory( FactoryType.SHAPE );

      //获取形状为 Circle 的对象
      Shape shape1 = shapeFactory.getShape( ShapeType.CIRCLE );

      //调用 Circle 的 draw 方法
      shape1.draw();

      //获取形状为 Rectangle 的对象
      Shape shape2 = shapeFactory.getShape( ShapeType.RECTANGLE );

      //调用 Rectangle 的 draw 方法
      shape2.draw();
      
      //获取形状为 Square 的对象
      Shape shape3 = shapeFactory.getShape( ShapeType.SQUARE );

      //调用 Square 的 draw 方法
      shape3.draw();

      //获取颜色工厂
      AbstractFactory colorFactory = AbstractFactoryProducer.getFactory( FactoryType.COLOR );

      //获取颜色为 Red 的对象
      Color color1 = colorFactory.getColor( ColorType.RED );

      //调用 Red 的 fill 方法
      color1.fill();

      //获取颜色为 Green 的对象
      Color color2 = colorFactory.getColor( ColorType.GREEN );

      //调用 Green 的 fill 方法
      color2.fill();

      //获取颜色为 Blue 的对象
      Color color3 = colorFactory.getColor( ColorType.BLUE );

      //调用 Blue 的 fill 方法
      color3.fill();
   }
}
