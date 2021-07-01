package com.zgb.annotation.nnotationtest.annotation;

import java.lang.annotation.*;

/**
 * 自定义方法注解 此时用于定时器注解便于生成方法以及方法的作用
 * (获取定时器任务的方法以及名称)
 */
@Documented
@Target({ElementType.FIELD}) //注解应用类型(应用到字段上)
@Retention(RetentionPolicy.RUNTIME) // 注解的类型
public @interface FieldInterface {
   //属性字段名称 默认空字符串
    String name() default "";

    //是否是字典值 true 是 false 不是
    boolean dictionary() default false;
}