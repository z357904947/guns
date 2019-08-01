package cn.stylefeng.guns.dota;

import cn.stylefeng.guns.GunsApplication;
import cn.stylefeng.guns.modular.dotaunderlords.entity.HeroInfoVO;
import cn.stylefeng.guns.modular.dotaunderlords.mapper.DotaLeagueMapper;
import cn.stylefeng.guns.modular.dotaunderlords.mapper.HeroMapper;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @auther zhoupan
 * @date 2019/7/31 21:44
 * @info
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GunsApplication.class)
public class DotaLeagueMapperTest {

    @Autowired
    DotaLeagueMapper dotaLeagueMapper;
    @Autowired
    HeroMapper heroMapper;

    @Test
    public void getListByHeroId(){

        dotaLeagueMapper.getListByHeroId("1");

    }

    @Test
    public void getHeroById(){

         HeroInfoVO heroInfoVO = heroMapper.getHeroById("1");
        System.out.println(JSON.toJSONString(heroInfoVO));

    }
    @Test
    public void getList(){

        List<HeroInfoVO> heroInfos = heroMapper.getList();
        System.out.println(JSON.toJSONString(heroInfos));
    }
}
