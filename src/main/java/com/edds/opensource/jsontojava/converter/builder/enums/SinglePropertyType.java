package com.edds.opensource.jsontojava.converter.builder.enums;

import com.edds.opensource.jsontojava.converter.builder.enums.PropertyType;

public enum SinglePropertyType implements PropertyType {

    NEW(null),
    STRING("String"),
    INTEGER("Integer"),
    DOUBLE("Double"),
    BOOLEAN("boolean");

    private final String declareName;

    SinglePropertyType(String declareName) {
       this.declareName = declareName;
    }

    @Override
    public String getDeclareName(){
        return declareName;
    }
}
