package tech.bts.counters.controller;

import com.github.jknack.handlebars.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tech.bts.counters.service.CounterService;
import tech.bts.counters.util.HandlebarsUtil;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ExamController {

    private CounterService counterService;

    @Autowired
    public ExamController(CounterService counterService) {
        this.counterService = counterService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getCounter() throws IOException {

        Template template = HandlebarsUtil.compile("exam-list");

        Map<String,Object> value = new HashMap<>();
        value.put("value",counterService.getValue());
        value.put("id",counterService.getId());
        return template.apply(value) ;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/increment")
    public void increment(HttpServletResponse response) throws IOException {

        counterService.icrement();
        response.sendRedirect("/");
    }

    public List<Integer> counters () {
        return new ArrayList<>();
    }



}
