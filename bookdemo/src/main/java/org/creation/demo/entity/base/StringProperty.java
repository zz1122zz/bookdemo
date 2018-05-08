package org.creation.demo.entity.base;

import java.io.Serializable;

public class StringProperty implements Serializable {
    private Long uniquePropertyCode;

    private Long uniqueEntityCode;

    private String name;

    private String value;

    private static final long serialVersionUID = 1L;

    public Long getUniquePropertyCode() {
        return uniquePropertyCode;
    }

    public void setUniquePropertyCode(Long uniquePropertyCode) {
        this.uniquePropertyCode = uniquePropertyCode;
    }

    public Long getUniqueEntityCode() {
        return uniqueEntityCode;
    }

    public void setUniqueEntityCode(Long uniqueEntityCode) {
        this.uniqueEntityCode = uniqueEntityCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uniquePropertyCode=").append(uniquePropertyCode);
        sb.append(", uniqueEntityCode=").append(uniqueEntityCode);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}