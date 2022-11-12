package com.fasterxml.jackson.databind.node;

import com.alibaba.fastjson2.annotation.JSONField;
import com.fasterxml.jackson.databind.JsonNode;

public class ShortNode
        extends JsonNode {
    private short value;

    public ShortNode(@JSONField(name = "value", value = true) short value) {
        this.value = value;
    }

    @JSONField(name = "value", value = true)
    public short getValue() {
        return value;
    }

    @Override
    public String asText() {
        return Short.toString(value);
    }
}
