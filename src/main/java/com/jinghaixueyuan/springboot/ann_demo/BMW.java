package com.jinghaixueyuan.springboot.ann_demo;

import org.springframework.stereotype.Component;

@Component
public class BMW implements Car{

       @Override
        public void print(){
           System.out.println("我是一个宝马汽车");
       }
}
