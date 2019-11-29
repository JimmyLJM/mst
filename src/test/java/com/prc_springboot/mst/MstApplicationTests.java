package com.prc_springboot.mst;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MstApplicationTests {


	@Resource
	private RedisTemplate<String, Object> redisTemplate;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	public void contextLoads() {
		redisTemplate.opsForValue().set("test", 1);
		int test = (int) redisTemplate.opsForValue().get("test");
		System.out.println(test);
	}

}
