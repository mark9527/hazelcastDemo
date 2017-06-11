package util;

import org.apache.commons.codec.binary.Base64;

public class Base64String2Byte {
	 //base64字符串转byte[]  
    public static byte[] base64String2Byte(String base64Str){  
        return Base64.decodeBase64(base64Str);  
    }  
    //byte[]转base64  
    public static String byte2Base64String(byte[] b){  
        return Base64.encodeBase64String(b);  
    }  
}
