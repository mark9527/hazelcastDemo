package test;

import java.util.Map;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class TServer {
	public static void main(String[] args) {
		
		HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
        Map<Integer,String> customers=hazelcastInstance.getMap( "PromotionCache" );
        customers.put( 1, "Joe" );
        customers.put( 2, "Ali" );
        customers.put( 3, "Avi" );
        System.out.println( "Customer with key 1: " + customers.get(4) );
        System.out.println( "Map Size:" + customers.size() );
        /*Queue<String> queueCustomers = hazelcastInstance.getQueue( "customers" );
        queueCustomers.offer( "Tom" );
        queueCustomers.offer( "Mary" );
        queueCustomers.offer( "Jane" );
        System.out.println( "First customer: " + queueCustomers.poll() );
        System.out.println( "Second customer: "+ queueCustomers.peek() );
        System.out.println(queueCustomers.size()+ "Second customer: "+ queueCustomers.peek() );*/
	}
}
