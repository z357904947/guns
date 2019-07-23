package cn.stylefeng.guns.modular.dotaunderlords.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * Created with IDEA
 *
 * @author : zhoupan
 * @date : 2019/7/22 10:41
 * @info : 英雄联盟DO
 */
@TableName("dota_herounion")
@Data
public class HeroUnionDO {
    /**
     * id
     */
    @TableId(type= IdType.ID_WORKER)
    private Long heroUnionId;

    /**
     * 联盟名称
     */
    private String unionName;





}
