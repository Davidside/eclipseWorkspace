package cz.david.cache;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.apache.ignite.binary.BinaryObject;
import org.apache.ignite.cache.CacheAtomicityMode;
import org.apache.ignite.cache.CacheMemoryMode;
import org.apache.ignite.cache.CacheMode;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.internal.binary.BinaryObjectImpl;
import org.apache.ignite.marshaller.optimized.OptimizedMarshaller;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IgniteTest {
	
	private static final String CACHE_NAME = "CacheName";
	private static final String KEY = "Key";
	private static final String VALUE = "Value";
	private static final Integer NUMBER = 10;
	
	private Ignite ignite;
	
	@Before
	public void setUp() {
		IgniteConfiguration cfg = new IgniteConfiguration();
		
		CacheConfiguration<Object, Object> cacheCfg = new CacheConfiguration<Object, Object>(CACHE_NAME);
		cfg.setMarshaller(new OptimizedMarshaller(false));
		
		cacheCfg.setMemoryMode(CacheMemoryMode.OFFHEAP_TIERED);
		cacheCfg.setCacheMode(CacheMode.LOCAL);
		
		cfg.setCacheConfiguration(cacheCfg);
		
		ignite = Ignition.start(cfg);
	}
	
	@After
	public void tearDown() {
		ignite.destroyCache(CACHE_NAME);
		Ignition.stopAll(true);
	}

	@Test
	public void testKey() {
		IgniteCache<Object, Object> cache = ignite.cache(CACHE_NAME);
		
		InnerBean innerBean = new InnerBean();
		innerBean.setName("ahoj");
		KeyBean keyBean = new KeyBean(innerBean);
		
		cache.put(keyBean, VALUE);
//		assertEquals(1, cache.sizeLong());
		assertEquals(VALUE, cache.get(keyBean));
	}
	
//	@Test
//	public void testKeySet() {
//		IgniteCache<Object, Object> cache = ignite.cache(CACHE_NAME);
//		
//		Set<InnerBean> set1 = new HashSet<InnerBean>();
//		for (int i = 0; i < 10; i++) {
//			set1.add(new InnerBean("text" + i));
//		}
//		cache.put(set1, VALUE);
//		
//		Set<InnerBean> set2 = new HashSet<InnerBean>();
//		for (int i = 9; i > -1; i--) {
//			set2.add(new InnerBean("text" + i));
//		}
//		assertEquals(VALUE, cache.get(set2));
//	}
	
//	@Test
//	public void testIgntie() {
//		IgniteCache<Object, Object> cache = ignite.cache(CACHE_NAME);
//		
//		TestBean testBean = new TestBean(5, KEY);
//		TestBean testBean2 = new TestBean(10, KEY);
//		
//		cache.put(testBean, VALUE);
//		assertEquals(VALUE, cache.get(testBean));
//  		assertEquals(VALUE, cache.get(testBean2));
//	}
	
	
}
