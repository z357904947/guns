package cn.stylefeng.guns.modular.dotaunderlords.entity;

import lombok.Data;

import java.util.List;

/**
 * 英雄详细信息，包括了所属联盟
 * @auther zhoupan
 * @date 2019/7/31 21:51
 * @info
 */
@Data
public class HeroInfoVO extends HeroDO {

    private List<DotaLeague> leagues;
}
