package club.lylgjiang.manager.mapper;

import club.lylgjiang.bean.pojo.TProjectTag;
import club.lylgjiang.bean.pojo.TProjectTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProjectTagMapper {
    int countByExample(TProjectTagExample example);

    int deleteByExample(TProjectTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TProjectTag record);

    int insertSelective(TProjectTag record);

    List<TProjectTag> selectByExample(TProjectTagExample example);

    TProjectTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TProjectTag record, @Param("example") TProjectTagExample example);

    int updateByExample(@Param("record") TProjectTag record, @Param("example") TProjectTagExample example);

    int updateByPrimaryKeySelective(TProjectTag record);

    int updateByPrimaryKey(TProjectTag record);
}