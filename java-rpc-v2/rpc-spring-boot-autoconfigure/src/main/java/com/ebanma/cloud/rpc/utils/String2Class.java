package com.ebanma.cloud.rpc.utils;

/**
 * @author fantasy
 * @version $ Id: W, v 0.1 2023/05/15 10:49 Administrator Exp $
 */

public class String2Class {

    public static Class<?>[] string2Class(String[] parameterTypeStrings) throws Exception {
        Class<?>[] parameterTypes = new Class<?>[parameterTypeStrings.length];
        for (int i = 0; i < parameterTypeStrings.length; i++) {
            parameterTypes[i] = Class.forName(parameterTypeStrings[i]);
        }
        return parameterTypes;
    }
}
