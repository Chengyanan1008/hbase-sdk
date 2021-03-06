package com.github.CCweixiao.annotation;

import java.lang.annotation.*;

/**
 * 该注解用于定义一个HBase的表信息
 *
 * @author leo
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HBaseTable {
    /**
     * 该表所属的命名空间，默认是default
     *
     * @return namespace name
     */
    String schema() default "default";

    /**
     * HBase table name, default value is ""
     *
     * @return the name of HBase table
     */
    String name() default "";

    /**
     * if your HBase table just has one family, you can set a unified family by set the value.
     *
     * @return family name
     */
    String uniqueFamily() default "";
}
