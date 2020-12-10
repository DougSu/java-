import redis.clients.jedis.Jedis;

public class redisTest {
    public static void main(String[] args) {
        Jedis j = new Jedis("localhost",6379);
        j.set("username","zhangsan");
        j.close();
    }
}
