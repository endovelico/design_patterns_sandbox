/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.sandobx.mvc.view_resolver;

/**
 *
 * @author endovelico
 */
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws Exception {
        ViewResolver resolver = new SimpleViewResolver("templates/", ".html");

        View view = resolver.resolveViewName("hello");

        Map<String, Object> model = new HashMap<>();
        model.put("name", "Alice");

        StringWriter writer = new StringWriter();
        view.render(model, writer);

        System.out.println(writer.toString());
    }
}