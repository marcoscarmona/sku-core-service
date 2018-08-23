package br.com.project.sku.core.vo;

import java.util.ArrayList;
import java.util.List;

public class SkuResponseWrapper {
	
	private List<SkuResponse> skus = new ArrayList<>();

	public List<SkuResponse> getSkus() {
		return skus;
	}

	public void setSkus(List<SkuResponse> skus) {
		this.skus = skus;
	}
	
	
}
