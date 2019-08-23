package com.roncoo.eshop.product.model;

public class ProductIntro {
	
	private Long id;
	private String content;
	private Long productId;
	
	
	
	
	public ProductIntro() {
		super();
	}
	public ProductIntro(Long id, String content, Long productId) {
		super();
		this.id = id;
		this.content = content;
		this.productId = productId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
	
	
}
