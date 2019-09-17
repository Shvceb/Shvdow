package cn.bitzh.service;

import java.util.List;

public interface BaseService<T> {
	T queryById(Integer id);

	T queryStuOrTerById(String id);

	List<T> queryAll();

	List<T> queryListByOrders(T param);

	Integer queryCount(T param);

	T queryOne(T param);

	Integer save(T param);

	Integer saveByOrders(T param);

	Integer modify(T param);

	Integer modifyByOrders(T param);

	Integer removeById(Integer id);

}
