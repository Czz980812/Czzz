package cn.kgc.web;

import cn.kgc.entity.BbsDetail;
import cn.kgc.entity.BbsSort;
import cn.kgc.service.BbsDetailService;
import cn.kgc.service.BbsSortService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class BbsDetailController {

    @Reference
    private BbsDetailService bbsDetailService;
    @Reference
    private BbsSortService bbsSortService;

    /**
     * 展示帖子类别
     * @return
     */
    @GetMapping("/list")
    public List<BbsSort> findBbsSort(){
        //调用方法
        List<BbsSort> bbsSortList = bbsSortService.findBbsSort();
        return bbsSortList;
    }

    /**
     * 展示所有帖子
     * @param sortId
     * @return
     */
    @GetMapping("/show")
    public List<BbsDetail> findAll( Integer sortId){
        //调用方法查询
        List<BbsDetail> bbsDetailList = bbsDetailService.findBbsDetail(sortId);
        return bbsDetailList;
    }

    /**
     * 校验帖子标题是否重复
     * @param title
     * @return
     */
    @PostMapping("/exists")
    public Boolean validationTitle(String title){
        //调用方法
        Boolean success = bbsDetailService.validationTitle(title);
        return success;
    }

    /**
     * 添加新帖
     * @param bbsDetail
     * @return
     */
    @PutMapping("/adds")
    public Boolean addBbsDetail(BbsDetail bbsDetail){
      //调用方法
        Boolean success = bbsDetailService.addBbsDetail(bbsDetail);
        return success;
    }

}
