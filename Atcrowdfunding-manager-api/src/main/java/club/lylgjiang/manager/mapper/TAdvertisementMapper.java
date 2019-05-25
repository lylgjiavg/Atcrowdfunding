package club.lylgjiang.manager.mapper;

import club.lylgjiang.bean.pojo.TAdvertisement;
import club.lylgjiang.bean.pojo.TAdvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAdvertisementMapper {
    int countByExample(TAdvertisementExample example);

    int deleteByExample(TAdvertisementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAdvertisement record);

    int insertSelective(TAdvertisement record);

    List<TAdvertisement> selectByExample(TAdvertisementExample example);

    TAdvertisement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAdvertisement record, @Param("example") TAdvertisementExample example);

    int updateByExample(@Param("record") TAdvertisement record, @Param("example") TAdvertisementExample example);

    int updateByPrimaryKeySelective(TAdvertisement record);

    int updateByPrimaryKey(TAdvertisement record);
}