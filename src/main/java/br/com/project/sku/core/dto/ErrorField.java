package br.com.project.sku.core.dto;

public class ErrorField {

	private String field;

	private String error;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public ErrorField(String field, String error) {
		super();
		this.field = field;
		this.error = error;
	}
	
}
