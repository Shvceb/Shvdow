package cn.bitzh.service;

import java.util.List;

import cn.bitzh.model.ChangeMajor;

public interface ChangeMajorService extends BaseService<ChangeMajor> {
	List<ChangeMajor> queryChangeMajorToCheck();

	List<ChangeMajor> queryChangeMajorCheckHistory();

	List<ChangeMajor> queryChangeMajorListByStudentId(String studentId);
}
