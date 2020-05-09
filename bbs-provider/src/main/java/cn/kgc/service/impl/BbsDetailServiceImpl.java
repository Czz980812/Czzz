package cn.kgc.service.impl;

import cn.kgc.entity.BbsDetail;
import cn.kgc.mapper.BbsDetailMapper;
import cn.kgc.service.BbsDetailService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@Service
public class BbsDetailServiceImpl implements BbsDetailService {

    @Autowired
    private BbsDetailMapper bbsDetailMapper;

    /**
     * 查询帖子
     * @param sortId 帖子类别
     * @return
     */
    @Override
    public List<BbsDetail> findBbsDetail(Integer sortId) {
        //创建封装条件
        Example bbsDetailExample = new Example(BbsDetail.class);
        //添加查询条件
        bbsDetailExample.and().andEqualTo("sortId",sortId);
        //降序
        bbsDetailExample.orderBy("id").desc();
        //查询
        List<BbsDetail> bbsDetailList = bbsDetailMapper.selectByExample(bbsDetailExample);
        return bbsDetailList;
    }

    /**
     * 标题是否重复
     * @param title 标题
     * @return
     */
    @Override
    public Boolean validationTitle(String title) {
        //创建封装条件
        Example bbsDetailExample = new Example(BbsDetail.class);
        //添加查询条件
        bbsDetailExample.and().andEqualTo("title",title);
        //查询结果
        return bbsDetailMapper.selectByExample(bbsDetailExample).size()>0?true:false;
    }

    /**
     * 添加
     * @param bbsDetail 帖子内容
     * @return
     */
    @Override
    public Boolean addBbsDetail(BbsDetail bbsDetail) {
        bbsDetail.setCreateDate(new Date());
        return bbsDetailMapper.insertSelective(bbsDetail)>0?true:false;
    }
}
