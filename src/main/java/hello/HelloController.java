package hello;

import hello.entity.ScoreItem;
import hello.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    RankService rankService;

    @RequestMapping("/getUser")
    @ResponseBody
    public ModelAndView getUserFromDatabase() {
        List<ScoreItem> list = rankService.sort();
        Map<String,Object> map = new HashMap<>();
        map.put("items",list);
        return new ModelAndView("index",map);

    }

    @RequestMapping("/search")
    public String search(@RequestParam("q") String searchKeyWord,
                         @RequestParam(required = false, value = "charset") String charset) {
        return "you are searching:" + searchKeyWord + " with charset is :" + charset;
    }

    @RequestMapping("/getRankItem")
    @ResponseBody
    public Object getItem(){
        return rankService.sort();
    }
}
