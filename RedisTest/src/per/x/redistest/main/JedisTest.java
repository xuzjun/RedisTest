package per.x.redistest.main;

import redis.clients.jedis.Jedis;

public class JedisTest {

	public static void main(String[] args) {

		Jedis jedis = new Jedis("192.168.235.128");
		Jedis j = new Jedis("192.168.235.128");
		jedis.set("xu", "zuo1");
		jedis.del("xu");
		j.set("t", "m1");
		j.del("t");
		String res = jedis.get("foo");
		System.out.println(res);
		jedis.close();
		j.close();
	}

}
