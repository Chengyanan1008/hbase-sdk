package com.github.CCweixiao.model;

import com.github.CCweixiao.util.StrUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leojie 2020/9/9 9:48 下午
 */
public class NamespaceDesc {
    private String namespaceName;
    private Map<String, String> namespaceProps;

    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public Map<String, String> getNamespaceProps() {
        return namespaceProps;
    }

    public void setNamespaceProps(Map<String, String> namespaceProps) {
        this.namespaceProps = namespaceProps;
    }

    public NamespaceDesc addNamespaceProp(final String key, final String value) {
        if (this.namespaceProps == null) {
            this.namespaceProps = new HashMap<>();
        }
        if (StrUtil.isBlank(key)) {
            return this;
        }
        if (!this.namespaceProps.containsKey(key)) {
            this.namespaceProps.put(key, value);
        }
        return this;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append('{');
        s.append("NAME");
        s.append(" => '");
        s.append(this.namespaceName);
        s.append("'");

        this.namespaceProps.forEach((key, value) -> {
            if (key != null) {
                s.append(", ");
                s.append(key);
                s.append(" => '");
                s.append(value);
                s.append("'");
            }
        });

        s.append('}');
        return s.toString();
    }

}
