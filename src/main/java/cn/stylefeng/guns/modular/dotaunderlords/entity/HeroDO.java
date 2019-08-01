package cn.stylefeng.guns.modular.dotaunderlords.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;



/**
 * Created with IDEA
 *
 * @author : zhoupan
 * @date : 2019/7/22 10:11
 * @info : 英雄实体
 */
@Data
@TableName("dota_hero")
public class HeroDO {
    /**
     * ID
     */
    @TableId(type= IdType.ID_WORKER)
    private Long heroId;
    /**
     * 中文名
     */
    private String cnName;
    /**
     * 英文
     */
    private String enName;
    /**
     * 别名，玩家简称的名字
     */
    private String alias;
    /**
     * 头像图片地址
     */
    private String headImgUrl;
    /**
     * 梯队
     */
    private Integer echelon;
    /**
     * 雇佣费用&棋子价格
     */
    private Integer employmentCost;
    /**
     * 创建者
     */
    @TableField(fill = FieldFill.INSERT)
    private Long  creatUser;


}
