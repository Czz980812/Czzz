package cn.kgc.service;

import cn.kgc.entity.BbsDetail;

import java.util.List;

public interface BbsDetailService {

    /**
     * 查询所有帖子
     * @param sortId 帖子类别
     * @return
     */
    public List<BbsDetail> findBbsDetail(Integer sortId);

    /**
     * 校验是否存在相同标题
     * @param title 标题
     * @return
     */
    public Boolean validationTitle(String title);

    /**
     * 添加新帖
     * @param bbsDetail 帖子内容
     * @return
     */
    public Boolean addBbsDetail(BbsDetail bbsDetail);
}
