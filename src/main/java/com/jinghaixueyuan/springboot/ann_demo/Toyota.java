package com.jinghaixueyuan.springboot.ann_demo;

import org.springframework.stereotype.Component;

@Component
public class Toyota implements Car{

       @Override
        public void print(){
           System.out.println("我是一个丰田汽车");
       }
}
