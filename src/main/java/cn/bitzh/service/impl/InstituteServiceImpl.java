package cn.bitzh.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bitzh.model.Institute;
import cn.bitzh.service.InstituteService;

@Transactional
@Service("instituteService")
public class InstituteServiceImpl extends BaseServiceImpl<Institute> implements InstituteService {
}
