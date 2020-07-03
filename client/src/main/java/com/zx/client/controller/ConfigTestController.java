package com.zx.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: configTestController
 * Description: ConfigTestController
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin-3@thunisoft.com
 * @version 1.0
 * date 2020/6/10 15:15
 */

@Slf4j
@RestController
@RequestMapping("/word")
public class ConfigTestController {

    @Value("${word}")
    private String word;

    @Value("${common.test}")
    private String commonWord;

    @GetMapping("/get")
    public String test() {
        log.info("获取到config中的配置文件，word:{}", word);
        log.info("获取到config中的配置文件，commonWord:{}", commonWord);
        return this.word;
    }
}
