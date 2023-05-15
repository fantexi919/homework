package com.ebanma.cloud.rpc.annotation;

/**
 * @author fantasy
 * @version $ Id: W, v 0.1 2023/05/15 10:53 Administrator Exp $
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 该注解用于注入远程服务
 */
@Target(ElementType.FIELD) // 方法注解
@Retention(RetentionPolicy.RUNTIME) // 运行时注解
public @interface RpcReference {

    String value();
}
