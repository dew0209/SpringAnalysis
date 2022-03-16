package com.enjoy.cap2.config;

import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;

public class TypeFilter implements org.springframework.core.type.filter.TypeFilter {
    /**
     *
     * @param metadataReader  读取到当前正在扫描的类的信息，
     * @param metadataReaderFactory 可以获取到其他类的信息
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类注解的信息
        AnnotationMetadata annos = metadataReader.getAnnotationMetadata();
        //获取当前正在扫描的类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取类路径
        Resource resource = metadataReader.getResource();
        String className = classMetadata.getClassName();
        if (annos.hasAnnotation("org.springframework.stereotype.Controller"))return true;

        return false;
    }
}
