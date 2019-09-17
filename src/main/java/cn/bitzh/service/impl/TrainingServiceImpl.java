package cn.bitzh.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bitzh.model.Training;
import cn.bitzh.service.TrainingService;

@Transactional
@Service("trainingService")
public class TrainingServiceImpl extends BaseServiceImpl<Training> implements TrainingService {

}
