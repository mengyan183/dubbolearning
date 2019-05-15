/*
 * Copyright (c) 2019, crayonshinchanxingguo.com Inc. All Rights Reserved
 */
package com.xingguo.spring.xsd.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
/**
 * 自定义命名空间处理类
 * <p>继承NamespaceHandlerSupport 重写 init方法解析 自定义命名空间</p>
 * @author xingguo
 * @date 5/14/2019 5:51 PM
 * @since 1.0.0
 **/
@Slf4j
public class TestRegNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        // 注册自定义xsd bean解析 ;
        // param1 : elementName:xsd文件自定义 element名称
        // param2 : 自定义 xsd element bean解析类
        registerBeanDefinitionParser("zookeeper",);
    }
}
