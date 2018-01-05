package cn.sjzc.flour.pojo;

/**
 * 
 * <p>Title: VoucherNum </p>
 * <p>Description:   凭证编号表     </p>	
 * @author author
 * @date 2017年12月28日 下午2:41:57
 */
public class VoucherNum {
	private int vouchernumId;//凭证编号表ID
	private int currno;//凭证编号
	private int voucherType;//凭证类型（1：原粮入库凭证；2：面粉领用凭证；
							//		 3：库存处理凭证； 4：原粮购置凭证；
							//		 5：产品销售凭证；6：面粉加工凭证）
	
	
	public int getVouchernumId() {
		return vouchernumId;
	}
	public void setVouchernumId(int vouchernumId) {
		this.vouchernumId = vouchernumId;
	}
	public int getCurrno() {
		return currno;
	}
	public void setCurrno(int currno) {
		this.currno = currno;
	}
	public int getVoucherType() {
		return voucherType;
	}
	public void setVoucherType(int voucherType) {
		this.voucherType = voucherType;
	}
	

}
