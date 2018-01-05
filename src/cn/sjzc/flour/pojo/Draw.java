package cn.sjzc.flour.pojo;

/**
 * 
 * <p>Title: Draw </p>
 * <p>Description:  面粉领用表  </p>	
 * @author author
 * @date 2017年12月28日 下午2:37:43
 */
public class Draw {
	private int drawId;//面粉领用编号
	private int evidenceId;//凭证编号
	private float flourWeight;//领用面粉重量
	private float rate;//出粉率
	private float wheatWeight;//加工小麦重量
	private float branWeight;//麸皮重量
	private int flourType;//面粉类型
	
	
	public int getDrawId() {
		return drawId;
	}
	public void setDrawId(int drawId) {
		this.drawId = drawId;
	}
	public int getEvidenceId() {
		return evidenceId;
	}
	public void setEvidenceId(int evidenceId) {
		this.evidenceId = evidenceId;
	}
	public float getFlourWeight() {
		return flourWeight;
	}
	public void setFlourWeight(float flourWeight) {
		this.flourWeight = flourWeight;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getWheatWeight() {
		return wheatWeight;
	}
	public void setWheatWeight(float wheatWeight) {
		this.wheatWeight = wheatWeight;
	}
	public float getBranWeight() {
		return branWeight;
	}
	public void setBranWeight(float branWeight) {
		this.branWeight = branWeight;
	}
	public int getFlourType() {
		return flourType;
	}
	public void setFlourType(int flourType) {
		this.flourType = flourType;
	}
	
	
}
