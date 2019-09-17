package cn.bitzh.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bitzh.service.BaseService;
import tk.mybatis.mapper.common.Mapper;

@Transactional
@Service("baseService")
public abstract class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	private Mapper<T> mapper;

	@Override
	public T queryById(Integer id) {
		// TODO Auto-generated method stub
		return this.mapper.selectByPrimaryKey(id);
	}

	@Override
	public T queryStuOrTerById(String id) {
		// TODO Auto-generated method stub
		return this.mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<T> queryAll() {
		// TODO Auto-generated method stub
		return this.mapper.select(null);
	}

	@Override
	public List<T> queryListByOrders(T param) {
		// TODO Auto-generated method stub
		return this.mapper.select(param);
	}

	@Override
	public Integer queryCount(T param) {
		// TODO Auto-generated method stub
		return this.mapper.selectCount(param);
	}

	@Override
	public T queryOne(T param) {
		// TODO Auto-generated method stub
		return this.mapper.selectOne(param);
	}

	@Override
	public Integer save(T param) {
		// TODO Auto-generated method stub
		return this.mapper.insert(param);
	}

	@Override
	public Integer saveByOrders(T param) {
		// TODO Auto-generated method stub
		return this.mapper.insertSelective(param);
	}

	@Override
	public Integer modify(T param) {
		// TODO Auto-generated method stub
		return this.mapper.updateByPrimaryKey(param);
	}

	@Override
	public Integer modifyByOrders(T param) {
		// TODO Auto-generated method stub
		return this.mapper.updateByPrimaryKeySelective(param);
	}

	@Override
	public Integer removeById(Integer id) {
		// TODO Auto-generated method stub
		return this.mapper.deleteByPrimaryKey(id);
	}
}
