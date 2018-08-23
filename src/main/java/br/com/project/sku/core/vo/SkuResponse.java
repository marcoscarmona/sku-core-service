package br.com.project.sku.core.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SkuResponse {
	
	public SkuResponse() {
		
	}

	public SkuResponse(Long idProduct, String externalId) {
		super();
		this.idProduct = idProduct;
		this.externalId = externalId;
	}

	@JsonProperty("id_product")
	private Long idProduct;

	@JsonProperty("external_id")
	private String externalId;

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

}
