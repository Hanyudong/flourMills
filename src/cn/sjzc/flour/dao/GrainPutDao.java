package cn.sjzc.flour.dao;

import java.util.List;

import cn.sjzc.flour.pojo.GrainPut;
import cn.sjzc.flour.pojo.Voucher;

public interface GrainPutDao {
	public void addGrainPut(GrainPut grainput);
	public void addVoucher(Voucher voucher);
	public List<GrainPut> findAll();
}
