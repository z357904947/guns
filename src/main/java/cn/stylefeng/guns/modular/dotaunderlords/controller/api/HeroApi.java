package cn.stylefeng.guns.modular.dotaunderlords.controller.api;

import cn.stylefeng.guns.modular.dotaunderlords.entity.HeroDO;
import cn.stylefeng.guns.modular.dotaunderlords.mapper.HeroMapper;
import cn.stylefeng.guns.modular.dotaunderlords.service.HeroService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 *
 * @author : zhoupan
 * @date : 2019/7/30 15:09
 * @info :
 */
@RestController
@RequestMapping("/dota")
public class HeroApi {

    @Autowired
    private HeroService heroService;
    @Autowired
    private HeroMapper heroMapper;

    /**
     * 获取所有英雄列表，带联盟信息
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public Object list(){
        return this.heroMapper.getList();
    }

}
