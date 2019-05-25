package club.lylgjiang.manager.mapper;

import club.lylgjiang.bean.pojo.TDictionary;
import club.lylgjiang.bean.pojo.TDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDictionaryMapper {
    int countByExample(TDictionaryExample example);

    int deleteByExample(TDictionaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDictionary record);

    int insertSelective(TDictionary record);

    List<TDictionary> selectByExample(TDictionaryExample example);

    TDictionary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDictionary record, @Param("example") TDictionaryExample example);

    int updateByExample(@Param("record") TDictionary record, @Param("example") TDictionaryExample example);

    int updateByPrimaryKeySelective(TDictionary record);

    int updateByPrimaryKey(TDictionary record);
}