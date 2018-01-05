package cn.sjzc.flour.service.impl;

import java.util.List;

import cn.sjzc.flour.dao.GrainPutDao;
import cn.sjzc.flour.pojo.GrainPut;
import cn.sjzc.flour.pojo.Voucher;
import cn.sjzc.flour.service.GrainPutService;

public class GrainPutServicelmpl implements GrainPutService {
	
	   private GrainPutDao grainputDao;
	@Override
	public void addGrainPut(GrainPut grainput) {
		// TODO Auto-generated method stub
		grainputDao.addGrainPut(grainput);
	}

	public GrainPutDao getGrainputDao() {
		return grainputDao;
	}

	public void setGrainputDao(GrainPutDao grainputDao) {
		this.grainputDao = grainputDao;
	}

	@Override
	public void addVoucher(Voucher voucher) {
		// TODO Auto-generated method stub
		grainputDao.addVoucher(voucher);
	}

	@Override
	public List<GrainPut> findAll() {
		
		return grainputDao.findAll();
	}

}
