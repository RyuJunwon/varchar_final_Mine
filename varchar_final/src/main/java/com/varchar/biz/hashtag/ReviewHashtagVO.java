package com.varchar.biz.hashtag;

public class ReviewHashtagVO {
	private int reviewHashtagNum;
	private String reviewHashtagContent;
	
	// 임시 변수
	private int itemNum;
	private String hashTagSearchCondition;
	private int hashtagNum;
	private int usageCount;

	public ReviewHashtagVO() {
		this(0,"");
	}
	public ReviewHashtagVO(int reviewHashtagNum, String reviewHashtagContent) {
		this.reviewHashtagNum = reviewHashtagNum;
		this.reviewHashtagContent = reviewHashtagContent;
	}
	
	public int getItemNum() {
		return itemNum;
	}
	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}
	public int getHashtagNum() {
		return hashtagNum;
	}
	public void setHashtagNum(int hashtagNum) {
		this.hashtagNum = hashtagNum;
	}
	public int getUsageCount() {
		return usageCount;
	}
	public void setUsageCount(int usageCount) {
		this.usageCount = usageCount;
	}
	public String getHashTagSearchCondition() {
		return hashTagSearchCondition;
	}
	public void setHashTagSearchCondition(String hashTagSearchCondition) {
		this.hashTagSearchCondition = hashTagSearchCondition;
	}
	public int getReviewHashtagNum() {
		return reviewHashtagNum;
	}
	
	public void setReviewHashtagNum(int reviewHashtagNum) {
		this.reviewHashtagNum = reviewHashtagNum;
	}
	
	public String getReviewHashtagContent() {
		return reviewHashtagContent;
	}
	
	public void setReviewHashtagContent(String reviewHashtagContent) {
		this.reviewHashtagContent = reviewHashtagContent;
	}
	
	@Override
	public String toString() {
		return "ReviewHashtagVO [reviewHashtagNum=" + reviewHashtagNum + ", reviewHashtagContent="
				+ reviewHashtagContent + ", itemNum=" + itemNum + ", hashTagSearchCondition=" + hashTagSearchCondition
				+ ", hashtagNum=" + hashtagNum + ", usageCount=" + usageCount + "]";
	}
	
	
}
