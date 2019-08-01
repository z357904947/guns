package cn.stylefeng.guns.modular.dotaunderlords.mapper;

import cn.stylefeng.guns.modular.dotaunderlords.entity.HeroDO;
import cn.stylefeng.guns.modular.dotaunderlords.entity.HeroInfoVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author : zhoupan
 * @date : 2019/7/23 11:53
 * @info : 英雄表mapper接口
 */
public interface HeroMapper extends BaseMapper<HeroDO> {

    /**
     * 通过ID查询英雄
     * @param heroId
     * @return
     */
    @Select("select * from dota_hero where hero_id =#{heroId}")
    @Results({
            @Result(column="hero_id",property="heroId"),
            @Result(column="hero_id",property="leagues",
                    many=@Many(
                            select="cn.stylefeng.guns.modular.dotaunderlords.mapper.DotaLeagueMapper.getListByHeroId"
                    )
            )
    })

    HeroInfoVO getHeroById(String heroId);


    /**
     * 通过条件查询英雄
     * @param wrapper 查询条件
     * @return
     */
    @Select("select * from dota_hero ${ew.sqlSegment} ")
    @Results({
            @Result(column="hero_id",property="heroId"),
            @Result(column="hero_id",property="leagues",
                    many=@Many(
                            select="cn.stylefeng.guns.modular.dotaunderlords.mapper.DotaLeagueMapper.getListByHeroId"
                    )
            )
    })
    List<HeroInfoVO> getListByQY(@Param("ew") QueryWrapper wrapper);

    /**
     * 查询全部英雄，并关联联盟信息
     * @return
     */
    @Select("select * from dota_hero  ")
    @Results({
            @Result(column="hero_id",property="heroId"),
            @Result(column="hero_id",property="leagues",
                    many=@Many(
                            select="cn.stylefeng.guns.modular.dotaunderlords.mapper.DotaLeagueMapper.getListByHeroId"
                    )
            )
    })
    List<HeroInfoVO> getList();
}
