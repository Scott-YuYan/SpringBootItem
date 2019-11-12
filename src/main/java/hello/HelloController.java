package hello;

import hello.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private RankService rankService;

    @RequestMapping("/getUser")
    @ResponseBody
    public void getUserFromDatabase() {
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
