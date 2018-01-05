package cn.sjzc.flour.pojo;

/**
 * 
 * <p>Title: PayOut </p>
 * <p>Description:   收入支出表 </p>	
 * @author author
 * @date 2017年12月28日 下午2:40:49
 */
public class PayOut {
	private int payId;//收支表ID
	private float pay;//收入
	private float out;//支出
	
	
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public float getPay() {
		return pay;
	}
	public void setPay(float pay) {
		this.pay = pay;
	}
	public float getOut() {
		return out;
	}
	public void setOut(float out) {
		this.out = out;
	}
	

}
