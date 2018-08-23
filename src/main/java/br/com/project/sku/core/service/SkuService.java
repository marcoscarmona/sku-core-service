package br.com.project.sku.core.service;

import br.com.project.sku.core.entity.Sku;
import br.com.project.sku.core.repository.SkuRepository;
import br.com.project.sku.core.vo.SkuResponse;
import br.com.project.sku.core.vo.SkuResponseWrapper;

public class SkuService {
	
	private SkuRepository skuRepository;
	
	public SkuResponseWrapper getSkuById(String skuId) {
		
		SkuResponseWrapper wrapper = new SkuResponseWrapper();
		
		Sku sku = this.skuRepository.findById(Long.parseLong(skuId)).get();
		
		wrapper.getSkus().add(new SkuResponse(sku.getIdProduct(), sku.getExternalId()));
		
		return wrapper;
	}

}
