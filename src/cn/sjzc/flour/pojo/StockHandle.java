package cn.sjzc.flour.pojo;

/**
 * 
 * <p>Title: StockHandle </p>
 * <p>Description: ��洦���   </p>	
 * @author author
 * @date 2017��12��28�� ����2:38:14
 */
public class StockHandle {
	private int stockId;//��洦����
	private int evidenceId;//ƾ֤���
	private String typeName;//��Ʒ����
	private float handleWeight;//��������
	private int method;//��������1�����⣻2���չ���
	
	
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public int getEvidenceId() {
		return evidenceId;
	}
	public void setEvidenceId(int evidenceId) {
		this.evidenceId = evidenceId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public float getHandleWeight() {
		return handleWeight;
	}
	public void setHandleWeight(float handleWeight) {
		this.handleWeight = handleWeight;
	}
	public int getMethod() {
		return method;
	}
	public void setMethod(int method) {
		this.method = method;
	}
	

}
