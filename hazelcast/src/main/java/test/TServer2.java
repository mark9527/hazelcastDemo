package test;

import java.util.Map;
import java.util.Queue;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class TServer2 {
	public static void main(String[] args) {
		
		HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
        Map<Integer,String> customers=hazelcastInstance.getMap( "customers" );
        customers.put( 4, "Mark" );
        customers.put( 5, "Jack" );
        customers.put( 6, "Frank" );
        System.out.println( "Customer with key 1: " + customers.get(1) );
        System.out.println( "Map Size:" + customers.size() );
        Queue<String> queueCustomers = hazelcastInstance.getQueue( "customers" );
        queueCustomers.offer( "Tom" );
        queueCustomers.offer( "Mary" );
        queueCustomers.offer( "Jane" );
        System.out.println( "First customer: " + queueCustomers.poll() );
        System.out.println( "Second customer: "+ queueCustomers.peek() );
        System.out.println(queueCustomers.size()+ "Second customer: "+ queueCustomers.peek() );

	}
}
