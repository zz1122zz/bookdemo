package org.creation.demo.entity.bookdemo;

import java.io.Serializable;

public class Entity implements Serializable {
    private Long uniqueEntityCode;

    private String type;

    private static final long serialVersionUID = 1L;

    public Long getUniqueEntityCode() {
        return uniqueEntityCode;
    }

    public void setUniqueEntityCode(Long uniqueEntityCode) {
        this.uniqueEntityCode = uniqueEntityCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uniqueEntityCode=").append(uniqueEntityCode);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}