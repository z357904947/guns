package cn.stylefeng.guns.modular.dotaunderlords.controller;

import cn.stylefeng.guns.core.shiro.ShiroKit;
import cn.stylefeng.guns.modular.dotaunderlords.entity.HeroDO;
import cn.stylefeng.guns.modular.dotaunderlords.service.HeroService;
import cn.stylefeng.roses.core.base.controller.BaseController;
import cn.stylefeng.roses.core.reqres.response.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IDEA
 *
 * @author : zhoupan
 * @date : 2019/7/23 9:24
 * @info : 英雄控制器
 */
@Controller
@RequestMapping("/hero")
public class HeroController extends BaseController {

    private String PREFIX = "/modular/dota/hero/";

    @Autowired
    private HeroService heroService;
    /**
     * 跳转到英雄管理首页
     * @return
     */
    @RequestMapping
    public String index() {
        return PREFIX + "hero.html";
    }
    /**
     * 跳转到英雄添加页
     * @return
     */
    @RequestMapping("/hero_add")
    public String deptAdd() {
        return PREFIX + "hero_add.html";
    }


    /**
     * 跳转到英雄添加页
     * @return
     */
    @RequestMapping("/hero_edit")
    public String deptEdit() {
        return PREFIX + "hero_edit.html";
    }
    @RequestMapping("/add")
    public ResponseData Add(HeroDO heroDO) {
        /**
         * 设置创建用户
         */
        Long userId = ShiroKit.getUserNotNull().getId();
        heroDO.setCreatUser(userId);
        heroDO.setEmploymentCost(heroDO.getEchelon());
        this.heroService.save(heroDO);
        return ResponseData.success();
    }
    /**
     * 获取所有英雄列表
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public Object list(HeroDO hero){

        return this.heroService.findPageBySpec(hero);
    }


    /**
     * 获取指定ID英雄信息
     * @return
     */
    @RequestMapping("/getById")
    @ResponseBody
    public Object getById(String id){

        return this.heroService.getById(id);
    }

    /**
     * 更新
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object update(HeroDO heroDO){

        heroDO.setEmploymentCost(heroDO.getEchelon());
        return this.heroService.updateById(heroDO);
    }

}
