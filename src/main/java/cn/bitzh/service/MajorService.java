package cn.bitzh.service;

import java.util.List;

import cn.bitzh.model.Major;
import cn.bitzh.model.vo.DirectionChoiceVo;
import cn.bitzh.model.vo.MajorChoiceVo;

public interface MajorService extends BaseService<Major> {
	List<MajorChoiceVo> queryMajorChoiceList();

	List<MajorChoiceVo> queryMajorChoiceByWords(String word);

	Integer saveMajor(Major major);
}
