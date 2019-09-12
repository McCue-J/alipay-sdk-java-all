package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意关联的图片/视频物料元素详情
 *
 * @author auto create
 * @since 1.0, 2019-07-23 15:46:15
 */
public class MaterialDetail extends AlipayObject {

	private static final long serialVersionUID = 3789523818771981656L;

	/**
	 * 广告投放平台生成的物料ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 创意元素C端渲染关联位置key值
	 */
	@ApiField("key")
	private String key;

	/**
	 * 物料元素类型，IMG-图片；VIDEO-视频
	 */
	@ApiField("material_type")
	private String materialType;

	/**
	 * 创意图片/视频物料元素URL
	 */
	@ApiField("url")
	private String url;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}