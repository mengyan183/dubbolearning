/*
 * Copyright (c) 2019, crayonshinchanxingguo.com Inc. All Rights Reserved
 */
package com.xingguo.spring.xsd.parser;

import com.google.common.base.Strings;
import com.xingguo.spring.xsd.bean.ZookeeperConfiguration;
import com.xingguo.spring.xsd.bean.ZookeeperRegistryCenter;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanComponentDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.AbstractBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * 自定义 xsd element "zookeeper"  bean 定义 解析类; 生成对应实例
 *
 * @author xingguo
 * @date 5/14/2019 6:06 PM
 * @since 1.0.0
 **/
public class ZookeeperBeanDefinitionParser extends AbstractBeanDefinitionParser {
    /**
     *  xsd 文件 element 内部解析类
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
        //构建器模式，表明标签对应的实体Bean对象为ZookeeperRegistryCenter,zk注册中心实现类
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(ZookeeperRegistryCenter.class);
        return null;
    }

    /**
     *
     * @param element
     * @return
     */
    private AbstractBeanDefinition buildZookeeperConfigurationBeanDefinition(Element element) {
        BeanDefinitionBuilder configuration = BeanDefinitionBuilder.rootBeanDefinition(ZookeeperConfiguration.class);
        configuration.addConstructorArgValue(element.getAttribute("server-lists"));
        configuration.addConstructorArgValue(element.getAttribute("namespace"));
        this.addPropertyValueIfNotEmpty("base-sleep-time-milliseconds", "baseSleepTimeMilliseconds", element, configuration);
        this.addPropertyValueIfNotEmpty("max-sleep-time-milliseconds", "maxSleepTimeMilliseconds", element, configuration);
        this.addPropertyValueIfNotEmpty("max-retries", "maxRetries", element, configuration);
        this.addPropertyValueIfNotEmpty("session-timeout-milliseconds", "sessionTimeoutMilliseconds", element, configuration);
        this.addPropertyValueIfNotEmpty("connection-timeout-milliseconds", "connectionTimeoutMilliseconds", element, configuration);
        this.addPropertyValueIfNotEmpty("digest", "digest", element, configuration);
        return configuration.getBeanDefinition();
    }

    private void addPropertyValueIfNotEmpty(String attributeName, String propertyName, Element element, BeanDefinitionBuilder factory) {
        String attributeValue = element.getAttribute(attributeName);
        if (!Strings.isNullOrEmpty(attributeValue)) {
            factory.addPropertyValue(propertyName, attributeValue);
        }

    }
}
