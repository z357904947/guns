package cn.stylefeng.guns.modular.dotaunderlords.controller;

import cn.stylefeng.guns.modular.dotaunderlords.entity.HeroDO;
import cn.stylefeng.guns.modular.dotaunderlords.service.HeroService;
import cn.stylefeng.roses.core.base.controller.BaseController;
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
    @RequestMapping("/hero_add")
    public String Add() {
        return PREFIX + "hero_add.html";
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


}
