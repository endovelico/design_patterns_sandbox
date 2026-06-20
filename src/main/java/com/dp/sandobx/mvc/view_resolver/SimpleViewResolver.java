/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.sandobx.mvc.view_resolver;

/**
 *
 * @author endovelico
 */
public class SimpleViewResolver implements ViewResolver {

    private final String prefix;
    private final String suffix;

    public SimpleViewResolver(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    @Override
    public View resolveViewName(String viewName) {
        String path = prefix + viewName + suffix;
        return new TemplateView(path);
    }
}
