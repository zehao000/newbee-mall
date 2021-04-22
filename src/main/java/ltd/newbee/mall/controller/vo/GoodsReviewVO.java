/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.controller.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 商品详情页VO
 * 
 * 
 */
public class GoodsReviewVO implements Serializable {
//	private String  id;
	private String  id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getStar() {
		return star;
	}
	public void setStar(Integer star) {
		this.star = star;
	}
	public String getCustermerId() {
		return custermerId;
	}
	public void setCustermerId(String custermerId) {
		this.custermerId = custermerId;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public Long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsIntro() {
		return goodsIntro;
	}
	public void setGoodsIntro(String goodsIntro) {
		this.goodsIntro = goodsIntro;
	}
	public String getGoodsCategory_id() {
		return goodsCategory_id;
	}
	public void setGoodsCategory_id(String goodsCategory_id) {
		this.goodsCategory_id = goodsCategory_id;
	}
	public String getGoodsCover_img() {
		return goodsCover_img;
	}
	public void setGoodsCover_img(String goodsCover_img) {
		this.goodsCover_img = goodsCover_img;
	}
	public String getGoodsCarousel() {
		return goodsCarousel;
	}
	public void setGoodsCarousel(String goodsCarousel) {
		this.goodsCarousel = goodsCarousel;
	}
	public String getGoodsDetailContent() {
		return goodsDetailContent;
	}
	public void setGoodsDetailContent(String goodsDetailContent) {
		this.goodsDetailContent = goodsDetailContent;
	}
	public String getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(String sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public String getStockNum() {
		return stockNum;
	}
	public void setStockNum(String stockNum) {
		this.stockNum = stockNum;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getGoodsSellStatus() {
		return goodsSellStatus;
	}
	public void setGoodsSellStatus(String goodsSellStatus) {
		this.goodsSellStatus = goodsSellStatus;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	private  Integer  star;
	private String  custermerId;
	private  Date   commentDate;
	   private Long  goodsId;
	   private String  title;
	   private String  content;
	   private String  picture;
	   private String   userId;
	   public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	private String   nickName;
	   
	   private String   goodsName;
	   private String   goodsIntro;
	   private String   goodsCategory_id;
	   private String   goodsCover_img;
	   private String   goodsCarousel;
	   private String   goodsDetailContent;
	   private String   originalPrice;
	   private String   sellingPrice;
	   private String   stockNum;
	   private String   tag;
	   private String   goodsSellStatus;
	   private String   createUser;
	   private String   createTime;
	   private String   updateUser;
}
	