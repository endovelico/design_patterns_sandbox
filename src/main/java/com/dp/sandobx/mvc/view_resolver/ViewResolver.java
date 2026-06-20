/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.sandobx.mvc.view_resolver;

/**
 *
 * @author endovelico
 */
public interface ViewResolver {
    View resolveViewName(String viewName) throws Exception;
}