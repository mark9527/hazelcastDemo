package cache;

import java.util.Map;

import com.hazelcast.config.ClasspathXmlConfig;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class Hazelcast1 {
	public static HazelcastInstance hazelcastInstance;
    public static Map<String,String> promotionCache;
    static{
    	Config config = new ClasspathXmlConfig("config/hazelcast.xml");
    	hazelcastInstance = Hazelcast.newHazelcastInstance(config);
    	promotionCache=hazelcastInstance.getMap( "PromotionCache" );
    }
}
