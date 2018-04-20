package src.main.dao;

import src.main.domain.WarningRecord;

public interface WarningRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WarningRecord record);

    int insertSelective(WarningRecord record);

    WarningRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WarningRecord record);

    int updateByPrimaryKeyWithBLOBs(WarningRecord record);

    int updateByPrimaryKey(WarningRecord record);
}