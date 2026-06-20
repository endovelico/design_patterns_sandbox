/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.sandobx.mvc.view_resolver;

/**
 *
 * @author endovelico
 */
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class TemplateView implements View {

    private final String templatePath;

    public TemplateView(String templatePath) {
        this.templatePath = templatePath;
    }

    @Override
    public void render(Map<String, Object> model, Writer writer) throws Exception {
        String template = loadTemplate();

        // very naive placeholder replacement: ${key}
        for (Map.Entry<String, Object> entry : model.entrySet()) {
            template = template.replace("${" + entry.getKey() + "}",
                    String.valueOf(entry.getValue()));
        }

        writer.write(template);
    }

    private String loadTemplate() throws IOException {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(templatePath)) {
            if (is == null) {
                throw new FileNotFoundException("Template not found: " + templatePath);
            }
            return new String(is.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}