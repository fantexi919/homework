package com.ebanma.cloud.rpc.utils;

/**
 * @author fantasy
 * @version $ Id: W, v 0.1 2023/05/15 10:50 Administrator Exp $
 */

public class Class2String {

    public static String[] class2String(Class<?>[] classes) {
        String[] parameterTypeString = new String[classes.length];
        for (int i = 0; i < classes.length; i++) {
            parameterTypeString[i] = classes[i].getName();
        }
        return parameterTypeString;
    }
}
