//package cn.youye.sys.utils;
//
//import org.apache.shiro.session.Session;
//import org.apache.shiro.session.mgt.eis.SessionIdGenerator;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Service;
//
//import java.io.Serializable;
//import java.security.SecureRandom;
//import java.util.UUID;
//
///**
// * Created by pc on 2016/7/22.
// */
//@Service
//@Lazy(false)
//public class IdGen implements SessionIdGenerator {
//
//    private static SecureRandom random=new SecureRandom();
//
//
//    /**
//     * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
//     */
//    public static String uuid() {
//        return UUID.randomUUID().toString().replaceAll("-", "");
//    }
//
//    /**
//     * 使用SecureRandom随机生成Long.
//     */
//    public static long randomLong() {
//        return Math.abs(random.nextLong());
//    }
//
//    /**
//     * 基于Base62编码的SecureRandom随机生成bytes.
//     */
//    public static String randomBase62(int length) {
//        byte[] randomBytes = new byte[length];
//        random.nextBytes(randomBytes);
//        return Encodes.encodeBase62(randomBytes);
//    }
//
//
//    public Serializable generateId(Session session) {
//        return IdGen.uuid();
//    }
//
//}
