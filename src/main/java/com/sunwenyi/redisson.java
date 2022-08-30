package com.sunwenyi;


import org.redisson.Redisson;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;

public class redisson {



    public static void main(String[] args) {

        Config config = new Config();
        config.useSingleServer().setPassword("rJvBSKDifIbzWCHJqWX6iln8q3edqgTUrAzCaLEsq9s=")
                .setAddress("rediss://wenyiredis.redis.cache.windows.net:6380");

        RedissonClient redisson = Redisson.create(config);
        // perform operations

        RBucket bucket = redisson.getBucket("simpleObject");
        bucket.set("This is object value");

        RMap map = redisson.getMap("simpleMap");
        map.put("mapKey", "This is map value");

        redisson.shutdown();

    }





}
