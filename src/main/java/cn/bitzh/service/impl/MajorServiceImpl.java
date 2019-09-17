package cn.bitzh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bitzh.dao.MajorDirectionTrainingItemMapper;
import cn.bitzh.dao.MajorMapper;
import cn.bitzh.dao.TrainingMajorCreditItemMapper;
import cn.bitzh.model.Major;
import cn.bitzh.model.vo.MajorChoiceVo;
import cn.bitzh.service.MajorService;

@Transactional
@Service("majorService")
public class MajorServiceImpl extends BaseServiceImpl<Major> implements MajorService {

	@Autowired
	private MajorMapper majorMapper;
	@Autowired
	private MajorDirectionTrainingItemMapper majorDirectionTrainingItemMapper;
	@Autowired
	private TrainingMajorCreditItemMapper trainingMajorCreditItemMapper;

	@Override
	public List<MajorChoiceVo> queryMajorChoiceList() {
		// TODO Auto-generated method stub
		return majorMapper.selectMajorChoiceList();
	}

	@Override
	public List<MajorChoiceVo> queryMajorChoiceByWords(String word) {
		// TODO Auto-generated method stub
		return majorMapper.selectMajorChoiceByWords(word);
	}

	@Override
	public Integer saveMajor(Major major) {
		// TODO Auto-generated method stub
		int count1 = 0;
		int count = majorMapper.insert(major);
		if (count > 0) {
			int id = major.getId();
			for (int i = 1; i <= 7; i++) {
				majorDirectionTrainingItemMapper.insertTrainingItemByMajor(id, i);
				count1++;
				trainingMajorCreditItemMapper.insertTrainingMajorCreditItem(id, i);
				count1++;
			}
			return count1;
		} else {
			return count;
		}
	}

}
