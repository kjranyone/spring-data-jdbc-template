package com.cybozu.spring.data.jdbc.template.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.cybozu.spring.data.jdbc.template.mapper.EntityMapper;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface Mapper {
    Class<? extends EntityMapper<?>> value();
}
