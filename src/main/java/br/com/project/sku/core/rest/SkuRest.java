package br.com.project.sku.core.rest;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.sku.core.dto.ErrorDetail;
import br.com.project.sku.core.service.SkuService;
import br.com.project.sku.core.vo.SkuResponseWrapper;

@RestController
@RequestMapping(path = "${application.rest.endpoint.sku.root}")
public class SkuRest {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private SkuService skuService;

	@Autowired
	public SkuRest(SkuService skuService) {
		this.skuService = skuService;
	}

	@SuppressWarnings("rawtypes")
	@GetMapping(path = "${application.rest.endpoint.sku.get.by.id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity getSkuById(@PathVariable("sku_id") String skuId) {

		System.out.println("SkuRest.getSkuById()");

		logger.info("SkuRest.getSkuById() -> sku_id {}", skuId);
 
		try {

			ErrorDetail errorDetail = new ErrorDetail(new Date());

			if (skuId == null || skuId.isEmpty()) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetail);
			}

			SkuResponseWrapper responseWrapper = this.skuService.getSkuById(skuId);

			return ResponseEntity.status(HttpStatus.OK).body(responseWrapper);

		} catch (Exception ex) {
			logger.error("Error getting sku_id {}", skuId, ex.getMessage(), ex);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new ErrorDetail(new Date(), ex.getMessage(), null));
		}
	}
}
