package cn.bitzh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bitzh.model.MajorDirectionTrainingItem;
import cn.bitzh.model.vo.MajorDirectionTrainingItemVo;
import tk.mybatis.mapper.common.Mapper;

public interface MajorDirectionTrainingItemMapper extends Mapper<MajorDirectionTrainingItem> {
	Integer insertTrainingItemByMajor(@Param("majorId") Integer majorId, @Param("trainingId") Integer trainingId);

	Integer insertTrainingItemByDirection(@Param("majorId") Integer majorId, @Param("directionId") Integer directionId,
			@Param("trainingId") Integer trainingId);

	List<Integer> selectIdList(MajorDirectionTrainingItemVo majorDirectionTrainingItemVo);
}
