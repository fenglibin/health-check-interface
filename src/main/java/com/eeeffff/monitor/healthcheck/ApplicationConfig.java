package com.eeeffff.monitor.healthcheck;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * 该工程支持spring boot引入，也支持非普通spring应用引入。<br>
 * spring boot工程只需要引入当前工程即可，普通spring应用需要通过ComponentScan注解引入：<br>
 *　{@code @ComponentScan(basePackageClasses = { ApplicationConfig.class })}
 * @author fenglibin
 *
 */
@Configuration
@ComponentScan(basePackageClasses = { ApplicationConfig.class })
public class ApplicationConfig {
}