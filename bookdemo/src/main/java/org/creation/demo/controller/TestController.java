package org.creation.demo.controller;

import java.util.Date;
import java.util.concurrent.ExecutionException;

import javax.annotation.Resource;

import org.creation.demo.entity.base.Cache;
import org.creation.demo.entity.base.mapper.CacheMapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping("/v0.1")
public class TestController {
    @Resource
    private CacheMapper cacheMapper;
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public Object demo() throws InterruptedException, ExecutionException {
		final JSONObject action = new JSONObject();
		action.put("message", "success");
		return action;
	}
	@RequestMapping(value = "/demo/cache", method = RequestMethod.GET)
    public Object cache(@RequestParam(required =false,defaultValue = "name") String name) throws InterruptedException, ExecutionException {
        final JSONObject action = new JSONObject();
        action.put("message", cacheMapper.selectByPrimaryKey(name));
        return action;
    }
	@RequestMapping(value = "/demo/cache", method = RequestMethod.POST)
    public Object cachePost(@RequestParam(required =false,defaultValue = "name") String name,@RequestBody String value) throws InterruptedException, ExecutionException {
        final JSONObject action = new JSONObject();
        Cache record = new Cache();
        record.setName(name);
        record.setValue(value);
        record.setExpireTime(new Date());
        cacheMapper.replaceSelective(record );
        action.put("message", cacheMapper.selectByPrimaryKey(name));
        return action;
    }
}
