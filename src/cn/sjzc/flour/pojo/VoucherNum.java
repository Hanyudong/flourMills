package cn.sjzc.flour.pojo;

/**
 * 
 * <p>Title: VoucherNum </p>
 * <p>Description:   ƾ֤��ű�     </p>	
 * @author author
 * @date 2017��12��28�� ����2:41:57
 */
public class VoucherNum {
	private int vouchernumId;//ƾ֤��ű�ID
	private int currno;//ƾ֤���
	private int voucherType;//ƾ֤���ͣ�1��ԭ�����ƾ֤��2���������ƾ֤��
							//		 3����洦��ƾ֤�� 4��ԭ������ƾ֤��
							//		 5����Ʒ����ƾ֤��6����ۼӹ�ƾ֤��
	
	
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
