package org.carry;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;

/**
 * @Author: CARRY
 * @CreateTime: 2019-06-28 17:06
 * @Description: ${Description}
 */
@Controller
public class CacheTest {
    /**
     * 缓存测试方法延时两秒
     *
     * @param i
     * @return
     */
    @Cacheable(value = "cache_test")
    public String cacheFunction(int i) {
        try {
            long time = 2000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }

        return "success" + i;
    }
}
