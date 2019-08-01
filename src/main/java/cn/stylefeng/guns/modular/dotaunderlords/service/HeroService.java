package cn.stylefeng.guns.modular.dotaunderlords.service;


import cn.stylefeng.guns.core.common.page.LayuiPageFactory;
import cn.stylefeng.guns.core.common.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.dotaunderlords.entity.HeroDO;
import cn.stylefeng.guns.modular.dotaunderlords.mapper.HeroMapper;
import cn.stylefeng.roses.core.util.ToolUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Optional;


/**
 * Created with IDEA
 *
 * @author : zhoupan
 * @date : 2019/7/23 13:44
 * @info : 英雄服务类
 */
@Service
public class HeroService extends ServiceImpl<HeroMapper, HeroDO> {

    /**
     * 后台管理-英雄列表的分页方法
     * @param heroDO
     * @return
     */
    public LayuiPageInfo findPageBySpec(HeroDO heroDO){

        Page pageContext = LayuiPageFactory.defaultPage();
        QueryWrapper<HeroDO> objectQueryWrapper = new QueryWrapper<>();
        if (ToolUtil.isNotEmpty(heroDO.getCnName())) {
            objectQueryWrapper.or(i -> i.like("cn_name", heroDO.getCnName()));
        }
        if (ToolUtil.isNotEmpty(heroDO.getEnName())) {
            objectQueryWrapper.or(i -> i.like("en_name", heroDO.getEnName()));
        }
        pageContext.setAsc("en_name");

        IPage page = this.page(pageContext, objectQueryWrapper);
        return LayuiPageFactory.createPageInfo(page);
    }



}
