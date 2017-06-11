package service;

import cache.Hazelcast1;
import util.Base64String2Byte;
import util.File2Byte;

public class Service {
  
	public String getPromotionFromCache(String promotionId){
		String promotion=Hazelcast1.promotionCache.get(promotionId);
		if(null!=promotion){
			return promotion;
		}else{
			promotion=getPromotion(promotionId);
			Hazelcast1.promotionCache.put(promotionId, promotion);
			return promotion;
		}
	}
	public String getPromotion(String promotionId){
		return "{\"name\":\"zhangsan\"}";
	}
	
	public String getPromotionFile(String promotionId){
		//path=System.getProperty("user.dir");
		byte[] image= File2Byte.getBytes("src/main/resources/1.png");
		return Base64String2Byte.byte2Base64String(image);
	}
	
	
}
