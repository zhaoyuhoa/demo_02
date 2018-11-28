package com.jinghaixueyuan.springboot.ann_demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JavaConfigA.class,JavaConfigB.class})
public class ParentConfig {


}
