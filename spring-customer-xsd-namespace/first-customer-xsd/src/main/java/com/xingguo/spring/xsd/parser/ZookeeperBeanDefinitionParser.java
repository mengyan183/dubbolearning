/*
 * Copyright (c) 2019, crayonshinchanxingguo.com Inc. All Rights Reserved
 */
package com.xingguo.spring.xsd.parser;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanComponentDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.AbstractBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * 自定义 xsd element bean 定义 解析类; 生成对应实例
 *
 * @author xingguo
 * @date 5/14/2019 6:06 PM
 * @since 1.0.0
 **/
public class ZookeeperBeanDefinitionParser extends AbstractBeanDefinitionParser {
    /**
     *
     *
     * Central template method to actually parse the supplied {@link Element}
     * into one or more {@link BeanDefinition BeanDefinitions}.
     *
     * @param element       the element that is to be parsed into one or more {@link BeanDefinition BeanDefinitions}
     * @param parserContext the object encapsulating the current state of the parsing process;
     *                      provides access to a {@link BeanDefinitionRegistry}
     * @return the primary {@link BeanDefinition} resulting from the parsing of the supplied {@link Element}
     * @see #parse(Element, ParserContext)
     * @see #postProcessComponentDefinition(BeanComponentDefinition)
     */
    @Override
    protected AbstractBeanDefinition parseInternal(Element element, ParserContext parserContext) {
        //TODO : 
        return null;
    }
}
